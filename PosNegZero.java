import java.util.Scanner;
class PosNegZero
{
public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);
	int num;
	System.out.println("Enter the Number=");
	num=obj.nextInt();
	if(num>0)
		{
		System.out.println("Number is Positive");
		}
			else
			{
			if(num<0)
				{
				System.out.println("Number is Negative");
				}
					else
					{
					System.out.println("Number is Equal to Zero");
					}
			}	
	}		
}	