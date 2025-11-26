import java.util.Scanner;

public class RichshawFare
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Base fare and charges
        final int BaseFare = 60; //Rs.60 base fare
        final int perKM = 30;    //Rs.30 per kilometre
        final int perMIN = 2;    //Rs.2 per minutes
        final double LocalDiscount = 0.10;   //10% discount for locals on long distances
        final double NightSurcharge = 0.15;  //15% surcharge for night-time travel
        
        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();
        
        System.out.print("Enter time (in minutes): ");
        int time = sc.nextInt();
        
        System.out.print("Is the customer local? (true/false): ");
        boolean isLocal = sc.nextBoolean();
        
        System.out.print("Is the travel during night? (true/false): ");
        boolean isNight = sc.nextBoolean();
        
        //Fare Calculation
        double fare = BaseFare + (distance * perKM) + (time * perMIN);
        
        //Apply Local discount if distance > 11km
        fare = (isLocal && distance > 11) ? fare * (1- LocalDiscount) : fare;
        
        //Apply Night Surcharge
        fare = isNight ? fare * (1 + NightSurcharge) : fare;
        
        //Display result in Nepali format
        long  FinalFare = Math.round(fare);
        System.out.println("Final Fare: Rs. " + FinalFare);
    }
}