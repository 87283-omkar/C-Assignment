package cdac;

import java.util.Arrays;

public class Reverse {
	public static void main(String args[])
	{
		String s="omkar";
		char arr[]=s.toCharArray();
		
		int i=0;int j=arr.length-1;
		
		while(i<j)
		{
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
			
		}
		String rev=Arrays.toString(arr);
		System.out.print(rev);
		
	}

}
