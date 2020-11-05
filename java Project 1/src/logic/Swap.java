package logic;

public class Swap
{

	public static void main(String[] args)
	{
		 int a=10;
		int b=20;
		System.out.println(" Numbers before swap:a=" + a + " b="+ b);
		
		/*int t=a;// assigning new variable
		a=b;
		b=t;*/
		
		/*a=b+a;// addition and sub method
		b=a-b;
		a=a-b;*/
		
		/*a=a*b; // multiplication and division method
		  b=a/b; //(make sure no swapping value is 0 )
		  a=a/b;*/
		
		b=a+b-(a=b);//single statement
		
		
		System.out.println(" Numbers after swap: a=" + a + " b="+ b);
		
		

	}

}
