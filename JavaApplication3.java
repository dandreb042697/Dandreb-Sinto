import java.util.Scanner;
public class JavaApplication3 {

 
    public static void main(String[] args) {
       Scanner dan = new Scanner(System.in);
       double cost,distance,miles_gallon,price_gallon;
       
        System.out.println("Enter the driving distance:");
        distance = dan.nextDouble();
        System.out.println("Enter miles per gallon:");
        miles_gallon = dan.nextDouble();
        System.out.println("Enter price per gallon:");
        price_gallon = dan.nextDouble();
        
        cost = (distance/miles_gallon)*price_gallon;
        System.out.printf("The cost of driving:$%.2f",cost);
        System.out.println("");
    }
    
}
