class Employee
{
int salary=1200;
void display()
{
System.out.println("Salary of employee:    "+salary);
}
}
class Permanentemp extends Employee
{ 
double hike=0.5;
String name="ram";
void display1()
{
System.out.println("name of the employee    "+name);
System.out.println("hike  of the employee    "+hike);
System.out.println("salary of the permanent employee    "+(salary+(salary*hike)));

}
}
class Temporaryemp extends Employee
{
double hike=0.3;
String name="ramya";
void display2()
{
System.out.println("name of the employee    "+name);
System.out.println("hike  of the employee     "+hike);
System.out.println("salary of the temporary employee    "+(salary+(salary*hike)));

}
}
class Hierarchicaleg
{
public static void main(String args[])
{
Temporaryemp t=new Temporaryemp();
t.display();
t.display2();
Permanentemp t1=new Permanentemp();
t1.display();
t1.display1();
}
}

@@@@output
Salary of employee:    1200
name of the employee    ramya
hike  of the employee     0.3
salary of the temporary employee    1560.0
Salary of employee:    1200
name of the employee    ram
hike  of the employee    0.5
salary of the permanent employee    1800.0