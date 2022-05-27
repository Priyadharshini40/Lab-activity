/*    1.Create a custom Exception class. You need to consider two integer inputs which must be supplied by the
user. You will display the sum of the integers if and only if the sum is less than 100. If it is not less than 100,
throw your custom exception*/
import java.util.*;
 class Customexception {
               void display()
                {

		Scanner s=new Scanner(System.in);
		System.out.println("enter the 1st integer");
		int a=s.nextInt();
		System.out.println("enter the 2nd integer");
		int b=s.nextInt();
		int c=a+b;
		if(c>100)
                try
		{
			throw new Exception();
		}
                catch(Exception e)
                {
                System.out.println("sum of  the two integer is greater");
                }
		else
		{
			System.out.println("the sum of the integer is "+c);
		}
		}
                public static void main(String[] args) 
                {
                Customexception c=new Customexception();
                c.display();

                 }
                 }
