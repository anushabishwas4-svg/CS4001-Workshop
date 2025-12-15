class MiniKitab{
    public static void main(String[] args){
      //create String[] categories
      String[] categories = {"RomCom", "Mystery"};
      
      //Create String[] Titles
      String[][] titles = new String[2][1];
      double[][] prices = new double[2][1];
      
      //put one title and price for each categories
      titles[0][0] = "A Business Proposal"; //RomCom
      prices[0][0] = 800;
      
      titles [1][0] = "UnderCover HighSchool"; //Mystery
      prices[1][0] = 930;
      
      //print each category with it's title and price
      System.out.println("               MINI KITAB CORNER           ");
      System.out.println("________________________________________________");
      System.out.println("Titles            |Categories| Prices");
      System.out.println("------------------------------------------------");
      double totalValue = 0.0;
      
      for(int i = 0; i< categories.length; i++){
          for(int j = 0; j< titles[i].length; j++){
              
      System.out.printf("%s|  %s  |  Rs. %.2f%n", titles[i][j], categories[i], prices[i][j]); 
      totalValue += prices[i][j];
    }
    }
    //print totalValue
    System.out.printf("%nTotal Value: Rs. %.2f%n", totalValue);
}
}