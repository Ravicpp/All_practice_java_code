class A
{
String name;//instance variable
public static void main(String args[])
{
A obj1=new A();
A obj2=new A();
System.out.println(obj1.name);
System.out.println(obj2.name);
obj2.name="hi";
System.out.println(obj1.name);
System.out.println(obj2.name);
}
}