import java.util.Scanner;
public class JavaApplication1 {

    public static void main(String[] args) {
      Scanner dan = new Scanner(System.in);
      
        System.out.println("Answer each of the following questions with a number from 1 to 5 such that 1 means NEVER and 5 means ALWAYS");
        System.out.print("1. I am competitive:");
        int num1 = dan.nextInt();
        System.out.print("2. I am annoyed by people who are late for appointments:");
        int num2 = dan.nextInt();
        System.out.print("3. I perform several tasks simultaneously:");
        int num3 = dan.nextInt();
        System.out.print("4. I am ambitious:");
        int num4 = dan.nextInt();
        System.out.print("5. I rush to get tasks completed:");
        int num5 = dan.nextInt();
        System.out.print("6. I worry about the future:");
        int num6 = dan.nextInt();
        System.out.print("7. I am in a race with time:");
        int num7 = dan.nextInt();
        System.out.print("8. I speak very rapidly:");
        int num8 = dan.nextInt();
        
        int score = num1+num2+num3+num4+num5+num6+num7+num8;
        
        System.out.println("Score:"+score);
        
        
        if (score <12){
        System.out.println("Type B");
    }
        else if (score<21){
        System.out.println("Between A and B, tending towards B");
        }
        else if (score<35){
        System.out.println("Between A and B, tending towards A");
        }
        else if (score<41){
        System.out.println("Type A ");
        }
    }
    
}
