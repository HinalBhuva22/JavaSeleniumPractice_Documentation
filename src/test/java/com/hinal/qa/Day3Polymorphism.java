package com.hinal.qa;

public class Day3Polymorphism {
	
	int a=10, b=20;
	
	void sum()  //1   no parameter, but method same - allow
	{
		System.out.println(a+b);
	}
	
	void sum(int x, int y)  //2  2 parameter, but method same - allow
	{
		System.out.println(x+y);
	}
	
	void sum(int x, double y)  //3  number of parameter is same but datatype of parameter is different but method same - allow
	{
		System.out.println(x+y);
	}

	void sum(double x, int y)  //4  2 parameter , but order of parameter is different
	{
		System.out.println(x+y);
	}

	
	void sum (int a, int b, int c)  //5  datatype of parameter is different 	
	{
		System.out.println(a+b+c);
	}

}
