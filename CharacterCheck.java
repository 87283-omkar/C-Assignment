package cdac;

import java.util.Scanner;

public class CharacterCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    char c=sc.next().charAt(0);
 
    if(c>='A'&& c<='Z')
    {
    	System.out.println("Uppercase");
    }
    else if(c>='a'&& c<='z')
    {
    	System.out.println("Lowercase");
    }
    else if(c>='0'&& c<='9')
    {
    	System.out.println("Digit");
	}
    else {
    	System.out.println("other");
    }
    
	}

}
