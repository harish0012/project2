package practice;

public class Arrayss {
public static void main(String[] args) {
	int [] arr=new int[5];
	arr[0]=20;
	arr[1]=30;
	arr[2]=40;
	arr[3]=50;
	arr[4]=60;
	System.out.println("index /t value");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(i+ "\t" +arr[i]);
	}
}
}
