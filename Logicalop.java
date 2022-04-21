 
class Logicalop
{
public static void main(String args[])
{
int a=5,b=4,c=8;

if((a>b)&&(a>c))
{
System.out.println("it satisfy AND operation");
}
if((a>b)||(b>c))
{
System.out.println("it satisfy OR operation");
}
if((a!=b))

{
System.out.println("it satisfy NOT operation");
}
else
{
System.out.println("no operation is satisfied");
}
}
}

