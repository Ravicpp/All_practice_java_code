class A
{
int a,b;
void setValue(int a,int b)
{
this.a=a;
this.b=b;
}
void add()
{
System.out.println(a+b);
}
}
class Demo
{
public static void main(String args[])
{
A x=new A();
A y=new A();
x.setValue(89,7);
y.setValue(9,70);
x.add();
y.add();
}
}