import java.util.Scanner;
class Distance
{
public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the Distance:");
	int distance,meter;
	distance=obj.nextInt();
	meter=distance*1000;
	System.out.println("Distance from Kilometer to meter:"+meter);
	}
}