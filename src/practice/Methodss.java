package practice;

public class Methodss {	
	static int add(int z,int y)
	{
		int a=2;
		int b=3;
		int c=a+b+z+y;
		return c;
	}
	public static void main(String[] args) {
		int x=add(10,13);
		int y=add(10,12);
		System.out.println(x);
		System.out.println(y);
	}
}
