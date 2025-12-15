import java.util.Scanner;
class StudentArray{
    public static void main(String[] args){
      String[] names ={"Asha", "Ramesh", "Sita","Binod", "Sabita"}; 
      for(int i = 0; i < names.length; i++){
          System.out.println(names[i]);
      }
     
      //print 3rd element
      System.out.println("                                  ");
      System.out.println("\nName at index 2: " + names[2]); //Sita
    
     // Change the name at index 4 and print the updated value
     String changeName = names[4] = "Anusha"; //Change name from Sabita to Anusha
     System.out.println("Updated Name: " + names[4]); 
     
     Scanner sc = new Scanner(System.in);
     System.out.println("\nEnter the Student Name: ");
     String userInput = sc.nextLine();
     
     names[0] = userInput; //replace 1st element "Asha" from the user entered name and print updated array
     for(int i=0; i<names.length; i++){
         System.out.println(names[i]);
     }
    }
}