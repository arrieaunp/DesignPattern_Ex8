public class Main {
    public static void main(String[] args) {
       Light bedRoomLight = new Light("Bed Room");
        Light kitchenLight = new Light("Kitchen");
        Airconditioner bedRoomAC = new Airconditioner("Bed Room");

        Command lightBedRoomOn = new Light_On(bedRoomLight);
        Command lightBedRoomOff = new Light_Off(bedRoomLight);
        Command lightKitchenOn = new Light_On(kitchenLight);
        Command lightKitchenOff = new Light_Off(kitchenLight);
        Command acBedRoomOn = new Airconditioner_On(bedRoomAC);
        Command acBedRoomOff = new Airconditioner_Off(bedRoomAC);

        RemoteControl remote = new RemoteControl();
        
        System.out.println("slot 0, light Bed Room");
        remote.setCommand(0, lightBedRoomOn);
        remote.pressButtonOn(0);
        remote.setCommand(0, lightBedRoomOff); 
        remote.pressButtonOff(0);
        System.out.println("--------------------------------");

        System.out.println("slot 1, light Kitchen");
        remote.setCommand(1, lightKitchenOn);
        remote.pressButtonOn(1);
        remote.setCommand(1, lightKitchenOff); 
        remote.pressButtonOff(1);
        System.out.println("--------------------------------");
        
        System.out.println("slot 2, AC Bed Room");
        remote.setCommand(2, acBedRoomOn);
        remote.pressButtonOn(2);
        remote.setCommand(2, acBedRoomOff); 
        remote.pressButtonOff(2);
        System.out.println("--------------------------------");

        System.out.println("test one unavailable slot, slot 3");
        remote.pressButtonOn(3);
        remote.pressButtonOff(3);
        System.out.println("--------------------------------");
    }
    
}
