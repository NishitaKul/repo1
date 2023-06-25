//Assignment2
//(((((10*2)-2)+2)-2)/2)
package package1;

public class Assignment_2 {
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int a,int b)
	{
		int c;
		c=a-b;
		return c;
	}
	public int mul(int a,int b)
	{
		int c;
		c=a*b;
		return c;
	}
	public void div(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println("The result is "+c);
	}
	public static void main(String[] args) {
		Assignment_2 abc=new Assignment_2();
		int mul=abc.mul(10, 2);
		int sub= abc.sub(mul, 2);
		int add= abc.sum(sub,2);
		int sub1= abc.sub(add,2);
		abc.div(sub1, 2);
		}
	}
