import java.util.Scanner;
class NumberCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        
        if (number > 0)
        {
            System.out.println("The number is Positive");
        }
        else if (number < 0)
        {
            System.out.println("The number is Negative");
        }
        else
        {
            System.out.println("The number is Zero");
        }
    }
}