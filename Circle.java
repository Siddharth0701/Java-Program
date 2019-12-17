import java.util.*;
class Circle
{
	public static void main(String[] args) {


		 float pi=3.14f;
		  float radius;
		  float Area , Perimeter;

		 Scanner obj=new Scanner(System.in);
		  System.out.println("enter the radius");
		  radius= obj.nextFloat();
		  Area=pi*radius*radius;
		  Perimeter=2*pi*radius;


		  System.out.println("area of circle:"+Area);
		  System.out.println("perimeter of circle:"+Perimeter);

		


	}
		
	
}