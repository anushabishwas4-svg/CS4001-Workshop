import java.util.Scanner;
class ClassRoutine{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Day Name: ");
        String day = sc.nextLine().trim();
        switch(day){
            case "Sunday":
                System.out.println("            Routine            ");
                System.out.println("________________________________________________________________________");
                System.out.println("AT ING Block: LT-07 Innovate Tech, Level-2");
                System.out.println("08:00AM -9:30AM | Computer Hardware and Software Architecture | Lecture");
                System.out.println("10:30AM-12:00PM | Programming | Lecture");
                break;
            case "Monday":
                System.out.println("            Routine            ");
                System.out.println("________________________________________________________________________");
                System.out.println("AT UK Block: LT-01 Guildhall, Level-2");
                System.out.println("12:30PM-2:00PM | Introduction to Information System | Lecture");
                System.out.println("2:30PM-4:00PM | Logic and Problem Solving | Lecture");
                break;
            case "Tuesday":
                System.out.println("            Routine            ");
                System.out.println("________________________________________________________________________");
                System.out.println("AT Tower Block: TR-04 Sunkoshi, Level-2");
                System.out.println("12:30PM-2:00PM | Logic and Problem Solving | Tutorial");
                System.out.println("2:30PM-4:00PM | Computer Hardware and Software Architecture | Tutorial");
                break;
            case "Wednesday":
                System.out.println("            Routine            ");
                System.out.println("________________________________________________________________________");
                System.out.println("AT Tower Block, Level-4");
                System.out.println("12:30PM-2:00PM | Programming | Tutorial at TR-10 Rara");
                System.out.println("2:30PM-4:00PM | Computer Hardware and Software Architecture | Workshop at TR-11 Phewa");
                break;
            case "Thursday":
                System.out.println("            Routine            ");
                System.out.println("________________________________________________________________________");
                System.out.println("AT Tower Block, Level-4");
                System.out.println("8:00AM-9:30AM | Introduction to Information System | Tutorial at TR-07 Begnas");
                System.out.println("10:30AM-12:00PM | Programming | Workshop at Lab-03 Gosaikunda");
                break;
            case "Friday":
                System.out.println("            Routine            ");
                System.out.println("________________________________________________________________________");
                System.out.println("8:00AM-9:30AM | Logic and Problem Solving | Workshop at TR-07 Begnas");
                System.out.println("10:30AM-12:00PM | Introduction to Information System | Workshop at Lab-03 Gosaikunda");
                break;
            default:
                System.out.println("Error: Invalid entry. Please input a valid day name");
            
        }
            
    }
}