import java.util.Scanner;
class factorial
{
public static void main(String args[])
	{
	int i=1,fact=1;
	Scanner obj=new Scanner(System.in);
	int number;
	System.out.println("Enter the number=");
	number=obj.nextInt();
	while(i<=number)
		{
		fact=fact*i;
		i++;
		}
		System.out.println("factorial of number is="+fact);
	}
}