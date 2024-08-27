import java.util.Scanner;

public class find_max {
    public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		int n=sc.nextInt();
		System.out.println("Enter numbers");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
       int max=0;
       for (int num:arr) {
       	if(num>max)
       	{
       		max=num;
       	}
       }
       System.out.println(max);
}
}
