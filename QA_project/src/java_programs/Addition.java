package java_programs;

public class Addition implements Calculator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
int b=10;
int sum= a+b;
int sbs= b-a;
int mul= a*b;
int div= b/a;
int mod= b%a;



System.out.println(" The sum of two number is " +sum);
System.out.println(" The subs of two number is " +sbs);
System.out.println(" The multiplication of two number is " +mul);
System.out.println(" The division of two number is " +div);
System.out.println(" The remainder valve is " +mod);
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multi() {
		// TODO Auto-generated method stub
		
	}

}
