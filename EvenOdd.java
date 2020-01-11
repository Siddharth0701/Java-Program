import java.util.Scanner;
class EvenOdd
{
	public static void main(String args[])
	{
	Scanner myobj=new Scanner(System.in);
	System .out.println("Enter the number");
	int num=myobj.nextInt();
	    
		if(num%2==0)
		{
			System.out.println("Number is Even:"+num);
			
		}
		  else
		  {   
	        System.out.println("Number is odd:"+num);
		  }
	}
}	
		  