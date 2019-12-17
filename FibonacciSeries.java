import java.util.*;
class FibonacciSeries
{
   
   public static void main( String aggs[])

   { 
   	   int a=0,b=1,c,size,i;
   	   Scanner obj=new Scanner(System.in);
   	   System.out.println("Enter the Range upto find fibonacii "); 
   	   size=obj.nextInt();


        System.out.println(" FibonacciSeries Number is ");
        System.out.println(a);
         System.out.println(b);
         for (i=1;i<=size ;i++ )
          {
         	
         
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
          }
           
           
 

   }
}