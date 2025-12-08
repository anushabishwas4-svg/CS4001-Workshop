import java.util.Scanner;
class SimpleCalculator{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        boolean isExist = true;
        while(isExist){
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        
        System.out.println("Enter the operator (+,-,*,/): ");
        String operator = sc.next();
        double result = 0;
        switch(operator){
            case "+":
                result = num1 + num2;
            break;
            
            case "-":
                result = num1 - num2;
            break;
            
            case "*":
                result = num1 * num2;
            break;
            
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid Operator");

        }
        System.out.println(result);
        
        System.out.println("Do you want to continue(yes/no): ");
        String isContinue = sc.next();
        
        if(isContinue.equals("no")){
            isExist = false;
            System.out.println("Bye<3");
        }
    }
}
}