import java.util.Scanner;
class Bikerider
{
int bno;
String name;
int days;
int charge; 
void input()
{ 
Scanner s=new Scanner(System.in);
System.out.println(" enter ridername: ");
name=s.nextLine();
System.out.println(" enter bikeno: ");
bno=s.nextInt();
System.out.println(" enter no.of.days the bike is on rent: ");
days=s.nextInt();
}
void compute()
{
if(days<=5)
{
charge=days*500;//1 day=500  1*500
}
else if(days<=10)
{
charge=5*500+(days-5)*400; //( total 10 days    5days=500,(10-5)next 5 days=5*400,  )
}
else
{
charge=days*500+5*400+(days-10)*200;//(rest of the days 30     days*500+(5*400)+days-10 *200
}
}
void display()
{
System.out.println(" bike number is : "+bno);
System.out.println(" rider name is : "+name);
System.out.println(" no. of days is : "+days);
System.out.println(" charge for bike is : "+charge);
}
public static void main(String args[])
{
Bikerider b=new Bikerider();
b.input();
b.compute();
b.display();
}
}