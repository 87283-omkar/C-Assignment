package cdac;

public class Palindrome {
public static void check(String s)
{
	int start=0;
	int end=s.length()-1;
	boolean flag=true;
while(start<end)
{
	if(s.charAt(start)!=s.charAt(end))
	{
		flag=false;
		break;
	}
	start++;
	end--;
}
if(flag) {
System.out.print("true");
}
else {
	System.out.print("false");
}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="nitin";
		check(s);
	
	}

}
