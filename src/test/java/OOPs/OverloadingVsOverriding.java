package OOPs;


class ABC
{
	void m1 (int a)
	{
		System.out.println(a);
	}
	
	void m2 (int b)
	{
		System.out.println(b);
	}
}

class XYZ extends ABC
{
	void m1 (int a)  //Overriding this one  - same in both name of method is same , in overriding we can't change the declaration, we change only implementation
	{
	System.out.println(a*a);
	}
	
	void m2 (int a, int b) // in overloading this one - in overloading we should change declaration, same thing again we should not write, implmentation both way
	{
		System.out.println(a+b);
	}
}
	








public class OverloadingVsOverriding {

	public static void main(String[] args) {

		XYZ xyzobj = new XYZ();
		xyzobj.m1(10);
		xyzobj.m2(20);
		xyzobj.m2(10, 20);
		
		
	}

}
