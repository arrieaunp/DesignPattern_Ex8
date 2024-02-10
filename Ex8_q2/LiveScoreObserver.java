import java.util.Scanner;

public class LiveScoreObserver {

    public static void main(String[] args) {
       Reporter obj = new Reporter();

       Subscriber obj1 = new Subscriber();
       Subscriber obj2 = new Subscriber();

       obj.addObserver(obj1);
       obj.addObserver(obj2);

       Scanner sc = new Scanner(System.in);
       String scoreLine;
       System.out.print("Enter Score ");
       scoreLine = sc.nextLine();
       
       while(!scoreLine.equals("")) {
           obj.setScoreLine(scoreLine);
           System.out.print("Enter Score ");
           scoreLine = sc.nextLine();
       }
    }
}
    
