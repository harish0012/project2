package practice;

public class Sum_of_three_array {
	public static void main(String[] args) {
		int[] arr={132,567,123};
		for(int i=0;i<arr.length;i++)
		{
			int no=arr[i];
			int sum=0;
			while(no!=0)
			{
				int rem=no%10;
				sum=sum+rem;
				no=no/10;
			}
			System.out.println(sum);

		}
	}
}
