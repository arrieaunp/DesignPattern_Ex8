public class RemoteControl {
    private Command[] commands;

    public RemoteControl() {
        commands = new Command[5]; 
    }

    public void setCommand(int slot, Command command) {
        if (slot >= 0 && slot < 5) {
            commands[slot] = command;
        } else {
            System.out.println("Invalid slot number");
        }
    }

    public void pressButtonOn(int slot) {
        if (slot >= 0 && slot < 5) {
            if (commands[slot] != null) {
                commands[slot].execute();
            }else {
                System.out.println("On button No command is assigned to this slot");
            }
        } 
        else {
            System.out.println("Invalid slot number");
        }
    }

    public void pressButtonOff(int slot) {
        if (slot >= 0 && slot < 5) {
            if (commands[slot] != null) {
                commands[slot].execute();
            }else {
                System.out.println("Off button No command is assigned to this slot");
            }
        } 
        else {
            System.out.println("Invalid slot number");
        }
    }
}
