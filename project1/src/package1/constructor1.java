package package1;

public class constructor1 {
	public constructor1() {
		// TODO Auto-generated constructor stub
		System.out.println("default type");
	}
	public constructor1(int a) {
		// TODO Auto-generated constructor stub
		System.out.println ("two parameter"+a );
	}
	public constructor1(int a,int b) {
		int c;
		// TODO Auto-generated constructor stub
		c=a*b;
		System.out.println("two parameter " +c);
	}
	
	public static void main(String[] args) {
		constructor1 abc= new constructor1(2,3);
				
	}
	

}
