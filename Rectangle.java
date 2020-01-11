import java.util.Scanner;
class Rectangle
{
public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);
	int len,wid,area,perimeter;
	System.out.println("Enter the Width:");
	wid=obj.nextInt();
	System.out.println("Enter the length:");
	len=obj.nextInt();
	area=len*wid;
	perimeter=2*(len+wid);
	System.out.println("Area of Rectangle:"+area);
	System.out.println("A Perimeter of Rectangle:"+perimeter);
	}
}
