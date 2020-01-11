import java.util.Scanner;
class SumOddNum
{ 
public static void main(String args[])
	{
	int Sum=0;
	for(int i=1;i<=50;i++)
		{
		if(i%12==0)
			{
			Sum=Sum+i;
			}
		}
	System.out.println("Sum of 50 Odd natural number="+Sum);
	}
}