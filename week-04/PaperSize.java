import java.util.Scanner;
class PaperSize{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Paper Size (A0 to A5): ");
       String PaperSize = sc.next().toUpperCase();
       
       int widthMM = 0, heightMM = 0;
       double widthInch =0, heightInch =0;
       switch (PaperSize){
           case "A0":
               widthMM=841; heightMM=1189;
               widthInch = 33.1; heightInch = 46.8;
               break;
            case "A1":
                widthMM=594; heightMM = 841;
                widthInch = 23.4; heightInch = 33.1;
                break;
            case "A2":
                widthMM = 420; heightMM= 594;
                widthInch = 16.5; heightInch = 23.4;
                break;
            case "A3":
                widthMM = 297; heightMM = 420;
                widthInch = 11.7; heightInch = 16.5;
                break;
            case "A4":
                widthMM = 210; heightMM = 297;
                widthInch = 8.3; heightInch = 11.7;
                break;
            case "A5":
                widthMM = 148; heightMM = 210;
                widthInch = 5.8; heightInch = 8.3;
                break;
            default:
                System.out.println("Invalid Paper Size.");
       }
       System.out.println("Dimensions of " + PaperSize + " : ");
       System.out.println(widthMM + "x" + heightMM + "mm");
       System.out.println(widthInch + "x" + heightInch + "inch");
    }
}