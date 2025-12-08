import java.util.Scanner;

public class FixedDepositNIB{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        boolean continueCalc = true;
        
        while(continueCalc){
            //Input deposit amount
            System.out.print("Enter deposit amount (min Rs.1000): ");
            double principal = sc.nextDouble();
            if(principal < 1000){
                System.out.println("Error: Minimum deposit is Rs.1000");
                continue;
            }
        //Input duration in years
        System.out.print("Enter duration in years (max 5): ");
        int years = sc.nextInt();
        if(years<=0 || years>5){
            System.out.println("Error: Duration must be between 1 and 5 years");
            continue;
        }
        //Input interest rate
        System.out.print("Enter annual interest rate (8-12)%: ");
        double rate = sc.nextDouble();
        if(rate <8 || rate > 12){
            System.out.println("Error: Interest rate must be between 8% and 12%.");
            continue;
        }
        //Monthly compound interest calculation
        int months = years * 12;
        double monthlyRate = rate / 100 / 12;
        double maturityAmount = principal * Math.pow(1+ monthlyRate,months);
        
        //Deduct 0.5% processing fee
        double fee = 0.005 * maturityAmount;
        double finalAmount = maturityAmount - fee;
        
       //Display results
       System.out.printf("Principal: Rs. %.2f%n", principal);
       System.out.printf("Duration: %d years (%d months)%n", years, months);
       System.out.printf("Rate: %.2f%%%n", rate);
       System.out.printf("Maturity Amount (before fee): Rs. %.2f%n", maturityAmount);
       System.out.printf("Processing Fee (0.5%%): Rs. %.2f%n", fee);
       System.out.printf("Final Amount (after fee): Rs. %.2f%n", finalAmount);
       
       //Ask if user wants another calculation
       System.out.print("Do you want to calculate another Fixed Deposit? (yes/No): ");
       String choice = sc.next();
       if(choice.equalsIgnoreCase("no")){
           continueCalc = false;
           System.out.println("Thank you for using FixedDepositNIB!");
       }
    
    }
    
}
}