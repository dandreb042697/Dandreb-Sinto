import java.util.Scanner;
public class SintoGrades {
    public static void main(String[] Args){
        Scanner dan = new Scanner(System.in);
        System.out.print("Input Grades: ");
        int grades = dan.nextInt();
        
        if (grades <= 74){
            System.out.println("Poor");
        }
        else if (grades <= 79){
            System.out.println("Needs Improvement");
        }
        else if (grades <= 84){
            System.out.println("Approching");
        }
        else if (grades <= 94){
            System.out.println("Good");
        }
        else if (grades <=100){
            System.out.println("Excellent");
        }
            else {
                    System.out.println("Invalid Grades");
            }
    }
        
}
