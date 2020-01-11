import java.util.Scanner;
class LeapYear
{
public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);
	int year;
	System.out.println("Enter the Year=");
	year=obj.nextInt();
	
	if(year%4==0)
		{
		System.out.println("Year is leap year="+year);
		}
			else
			{
			System.out.println("Year is not leap year="+year);
			}
		
	}
}