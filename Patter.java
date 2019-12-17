import java.util.*;
class Patter
{


	public static void main(String args[])

      { 
         Scanner obj=new Scanner(System.in);
         int i,j,size;
         System.out.println("enter the size of row");
         size=obj.nextInt();

          for(i=1;i<=size;i++)
          {
            for(j=size;j>=i;j--)
             {

                System.out.print("*");
            }

           




           

           System.out.println(); 
           

          }

      

      }
}