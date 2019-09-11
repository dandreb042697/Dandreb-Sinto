import java.util.Scanner;
public class JavaApplication2 {


    public static void main(String[] args) {
        Scanner dan = new Scanner(System.in);
        System.out.print("Enter time in seconds :");
   int sec = dan.nextInt(); 
   int p1 = sec% 60;
   int p2 = sec/ 60;
   int p3 = p2 % 60;
   p2 = p2 / 60;
  System.out.println( "Time is "+p2 + " hour " + p3 + " minutes " + p1 +"seconds");
    }
        
}
