package practice;

public class Realtime_nonstatic {
	int java_mock;
	static String in_name="jspider";
	public static void main(String[] args) {
		System.out.println(in_name);
		Realtime_nonstatic r1=new Realtime_nonstatic();
		System.out.println("geetha");
		r1.java_mock=1;
		System.out.println(r1.java_mock);
		Realtime_nonstatic r2=new Realtime_nonstatic();
		System.out.println("sanju");
		r2.java_mock=2;
		System.out.println(r2.java_mock);
		r2.java_mock=1;
		System.out.println(r2.java_mock);
	}
}
