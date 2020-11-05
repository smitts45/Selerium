package PracC1;

public class Add2 extends Add1// Is a relationship
{
	
	public Add2(int i, int j, int k) 
	{
		this.a=i;
		this.b= j;
		this.c= k;
	}

	public Add2(int i, int j) 
	{
		this.a=i;
		this.b=j;
		
	}

	public static void main(String[] args)
	{
		Add1 s =new Add1(2000,3000);// Has a relationship
		s.sum();
		s.mul();
		
		Add2 s1 = new Add2(1000,3000,4000);
		s1.sum1();
		s1.sum();
		
		
	}

}
