package com.study.practice;

public class ChildAbstract1 extends Rbi_Abstact


{

	public static void main(String[] args) 
	{
		ChildAbstract1 i= new ChildAbstract1() ;
			i.m1();
			i.m2();
			i.sum();
		

	}

	@Override
	public void m1() 
	{
		System.out.println(" I am overridden RBIchild ");
	}

}
