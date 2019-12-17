import java.util.*;
class PrimeNO
{
   
   public static void main( String aggs[])

   { 
   	   int no,temp=0,i;
   	   Scanner obj=new Scanner(System.in);
   	   System.out.println("Enter the Number");
   	   no=obj.nextInt();
   	   


   	   	  for(i=2;i<=no-1;i++)
 
   	   	   	{

               if(no%2==0)
               {
               	temp=temp+1;
               }
           }

                if(temp>0)
                {
                	System.out.println(no+":Number is  not prime");

                }
                else
                {
                	System.out.println(no+":number is prime");
                }

   	   	   	



   }


} 

