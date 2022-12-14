package practice;

public class Hashcode1 {
	public int hashCode()
	{
		return 123;
	}
public static void main(String[] args) {
	Hashcode1 h1=new Hashcode1();
	System.out.println(h1.hashCode());
	Hashcode1 h2=new Hashcode1();
	System.out.println(h2.hashCode());
}
}
