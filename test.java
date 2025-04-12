import java.util.*;
class Myexcep extends Exception
{
public String toString()
{
return "User defined ecxeptiom negative value no not allowed";
}
}
class A
{
void fact(int a)throws Myexcep
{
int i,f=1;
if(a<0)
{
throw new Myexcep();
}
else if(a==0)
{
System.out.println("Factorial of 0 is 1");
}
else
{
for(i=1;i<=a;i++)
{
f=f*i;
}
System.out.println(f);
}
}

public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("enter any value");
num=sc.nextInt();
A x=new A();
try
{
x.fact(num);
}
catch(Exception e)
{
System.out.println("exception handeled:"+e);
}
}
}


