import java.util.Scanner;
class NatNum100
{
public static void main(String args[])
	{
	System.out.println("Enter the size limits");

	int size;
	int sum=0;
	Scanner obj=new Scanner(System.in);
	size=obj.nextInt();
	for(int i=1;i<=size;i++)
		{
		sum=sum+i;
		}
	System.out.println("Sum of 100 natural Number is"+sum);
	}
}
