 import java.util.*;
class Largestnoarray
{
public static void main(String args[])
{ 
int a[]=new int [3];
int max=a[0];
Scanner s=new Scanner(System.in);
for(int i=0;i<3;i++)
{
System.out.println("enter the number:");
a[i]=s.nextInt();
}
for(int i=0;i<3;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
System.out.println("largest number is :"+max);
}
}
 import java.util.*;
class Largestnoarray
{
public static void main(String args[])
{ 
int a[]=new int [3];
int min=a[0];
Scanner s=new Scanner(System.in);
for(int i=0;i<3;i++)
{
System.out.println("enter the number:");
a[i]=s.nextInt();
}
for(int i=1;i<3;i++)
{
if(a[i]<min)
min=a[i];
}
System.out.print("smallest number is : "+min);
}
}
