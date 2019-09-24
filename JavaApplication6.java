import java.util.Scanner;
public class JavaApplication6 {

    public static void main(String[] args) {
    Scanner dan = new Scanner(System.in);
        System.out.println("Enter a three-digit integer:");
        int pal_num = dan.nextInt();
        
        
        int first_num = pal_num/100;
        int last_num = pal_num%10;
        
        
        if (first_num == last_num){
            System.out.println(pal_num+ " is a palindrome");
        }
        else{
            System.out.println(pal_num+ " is not a palindrome");
        }
        
    
    }
    
}
