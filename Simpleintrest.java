import java.util.Scanner;
class Simpleintrest
{
public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);
	int pri,Inte,time;
	float SI;
	System .out.println("Enter the Principle");
	pri=obj.nextInt();
	System.out.println("Enter the Intrest");
	Inte=obj.nextInt();
	System.out.println("Enter the time");
	time=obj.nextInt();
	SI= pri*Inte*time/100;
	System.out.println("Simple Intrest is:"+SI);
	}
}