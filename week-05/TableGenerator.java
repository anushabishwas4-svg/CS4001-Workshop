import java.util.Scanner;
class TableGenerator{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in); 
       System.out.print("Enter a number: ");
       int num = sc.nextInt();
       
       System.out.println("\nMultiplication Table of " + num + ":");
       System.out.println("-----------------------------------------");
       
       for(int i = 1; i<= 10; i++){
           System.out.printf("%d x %2d = %3d%n", num, i, num * i);
           
       }
    }
}