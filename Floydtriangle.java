
import java.util.*;
class Floydtriangle
{
public static void main(String args[])
{
int i,j,k=1;
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int a=s.nextInt();
for(i=1;i<=a;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(" "+k);
k++;
}
System.out.println();
}
}
}