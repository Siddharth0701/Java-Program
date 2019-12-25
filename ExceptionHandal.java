import java.util.*;
class ExceptionHandal
{
	
    public static void main(String[] args) 
{


     int a,b,c;
     Scanner obj=new Scanner(System.in);
      System.out.println("enter the two number");

      a=obj.nextInt();
      b=obj.nextInt();

       try
       {
           c=a/(a-b);

           System.out.println("division of two number is:   "+c);




       }
 

         catch (Exception e) {


         	System.out.println("  Hey! , You can not divide Number by zero");
         	
         }






}





















}