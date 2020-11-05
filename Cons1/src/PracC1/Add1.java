package PracC1;

public class Add1 
{
	public int a,b,c,r,r1;
	
	
	public Add1(int a, int b)
	{
		this.a=a;
		this.b=b;
	}

	public Add1(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public Add1() 
	{
		
	}

	public void sum()
	{
		r=a+b;
		System.out.println("a+b=*" + r);
	}
	
	public void sum1()
	{
		r1=a+b+c;
		System.out.println("a+b+c=**" + r1);
	}
	public void mul()
	{
		
		System.out.println("a*b=*" + a*b);
	}


	public static void main(String[] args) 
	{
		Add1 de= new Add1();
		de.sum();
		de.mul();
		
		Add1 d=new Add1(10,20);
		d.sum();
		d.mul();
		
		Add1 e= new Add1(100,200,300);
		e.sum();
		e.sum1();
	}

}
