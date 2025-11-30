import java.util.Scanner;

class EligibilityChecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gpa: ");
        double gpa = sc.nextDouble();
        System.out.println("Enter attendance %: ");
        double attendance = sc.nextDouble();
        System.out.println("Enter attitude Score: ");
        int attitude = sc.nextInt();
        
        if(gpa >= 3.2){
            if(attendance > 80){
                if(attitude > 5){
                    System.out.println("Student is eligible for a scholarship");
                }
                
            }
        }
        else{
            System.out.println("Student is not eligible for a Scholarship");
        }
    }
}