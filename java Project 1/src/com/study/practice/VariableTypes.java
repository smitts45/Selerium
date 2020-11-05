package com.study.practice;

public class VariableTypes
{
	//primitive
	int b=100;// instance, global, non static variables
   static  String sname= "my s variable"; // static, global variable
  
void m1()
{
	int a= 10; //local
	System.out.println("*from m1*");
	System.out.println(a);
	System.out.println(b);
	System.out.println(sname);
	
}
 
 static void m2()
 {
	System.out.println("*from static m2*");
	System.out.println(sname);
	
	
 }

	public static void main(String[] args)
{
		VariableTypes d= new VariableTypes(); // Reference
		 d.m1();
		 
		
		 System.out.println("*from main*");
		System.out.println(d.b);
		System.out.println (sname);
	
}
}
