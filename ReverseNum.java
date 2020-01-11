//import java.util.Scanner;
class ReverseNum
{
public static void main(String args[])
	{
	//Scanner obj=new Scanner(System.in);
	//System.out.println("Enter the Number=");
	int num=12345;
	//num=obj.nextInt();
	while(num !=0)
		{
		
		
	
	int rem,rev=0;
	rem=num%10;
	rev=rev*10+rem;
	num=num%10;
	System.out.println("Reverse of Number ="+rev);
	


		}
	
	
	
	
	}
	
}
