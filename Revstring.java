import java.util.Scanner;
class Revstring
{ 
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string : ");
String a=sc.nextLine();
 
int le=a.length();
String r=" ";
for( int i=le-1;i>=0;i--)
{
r=r+a.charAt(i);
}
System.out.println("reversed string is : "+r);

}
}
//
class Revstring
{
public static void main(String args[])
{
String a="priya";
StringBuilder sb=new StringBuilder(a);
sb=sb.reverse();
System.out.println("reverse string is : "+sb);

}
}


