package com.study.practice;

public abstract class Rbi_Abstact
{
	int a=100, b= 30, result ;
	public abstract void m1();
	public void m2()
	{
		System.out.println(" I am from Rbi");
	}
	void sum()
	{
		result= a+b;
		System.out.println(" sum of a+b from Rbi=" + result);
		
	}
	
	
	

	public static void main(String[] args)
	{
		Rbi_Abstact h= new ChildAbstract1();
	
		h.sum();
		h.m1();
		h.m2();
		
		Rbi_Abstact v= new ChildAbstarct2();
		v.sum();
		v.m1();
		v.m2();
		
		
		
	}

}
