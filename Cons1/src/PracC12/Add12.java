package PracC12;

import PracC1.Add1;

public class Add12 extends Add1 // Is a relationship
{

	public Add12(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public Add12(int a, int b) 
	{
		this.a=a;
		this.b=b;
	}

	public static void main(String[] args)
	{
		Add12 a12= new Add12(150,100,1);
		a12.sum();
		a12.sum1();
		
		Add12 a121= new Add12(300,6);
		a121.sum();
		
		Add1 f= new Add1(40,30);// has a relationship
		f.mul();
	}

}
