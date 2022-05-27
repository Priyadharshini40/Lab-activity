class Factorial
{
 int fact;
 //recursive version
 int recursive(int i)
 {
 fact=1;
 if (i==1 || i==0)
 return 1;
 else
 {
 fact=i*recursive(i-1);//3*(3-1)
 return fact;
 }
 }
 //nonrecursive(iterative) version
 int nonrecursive(int i)
 {
 if (i==1 || i==0)
 {
 return 1;
 }
 else
 {
 fact=1;
 for(int j=1;j<=i; j++)

 {
 fact=fact*j;
 }
 return fact;
 }
 }
}
public class Factorialeg{
 public static void main(String args[])
 {
 System.out.println("Calculating factorial ");
 Factorial f=new Factorial();
 System.out.println("using recursive");
 System.out.println("Factorial of 3 is :"+ f.recursive(3));
 System.out.println("using nonrecursive");
 System.out.println("Factorial of 5 is :"+ f.nonrecursive(5));
}
}