package package1;

public class Student1 {
	int rollNo;
	int clas;
	
	public void display1() {
		System.out.println("Welcome to all of you");
	}
	public void display2() {
		System.out.println("Automation is easy");
	}
	public static void main(String[] args) {
		Student1 abc= new Student1();
		abc.display1();
		abc.display2();
		abc.rollNo= 2;
		abc.clas= 2;
		System.out.println(abc.rollNo);
		System.out.println(abc.clas);
	}

}
