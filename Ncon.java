class A
{
int  a,b; //instance variable
A()//Non Argument Constructor
{
a=8;
b=7;
System.out.println("Non argument constructor");
}
void display()//instance method
{
System.out.println(a+b);
}
public static void main(String args[])
{
System.out.println("Inside main()");
A x=new A();
System.out.println(x.a);
System.out.println(x.b);
x.display();
}
}