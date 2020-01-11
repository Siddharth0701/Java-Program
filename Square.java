import java.util.Scanner;
class Square
{
public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);
	int side,perimeter,area;
	System.out.println("Enter the Side:");
	side=obj.nextInt();
	area=side*side;
	perimeter=4*side;
	System.out.println("Area of Square:"+area);
	System.out.println("Perimeter of Square:"+perimeter);
	}
}