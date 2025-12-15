import java.util.Scanner;
class Districts{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //String[] of 4 district names
        String[] districts = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};
        
        //print numbered list
        System.out.println("\nInitial districts: ");
        for(int i = 0; i < districts.length; i++){
            System.out.println((i + 1) + "." + districts[i]);
        }
        
        //use scanner to read the number of districts and their names
        System.out.println("\nEnter the number of districts: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] updatedDistricts = new String[n];
        System.out.println("Enter districts name: ");
        for(int i = 0; i < n; i++){
            updatedDistricts[i] = sc.nextLine();
        }
        
        //print updated array
        System.out.println("\nupdatedDistricts: ");
        for(int i=0; i<updatedDistricts.length; i++){
            System.out.println((i+1) + "." + updatedDistricts[i]);
            
        }
    }
}