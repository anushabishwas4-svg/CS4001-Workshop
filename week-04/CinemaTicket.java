import java.util.Scanner;
class CinemaTicket{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your age group (child/adult/senior): ");
        String ageGroup = sc.nextLine().toLowerCase();
        
        System.out.println("Enter movie language (nepali/hindi/english): ");
        String language = sc.nextLine().toLowerCase();
        
        System.out.println("Are you a student? (yes/no): ");
        String studentInput = sc.nextLine().toLowerCase();
        boolean isStudent = studentInput.equals("yes");
        
        System.out.println("Is it a festival day? (yes/no): ");
        String festivalInput = sc.nextLine().toLowerCase();
        boolean isFestival = festivalInput.equals("yes");
        
        double price = 0;
        
        if (ageGroup.equals("child")) {
            price = 150;
        }
        else if (ageGroup.equals("adult")) {
            price = 250;
        }
        else if (ageGroup.equals("senior")) {
            price = 200;
        }
        else {
            System.out.println("Invalid age group entered!");
            
            return;
        }
        if (language.equals("hindi")) {
            price += 50;
        }
        else if (language.equals("english")) {
            price += 100;
        }
        else if (language.equals("nepali")) {
            
        } 
        else {
            System.out.println("Invalid movie language entered!");
           
            return;
        }
        if (isStudent) {
            price = price * 0.80; 
        }
        if (isFestival) {
            price = price * 0.85; 
        }
        System.out.println("Final Ticket Price: Rs. " + price);

    }
  
}