import java.util.Scanner;
class Voting
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter ur Age:");
int a=s.nextInt();
if (a>=18)
{
System.out.println("you are eligible to vote");
}
else
{
System.out.println("you are not eligible to vote");
}
}
}