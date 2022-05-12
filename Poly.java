//WRITE A PROGRAM TO IMPLEMENT RUNTIME POLYMORPHISM
class Runtimepoly
{
void display()
{
System.out.println("normal method");
}
}
class Poly extends Runtimepoly
{
void display()
{
super.display();
System.out.println("runtime polymorphism");

}
public static void main(String args[])
{
Poly p=new Poly();
p.display();
}
}
