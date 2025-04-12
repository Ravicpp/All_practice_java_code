interface A
{
void msg1();
interface B
{
void msg2();
}
}

class C implements B
{
public void msg1()
{
System.out.println("overriding method of A");
}
public void msg2()
{
System.out.println("overriding method of A");
}
}

class Demo
{
public static void main(String args[])
{
C c=new C();
c.msg1();
c.msg2();
}
}