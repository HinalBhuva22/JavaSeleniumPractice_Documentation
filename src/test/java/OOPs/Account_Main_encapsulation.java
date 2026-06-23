package OOPs;

public class Account_Main_encapsulation {

	public static void main(String[] args) {

		Account_encapsulation acc = new Account_encapsulation();
		
		acc.setAccno(101);
		System.out.println(acc.getAccno());
		
		acc.setName("Hinal");
		System.out.println(acc.getName());
		
		acc.setAmount(5600);
		System.out.println(acc.getAmount());
	}

}
