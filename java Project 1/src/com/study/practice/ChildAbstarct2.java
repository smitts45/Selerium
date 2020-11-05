package com.study.practice;

public class ChildAbstarct2 extends Rbi_Abstact 
{
	int d= 10, c= 5, result;
	void mul()
	{
		result= d*c;
		System.out.println(" I am multiplication d*c from child2 " + result);
	}
	public static void main(String[] args)
	{
		ChildAbstarct2 a= new ChildAbstarct2();
		a.m1();
		a.mul();
		a.m2();
		a.sum();
		
	}

	@Override
	public void m1()
	{
		System.out.println(" I am overwritten Rbi child 2");// TODO Auto-generated method stub
		
	}

}
