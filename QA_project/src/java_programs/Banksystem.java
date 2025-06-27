package java_programs;

public class Banksystem {

	
		// TODO Auto-generated method stub
		int amt=1000;
		void deposit(int dep)
		{
		amt=amt+dep;
		System.out.println("The deposit amount is "+amt);
		}
		void withdraw(int wt)
		{
		amt=amt-wt;
		System.out.println("The withdraw amount is "+amt);
		}
		int display()
		{
		return amt;
		}
		public static void main(String[] args) {
		// Create a object
		Banksystem obj=new Banksystem();
		obj.deposit(1000);
		obj.withdraw(500);
		System.out.println(obj.display());
		
	}

}
