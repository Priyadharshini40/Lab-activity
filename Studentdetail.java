class Studentdetail
{
static int rollno;//here the roll number is also same for every student but it incremented by one on each student
//that's why i incremented rollnumber inside the display method
String stname;
int  marks; 
static String clgname="ABC";//with the help of static keyword we dont need to call the company name in everytime
//and we dont need to pass company name as a parameter 
Studentdetail(String s)
{
stname=s;

}
Studentdetail(String s,int m)
{

stname=s;
marks=m;
}
Studentdetail(String s,int m,int r)
{

stname=s;
marks=m;
rollno=r;
} 
static void change()
{
clgname="XYZ";
} 

void display()
{
rollno++;
System.out.println(rollno+ " " +stname+ " "+clgname+" " +marks);

}
public static void main(String args[])
{ 
Studentdetail.change();
Studentdetail S1=new Studentdetail("ram");
S1.display();
Studentdetail S2=new Studentdetail("priya",80);
S2.display();
Studentdetail S3=new Studentdetail("riya",90,1);
S3.display();

}
}


@@@output
1 ram XYZ 0
2 priya XYZ 80
2 riya XYZ 90
