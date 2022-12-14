package practice;

public class Sample2 {
	int a=65;
	int b=45;
	void add()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Sample2 s1=new Sample2();
		System.out.println((s1.a));
		System.out.println((s1.b));
		s1.add();
	}
}
