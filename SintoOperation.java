import java.util.Scanner;
public class SintoOperation {
  public static void main (String[]args){
        Scanner dan = new Scanner(System.in);
        int firstnum,secondnum,answer,remainder;
        System.out.println("Enter First number: ");
            firstnum = dan.nextInt();
        System.out.println("Enter Second number: ");
        secondnum = dan.nextInt();
        if (firstnum < secondnum){
            answer = firstnum * secondnum;
            System.out.println("the first number is lesser than the second,please multiply.");
            System.out.println("the product is: "+answer);
        }
        else if (firstnum > secondnum){
            answer = firstnum / secondnum;
            remainder = firstnum % secondnum;
            System.out.println("The 1st number is greater than the 2nd, please divide.");
            System.out.println("The quotient is: "+answer);
            System.out.println("The remainder is: "+remainder);
        }
        else{
            answer = firstnum + secondnum;
            System.out.println("The two numbers are equal, please add.");
            System.out.print("The sum is: "+answer);
        }
       
    }   
}

