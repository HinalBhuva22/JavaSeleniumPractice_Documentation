package com.hinal.qa;

public class OverloadingMainMethod {
	
	// we can overloading multiple main method also, but we can access them throght the object 

	void main (int x)
	{
		System.out.println(x);
	}
	
	
	void main (String s)
	{
		System.out.println(s);
	}
	
	
	void main (String s1, String s2)
	{
		System.out.println(s1+s2);
	}
	
	
	
	
	public static void main(String[] args)
	{

		OverloadingMainMethod ov = new OverloadingMainMethod();
		ov.main(100);
		ov.main("Hinal");
		ov.main("Hello", "Hinal");
		
	}

}
