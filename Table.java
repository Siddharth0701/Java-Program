import java.util.*;
class Table
{
	public static void main( String args[])
	{
		int i,no;

		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number");
		no=obj.nextInt();

		 for(i=1;i<=10;i++)
		 {
		 	System.out.println("Table of number:"+no +"x"+i+"="+no*i);
		 }
	}
}