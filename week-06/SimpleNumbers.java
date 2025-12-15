import java.util.Scanner;
class SimpleNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] Scores = {10, 20, 30, 40, 50};
        for(int i=0; i<Scores.length; i++){
            System.out.println(Scores[i]);
        }
        //Sum of all numbers
        int sum = 0;
        for(int i = 0; i<Scores.length; i++){
        sum += Scores[i];
    }
    System.out.println("\nThe sum of all the numbers is: " + sum);
    System.out.println("\nThe Average of all the numbers is: " + sum/Scores.length);
     
    //Highest and Lowest numbers
     int Highest = Scores[0];
     for(int i=0; i<Scores.length; i++){
         if(Scores[i]>Highest){
             Highest=Scores[i];
         }
     }
         System.out.println("\nHighest Score is: " + Highest);
    
    int Lowest = Scores[0];
    for(int i=0; i<Scores.length; i++){
        if(Scores[i]<Lowest){
            Lowest=Scores[i];
        }
    }
    System.out.println("\nLowest Score is: " + Lowest);
    
    }
}