package OOPs;

public class StudentMain {

	public static void main(String[] args)
	{

		Student stu1 = new Student();
		
		stu1.sid= 101;
		//stu1.sname= "Maya"; for unique and same name for all data
		stu1.grad ='A';
		
		stu1.printdata();
		
		
        Student stu2 = new Student();
		
		stu2.sid= 102;
		//stu2.sname= "Jhon";
		stu2.grad ='A';
		
		stu2.printdata();
	}

}
