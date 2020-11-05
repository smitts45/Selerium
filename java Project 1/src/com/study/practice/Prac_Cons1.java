package com.study.practice;

public class Prac_Cons1 
{
	int a,b,c,result,result1;
	
	public Prac_Cons1()
	{
		System.out.println("This is default");
	}


	public Prac_Cons1(int a, int b) 
	{
		this.a=a;
		this.b=b;
	}


	public Prac_Cons1(int a, int b, int c) 
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}


	void mul1()
	{
		result= a*b;
		System.out.println("a*b=" + result);
	}
	
	void sum2()
	{
		result=a+b;
		System.out.println("a+b =" + result);
	}
	
	void sum3()
	{
		this.mul1();
		this.sum2();
		result = a+b+c;
		result1= a*b*c;
		System.out.println("a+b+c=" + result);
		System.out.println("a*b*c=" + result1);
	}
	
	public static void main(String[] args)
	{
		Prac_Cons1 r= new Prac_Cons1();
		r.mul1();
		r.sum2();

		Prac_Cons1 t= new Prac_Cons1(100,200);
		t.sum2();
		t.mul1();
		
		Prac_Cons1 g= new Prac_Cons1(3,5,10);
		g.sum3();
	}

}
