import java.util.*;
class Reverseno
{
	public static void main( String args[])
	{
		int rev=0,rem ,no;
		Scanner obj=new Scanner(System.in);
		no=obj.nextInt();
		System.out.println("enter  the  number");
		while(no !=0)
		{
			
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
			
			
			
			
			
			
		} 
	System.out.println(rev);
}	}
		
		
		