import java.util.Scanner;
class Degreeconversion
{
public static void main(String args[])
	{
	double c,f;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the Ferharnite:");
	f=obj.nextDouble();
	
	c=(f-32)*5/9;
	System.out.println("Degree Ferharnite to degree celsius conversion is:"+c);
	}
}
