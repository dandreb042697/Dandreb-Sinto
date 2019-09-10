import java.util.Scanner;
public class JavaApplication2 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
       
        System.out.println("Enter 1st Number");
        n1=input.nextInt();
        System.out.println("Enter 2nd Number");
        n2=input.nextInt();
        System.out.println("Enter 3rd Number");
        n3=input.nextInt();
        System.out.println("Enter 4th Number");
        n4=input.nextInt();
        System.out.println("Enter 5th Number");
        n5=input.nextInt();
        System.out.println("Enter 6th Number");
        n6=input.nextInt();
        System.out.println("Enter 7th Number");
        n7=input.nextInt();
        System.out.println("Enter 8th Number");
        n8=input.nextInt();
        System.out.println("Enter 9th Number");
        n9=input.nextInt();
        System.out.println("Enter 10th Number");
        n10=input.nextInt();
        
        int run2 = n1+n2;
        int run3 = run2+n3;
        int run4 = run3+n4;
        int run5 = run4+n5;
        int run6 = run5+n6;
        int run7 = run6+n7;
        int run8 = run7+n8;
        int run9 =run8+n9;
        int run10 =run9+n10;
        
        System.out.println("Running Sum : "+n1+" "+run2+" "+" "+run3+" "+" "+run4+" "+" "+run5+" "+" "+run6+" "+" "+run7+" "+" "+run8+" "+" "+run9+" "+" "+run10);
    }
    
}
