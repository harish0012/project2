package practice;

public class Palindrome {
	public static void main(String[] args) {
		String str="java";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("is a palindrome");
		}
		else
		{
			System.out.println("is not a palindrome");
		}
	}
}
