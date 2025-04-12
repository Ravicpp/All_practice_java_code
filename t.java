class A
{
int a=12;
}
class B extends A
{
int a=14;
}
class C extends B
{
int a=15;
void msg()
{
System.out.println(super.a);
}
}
class Demo
{
public static void main(String args[])
{
C c=new C();
c.msg();
}
}