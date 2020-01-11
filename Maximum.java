import java.util.Scanner;
class  Maximum3
{
	public static void main(String args[])
	{
	Scanner myobj=new Scanner(System.in);
	System .out.print("Enter the first Number");
	
	
	int Num1=myobj.nextInt();
	System .out.print("Enter the second Number");
	int Num2=myobj.nextInt();
	System .out.print("Enter the third Number");
	int Num3=myobj.nextInt();
	
	//System .out.println(" first number"+Num1);
	//System .out.println(" second Number"+Num2);
	//System .out.println(" third Number"+Num3);

	if(Num1<Num2)
		{

			if(Num1<Num3)
			{
			System.out.println("Greater Num1"+Num1);
			}
			else
				{
				System.out.println("Number is Greater"+Num3);
				}
		}		
				else if(Num3<Num2)
						{
						System.out.println(Num3+"Num3 is Greater");
						}
							else
							{
							System.out.println("Num2 is Greater"+Num2);

							}
				
	}
}