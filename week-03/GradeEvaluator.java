import java.util.Scanner;
public class GradeEvaluator
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the grade");
        double grade =sc.nextDouble();
        
        String result= (grade>=40) ? "pass" : "fail";
        //output with escape sequence
        System.out.println("\n\t------ Grade Evaluation Report ------");
        System.out.println("\tGrade Entered: "+ grade);
        System.out.println("\tResult: "+ result + "\n");
    
    }
}