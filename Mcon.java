class A
{
A()
{
System.out.println("constructor of class A");
}
}
class B extends A
{
int a;
B(int a)
{
this.a=a;
System.out.println("constructor of class B "+a);
}
}
class C extends B
{
C()
{
super(12);
System.out.println("constructor of class C");
}
}
class Demo
{
public static void main(String args[])
{
C c=new C();
B b=new B(15);
A a=new A();
}
}