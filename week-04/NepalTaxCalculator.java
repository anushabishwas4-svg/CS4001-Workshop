import java.util.Scanner;

class NepalTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income in NPR: ");
        double income = sc.nextDouble();

        double tax = 0;

        if (income <= 500000) 
        {
            tax = income * 0.01; //1% of income
        }
        else if (income <= 700000) {
            tax = 5000 + (income - 500000) * 0.10; //5000 + 10% of income above 500000
        }
        else if (income <= 1000000) {
            tax = 15000 + (income - 700000) * 0.20; //15000 + 20% of income above 700000
        }
        else if (income <= 2000000) {
            tax = 35000 + (income - 1000000) * 0.30; //35000 + 30% of income above 1000000
        }
        else if (income <= 5000000) {
            tax = 335000 + (income - 2000000) * 0.36;  //335000 + 36% of income above 2000000
        }
        else {
            tax = 1135000 + (income - 5000000) * 0.39;  //1135000 + 39% of income above 5000000
        }

        System.out.println("Your total tax payable is: NPR " + tax);

    }
}
   