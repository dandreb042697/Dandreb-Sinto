import java.util.Scanner;
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner dan = new Scanner(System.in);
        
        System.out.print("Enter three numbers:");
        int number1 = dan.nextInt();
        int number2 = dan.nextInt();
        int number3 = dan.nextInt();
        
        if (number1>number2&&number1>number3){
            System.out.println("Largest is "+number1);
        }
        else if (number2>number1&&number2>number3){
            System.out.println("Largest is "+number2);
        }
        else if (number3>number1&&number3>number2){
            System.out.println("Largest is "+number3);
        }
        
    }
    
}
