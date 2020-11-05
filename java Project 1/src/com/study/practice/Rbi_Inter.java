package com.study.practice;

public interface Rbi_Inter
{
	void deposit();
	void withdraw();
	public static void main(String[] args) 
	{
		Rbi_Inter i;
		i= new IciciR();
		i.deposit();
		i.withdraw();
	
		Rbi_Inter i1;
		i1= new HdfcR();
		i1. deposit();
		i1.withdraw();
	}
	
}
