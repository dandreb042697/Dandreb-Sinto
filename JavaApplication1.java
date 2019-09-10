import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        double Netpay,Add,FItax= 0.15,FItax2,Stax=  0.035,Stax2,SStax= 0.0575,SStax2,
                MMtax= 0.0275,MMtax2,PPlan= 0.05,PPlan2,HInsurance= 75;

        System.out.println("Input Employee Name:");
        String employee = input.nextLine();
        System.out.println("Gross Amount"); 
        double gross = input.nextDouble();

       
       FItax2= gross*FItax;
       Stax2=  gross*Stax;
       SStax2= gross*SStax;
       MMtax2= gross*MMtax;
       PPlan2= gross*PPlan;    
       Netpay= FItax2+Stax2+SStax2+MMtax2+PPlan2+HInsurance;
       Add = gross-Netpay;
       
        System.out.println("Name:"+employee);
        System.out.printf("Gross Amount:$%.2f", gross);
        System.out.println("");
        System.out.println("Federal Tax:$"+FItax2);
        System.out.printf("State Tax:$%.2f",Stax2);  
        System.out.println("");
        System.out.printf("Social Security Tax:$%.2f",SStax2);
        System.out.println("");
        System.out.printf("Medicare/Medicaid Tax:$%.2f",MMtax2);
        System.out.println("");
        System.out.println("Pension Plan:$"+PPlan2);
        System.out.println("");
        System.out.printf("Health Insurance:$%.2f",HInsurance);
        System.out.println("");
        System.out.printf("Net Pay:$%.2f",Add);
       
    }
    
}
