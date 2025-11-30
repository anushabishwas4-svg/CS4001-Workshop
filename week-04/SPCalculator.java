import java.util.Scanner;
class SPCalculator{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter Marked Price: ");
        double MarkedPrice = sc.nextDouble();
        
        System.out.println("Enter Category (A/B/C/D): ");
        char Category = sc.next().toUpperCase().charAt(0);
        
        //Final Price = Marked Price - (MarkedPrice * DiscountRate)
        switch(Category){
            case 'A':
                System.out.println("Final Price: " + (MarkedPrice - MarkedPrice * 0.60)); //60%
                break;
            case 'B':
                System.out.println("Final Price: " + (MarkedPrice - MarkedPrice * 0.40)); //40%
                break;
            case 'C':
                System.out.println("Final Price: " + (MarkedPrice - MarkedPrice * 0.20)); //20%
                break;
            case 'D':
                System.out.println("Final Price: " + (MarkedPrice - MarkedPrice *0.10));  //10%
                break;
            default:
                System.out.println("Invalid Category");
        }       
        }
    }
    
