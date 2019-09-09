/*Dandreb Sinto
Computer Science*/
import java.util.Scanner;
public class Sinto {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      
        System.out.println("*********     ***       *        *");
        System.out.println("*       *   *     *    ***      * *");
        System.out.println("*       *  *       *  *****    *   *");
        System.out.println("*       *  *       *    *     *     *");
        System.out.println("*       *  *       *    *    *       *");
        System.out.println("*       *  *       *    *     *     *");
        System.out.println("*       *  *       *    *      *   *");
        System.out.println("*       *   *     *     *       * *");
        System.out.println("*********     ***       *        *");
        
        float price,pizza,toppings,price2,price3;
        System.out.println("Enter the number of pizzas:");
        pizza = input.nextFloat();
        System.out.println("Enter the total number of toppings:");
        toppings = input.nextFloat();
        //Computing
        price = pizza*12.00f+toppings*1.50f;
        price2= price*0.05f;
        price3= price+price2;
        //Display
        System.out.printf("Receipt: Number of Pizzas:%.0f",pizza);
        System.out.println("");
        System.out.printf("Number of Toppings:%.0f",toppings);
        System.out.println("");
        System.out.println("Cost (incl tax):"+price3);
    }
    
}
