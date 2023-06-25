// Day 2 Assignment 1
package package1;
public class Assignment2 {
	public int sum(int a,int b)
	{
		int c;
		c= a+b;
		//System.out.println(+c);
		return c;
	}
	public int sub(int a,int b)
	{
		int c;
		c= a-b;
		//System.out.println(+c);
		return c;
	}
	public int mul(int a,int b)
	{
		int c;
		c= a*b;
		//System.out.println(+c);
		return c;
	}
	public void div(int a,int b)
	{
		int c;
		c= a/b;
		System.out.println("The final result is"+c);
	}
	public static void main(String[] args) {
		Assignment2 abc= new Assignment2();
		int val1=abc.sum(10,2);
		int val2= abc.sum(val1, 2);
		int val3= abc.sub(val2, 2);
		int val4= abc.mul(val3, 2);
		abc.div(val4,2);
	}}
