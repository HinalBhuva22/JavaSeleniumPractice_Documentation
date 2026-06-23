package OOPs;



class Parent
{
	void dispaly( int a)
	{
		System.out.println(a);
	}
}


class child1 extends Parent
{
	void show (int b)
	{
		System.out.println(b);
	}
}



class child2 extends Parent
{
	void print (int c)
	{
		System.out.println(c);
	}
}







public class HierarchyInhertance {

	public static void main(String[] args) {

		
		child1 c1 = new child1();
		
		c1.dispaly(100);
		c1.show(200);
		
		child2 c2 = new child2();
		
		c2.dispaly(1000);
		c2.print(2000);
		
		
		
		
	}

}
