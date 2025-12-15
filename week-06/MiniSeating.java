class MiniSeating{
    public static void main(String[] args){
        //create a String[2][3] array for seats
        String[][] seats = new String[2][3];
        
        //put names in the first row and leave the second row empty
        seats[0][0] = "Trafalgar";
        seats[0][1] = "Robin";
        seats[0][2] = "Ace";
        
        //seats[1][0], seats[1][1], seats[1][2] remain null
        
        //print seating chart 
        System.out.println("Seating Chart ");
        System.out.println("________________________");
        for(int i=0; i<seats.length; i++){
            System.out.print("Row " +(i+1) + " : ");
            for(int j=0; j<seats[i].length; j++){
             if(seats[i][j]==null || seats[i][j].isEmpty()){
                 System.out.print("[empty]");  //showing [empty] where seats are empty
                }
                else{
                    System.out.print(seats[i][j] + " | ");
                }
            }
            System.out.println();
            }
        }    
            }
        
    
