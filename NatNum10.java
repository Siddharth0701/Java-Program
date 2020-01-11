import java.util.Scanner;
class NatNum10
{
public static void main(String args[])
	{
	System.out.println("Enter the size limits");

	int sum=0;
	Scanner obj=new Scanner(System.in);
	for(int i=1;i<=10;i++)
		{
		sum=sum+i;
		}
	System.out.println("Sum of 10 natural Number is"+sum);
	}
}
