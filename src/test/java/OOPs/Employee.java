package OOPs;

public class Employee {
	
	
	//attributes - variables 
	int eid;
	String ename; 
	String job;
	int sal;
	
	
	
	
	
	
	
	// normal method 
	//. another method also  return - int, string, void 
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
		
	}
	
	// this is one method 
	public static void main(String[] args) 
	{
           Employee emp1 = new Employee(); // object 
           emp1.eid=101;
           emp1.ename="Hinal";
           emp1.job="QA";
           emp1.sal=50000;
           emp1.display();
           
           // if display method not want to write then this way also available...
           System.out.println(emp1.eid);
           System.out.println(emp1.ename);
           System.out.println(emp1.job);
           System.out.println(emp1.sal);
          
          
           
           
           Employee emp2 = new Employee();
           emp2.eid=120;
           emp2.ename ="Radha";
           emp2.job ="Developer";
           emp2.sal =100000;
           emp2.display();
        	
        
	}

}
