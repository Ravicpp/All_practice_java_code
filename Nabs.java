abstract class Nabs
{
abstract void m();
abstract class E{}
}
class D extends Nabs
{
public void m()
{
System.out.println("hi");
}
public static void main(String args[])
{
D d=new D();
d.m();
}
}