class Palindrome
{
public static void main(String args [])
{
int rem,sum=0,temp;
int num=131;
temp=num;        
while(num>0)
{
rem=num%10;     
sum=(sum*10)+rem;    
num=num/10;     
}
if(temp==sum)   
{
System.out.println("It is a palindrome");
}
else
{
System.out.println("It is  not a palindrome");
}
}
}

