
class SmallMarks2D{
    public static void main(String[] args){
      
        //create a 2D int array marks[2][2] for 2 students and 2 subjects
        int[][] marks = new int[2][2];
        
        //fill with sample marks
        //Student 1: Nepali=80, English = 90
        marks[0][0] = 80; //Nepali
        marks[0][1] = 90; //English
        
        //Student 2: Nepali = 75, English = 88
        marks[1][0] = 75; //Nepali
        marks[1][1] = 88; //English
        
        //print 2x2 table with labels
        System.out.println("Marks Table: ");
        System.out.println("...........................");
        System.out.println("Student\tNepali\tEnglish");
        for(int i = 0; i < marks.length; i++){
            System.out.println("S" + (i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1]);
        }
       //Compute and print the total marks for each student
       System.out.println("\nTotal Marks: ");
       System.out.println("...........................");
       for(int i = 0; i <marks.length; i++){
           int total = 0;
           for (int j = 0; j < marks[i].length; j++){
               total += marks[i][j];
           }
           System.out.println("Student" + (i + 1) + ":" + total);
       }
        
    }
}