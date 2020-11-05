package logic;

public class P7Swch {
	public static void main(String[] args) 
	{

	 int season = 2;
     String seasonString;
     switch (season) {
         case 1:  seasonString = "Spring";
                  break;
         case 2:  seasonString = "Summer";
                  break;
         case 3:  seasonString = "Fall";
                  break;
         case 4:  seasonString = "Winter";
                  break;
        
         default: seasonString = "Invalid Season";
                  break;
     }
     System.out.println(seasonString);
 }


}
