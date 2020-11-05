package Debug;

import java.util.Scanner;

public class P8 
{
public static void main(String[] args) 
{

 Scanner scan = new Scanner (System.in) ;
	System.out.println("Give a number for month" );
	int a = scan.nextInt();
	scan.close();
	
	System.out.println("You chose : ");
	 
	String months;
	switch (a) {
	case 1: months="Jan";
	break;
	case 2: months="Feb";
	break;
	case 3: months="March";
	break;
	case 4: months= "April";
	break;
	case 5: months= "May";
	break;
	case 6: months= "June";
	break;
	case 7: months= "July";
	break;
	case 8: months= "August";
	break;
	case 9: months= "September";
	break;
	case 10: months= "October";
	break;
	case 11: months= "November";
	break;
	case 12: months= "December";
	break;
	
	default : months= "Invalid input for month";
	
	
	}
	System.out.println(months);
	
	
	
}
}
