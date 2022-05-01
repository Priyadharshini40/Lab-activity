class Employeegp
{
public static void main(String args[])
{
String name="raj";
int id=1;
int salary=1000;
double da,hra,gp=0;
da=salary*30/100;
hra=salary*12.5/100;
gp=salary+da+hra;
System.out.println("name of the employee: "+name);
System.out.println("id of the employee: "+id);
System.out.println("gross pay : Rs "+gp);
}
}