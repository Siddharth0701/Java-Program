import java.util.Scanner;
class SumEvenNum
{ 
public static void main(String args[])
	{
	int Sum=0;
	for(int i=2;i<=50;i++)
		{
		if(i%2==0)
			{
			Sum=Sum+i;
			}
		}
	System.out.println("Sum of 50 Even natural number="+Sum);
	}
}