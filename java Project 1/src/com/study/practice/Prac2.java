package com.study.practice;

public class Prac2 
{
	int a=100, b=25, result;
	String D;
	String A;
	
	void add()
	{ 
		result= a+b;
		System.out.println(" a+b=" + result);
	}
	void sub()
	{ 
		result=a-b;
		System.out.println(" a-b=" + result);
	}
	void inc()
	{
		result = a+1;
		System.out.println(" a+1=" + result);
	}			
	void mul()
	{
		result= a*b;
		System.out.println(" a*b=" + result);
	}	
	void div()
	{
		result= a/b;
		System.out.println(" a/b=" + result);
	}
	
	void P()
	{
		D= " Yay! I did this.";
				System.out.println(D);
	}
	void Q()
	{
		A = " And,I have this in another object";
				System.out.println(A);
	}
	public static void main(String[] args)
	{
		Prac2 obj = new Prac2();
		obj.add();
		obj.sub();
		obj.inc();
		obj.mul();
		obj.div();
		obj.P();
		
		Prac2 obj1= new Prac2();
		obj1.Q();
	}
	
		
}
