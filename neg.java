import pkg.*;
import java.util.*;
class A
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
P1 obj=new P1();
try{
obj.add(a,b);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
