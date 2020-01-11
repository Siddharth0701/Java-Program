import java.util.Scanner;
class AreaCircle
{
public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);
	int r; 
	r=obj.nextInt();
	float pi=3.14f; 
	double area;
	
	area=pi*r*r;
	float circumference=2*pi*r;
	System.out.println("Area of Circle"+area);
	System.out.println("Circumfearea of circle:"+circumference);
	}
}