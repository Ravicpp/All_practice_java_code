class A
{
int a=10;
void msg()
{
System.out.println("Instance method of class A");
}
}
class Demo
{
public static void main(String args[])
{
A x=new A();
x.msg();
System.out.println(x.a);
}
}