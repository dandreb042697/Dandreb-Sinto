import java.util.Scanner;
public class JavaApplication7 {

    public static void main(String[] args) {
      Scanner dan = new Scanner(System.in);
        System.out.println("Enter today's day:");
        int today = dan.nextInt();
        System.out.println("Enter the number of days elapsed since today:");
        int elapsed = dan.nextInt();
        
        int future = today+elapsed;
         if (future > 7){
        future %=7;   
        }
        if (today == 0){
            System.out.print("Today is Sunday");
         
            switch (future){
                case 1: System.out.println("and the future is Monday");break;
                case 2: System.out.println("and the future is Tuesday");break;
                case 3: System.out.println("and the future is Wednesday");break;
                case 4: System.out.println("and the future is Thursday");break;
                case 5: System.out.println("and the future is Friday");break;
                case 6: System.out.println("and the future is Saturday");break;
                case 7: System.out.println("and the future is Sunday");break;
                default :System.out.println("and the future is Sunday");  
              }
         }
        else if (today == 1){
                System.out.println("Today is Monday ");
            switch (future){
                case 1: System.out.print("and the future is Monday");break;
                case 2: System.out.print("and the future is Tuesday");break;
                case 3: System.out.print("and the future is Wednesday");break;
                case 4: System.out.print("and the future is Thursday");break;
                case 5: System.out.print("and the future is Friday");break;
                case 6: System.out.print("and the future is Saturday");break;
                case 7: System.out.print("and the future is Sunday");break;
                default:System.out.print("and the future is Monday");  
              }
          }
         else if (today == 2){
                System.out.println("Today is Tuesday ");
            switch (future){
                case 1: System.out.print("and the future is Monday");break;
                case 2: System.out.print("and the future is Tuesday");break;
                case 3: System.out.print("and the future is Wednesday");break;
                case 4: System.out.print("and the future is Thursday");break;
                case 5: System.out.print("and the future is Friday");break;
                case 6: System.out.print("and the future is Saturday");break;
                case 7: System.out.print("and the future is Sunday");break;
                default:System.out.print("and the future is Tuesday");  
              }
          }
         else if (today == 3){
                System.out.println("Today is Wednesday ");
            switch (future){
                case 1: System.out.println("and the future is Monday");break;
                case 2: System.out.println("and the future is Tuesday");break;
                case 3: System.out.println("and the future is Wednesday");break;
                case 4: System.out.println("and the future is Thursday");break;
                case 5: System.out.println("and the future is Friday");break;
                case 6: System.out.println("and the future is Saturday");break;
                case 7: System.out.println("and the future is Sunday");break;
                default:System.out.println("and the future is Wednesday");  
              }
          }
         else if (today == 4){
                System.out.println("Today is Thursday");
            switch (future){
                case 1: System.out.println("and the future is Monday");break;
                case 2: System.out.println("and the future is Tuesday");break;
                case 3: System.out.println("and the future is Wednesday");break;
                case 4: System.out.println("and the future is Thursday");break;
                case 5: System.out.println("and the future is Friday");break;
                case 6: System.out.println("and the future is Saturday");break;
                case 7: System.out.println("and the future is Sunday");break;
                default:System.out.println("and the future is Thursday");   
              }
          }
         else if (today == 5){
                System.out.println("Today is Friday ");
            switch (future){
                case 1: System.out.println("and the future is Monday");break;
                case 2: System.out.println("and the future is Tuesday");break;
                case 3: System.out.println("and the future is Wednesday");break;
                case 4: System.out.println("and the future is Thursday");break;
                case 5: System.out.println("and the future is Friday");break;
                case 6: System.out.println("and the future is Saturday");break;
                case 7: System.out.println("and the future is Sunday");break;
                default:System.out.println("and the future is Friday");  
              }
          }
         else if (today == 6){
                System.out.println("Today is Saturday ");
            switch (future){
                case 1: System.out.println("and the future is Monday");break;
                case 2: System.out.println("and the future is Tuesday");break;
                case 3: System.out.println("and the future is Wednesday");break;
                case 4: System.out.println("and the future is Thursday");break;
                case 5: System.out.println("and the future is Friday");break;
                case 6: System.out.println("and the future is Saturday");break;
                case 7: System.out.println("and the future is Sunday");break;
                default:System.out.println("and the future is Saturday");  
              }
          }
    }
    
}
