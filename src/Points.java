import java.util.Scanner;
public class Points
{


public static void main(String[] args) 
    {
         {
	           Scanner points = new Scanner(System.in);
	           System.out.println("Enter points:");
	           int num = points.nextInt();
	           if(num>=1 && num<=9)
	           {
	        	   if(num>=1 && num<=3)
	        	   {
	        		   num *= 5;
	        		   System.out.println("Your poins:" + num);      		   
	        	   }else if (num>=4 && num<=6)
	        	   {
	        		   num *= 10;
	        		  System.out.println("Your poins:" + num);
	        	   }else if (num>=7 && num<=9)
	        	   {
	        		   num *= 50;
	        		  System.out.println("Your poins:" + num);
			   }
	           }else System.out.println("Invalid input!");
         }
    }
}
