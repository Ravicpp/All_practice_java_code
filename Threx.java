class Odd extends Thread
{
public void run()
{
int a=1,i;
try
{
for(i=1;i<=5;i++)
{
System.out.println(i+" odd number="+a);
a=a+2;
Thread.sleep(1500);
}
}
catch(Exception e){}
System.out.println("Exit from odd thread");
}
}
class Prime extends Thread
{
public void run()
{
int c=0,i,j,flag;
try
{
for(i=2;c<5;i++)
{
flag=0;
for(j=2;j<=i/2;j++)
{
if(i%j==0)
{
flag++;
break;
}
}
if(flag==0)
{
c++;
System.out.println(c+" Prime number="+i);
Thread.sleep(1500);
}
}
}
catch(Exception e){}
System.out.println("Exit from Prime thread");
}
}

class Demo
{
public static void main(String args[])
{
Odd o=new Odd();
Prime p=new Prime();
o.start();
p.start();
}
}