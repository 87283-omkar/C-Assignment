public class grade {
public static void main(String args[])
{
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter Five subject marks");
    		int math,phy,chem,bio,eng;
    		math=sc.nextInt();phy=sc.nextInt();chem=sc.nextInt();
    		bio=sc.nextInt();eng=sc.nextInt();
    		int total=math+chem+bio+eng+phy;
    		if(total>90)
    		{
    			System.out.println("Grade Ex");
    		}
    		else if(total<90 &&total>=80)
    		{
    			System.out.println("Grade A");
    		}
    		else if(total<80 &&total>=70)
    		{
    			System.out.println("Grade B");
    		}
    		else if(total<70 &&total>=60)
    		{
    			System.out.println("Grade C");
    		}
    		else if(total>60)
    		{
    			System.out.println("Grade F");
    		}
    	
}
}
