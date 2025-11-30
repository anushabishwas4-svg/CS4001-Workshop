import java.util.Scanner;

class GradeConversion{
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the gpa (0.0-4.0): ");
      double gpa=sc.nextDouble();
      
      if(gpa < 0.0 || gpa > 4.0){
          System.out.println("Please enter the valid gpa.");
        return;
    }
    String grade = " ";
     if(gpa >= 3.6){
        grade = "A";
    }
    else if(gpa >= 3.2){
        grade = "B";
    }
    else if(gpa >= 2.4){
        grade = "C";
    }
    else if(gpa >= 1.6){
        grade = "D";
    }
    else{
        grade = "F";
    }
    System.out.println("Your grade is: " + grade);
}
} 


