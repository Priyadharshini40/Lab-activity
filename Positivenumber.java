
 import java.util.Scanner;
class Positivenumber
{
public static void main(String[] args)
{
int  num,sum=0;
Scanner input=new Scanner(System.in);
System.out.println("Enter a number(negative number to quit):");
 
while(true)
{
num=input.nextInt();//read the numbers
if(num<0)
break;
sum+=num;
}
System.out.println("Sum is:" +sum);

}
}

