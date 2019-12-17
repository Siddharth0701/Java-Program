import java.util.*;
class Reverse{
   
   public static void main( String aggs[])

   { 
   	   int no,rem,rev=0;
   	   Scanner obj=new Scanner(System.in);
   	   System.out.println("Enter the Number");
   	   no=obj.nextInt();

   	    while(no!=0)
   	    {  

          rem=no%10;
          rev=rev*10+rem;
          no=no/10;

          
          




   	    }
     System.out.println("Reverse of number"+rev);




   }









}
