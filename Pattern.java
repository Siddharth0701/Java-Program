import java.util.*;
class Pattern
{
	public static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
  int i,j;
  int row;

  System.out.println("enter the row");
row=obj.nextInt();
for(i=1;i<=row;i++)
   {
   	for(j=1;j<=i;j++)
   	{
   		System.out.print("*");

   	}
   	System.out.println();
   }




}









}