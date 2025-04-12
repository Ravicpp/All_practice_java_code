class A
{
void m1()
{
System.out.println("method of A");
}
}
 class B extends A
{
}

class C extends B
{
void m1()
{
System.out.println("method of C");
}
}
class Demo
{
public static void main(String args[])
{
C c=new C();
c.m1();
}
}
