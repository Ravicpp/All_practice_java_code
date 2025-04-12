
class Palindrome extends Thread
{
public void run()
{
int i;
try
{
for(i=1;i<=11;i++)
{
   int temp=i;
       int rev=0;
       while(temp!=0)
       {
           rev=rev*10+(temp%10);
           temp=temp/10;
       }
        if(i==rev)
        {
          System.out.println("plaindrome number="+i);
        }

Thread.sleep(500);
}
}
catch(Exception e){}
System.out.println("Exit from plaindrome thread thread");
}
}

class Even extends Thread
{
public void run()
{
int a=2,i;
try
{
for(i=2;i<=11;i++)
{
System.out.println(i+" even number="+a);
a=a+2;
Thread.sleep(500);
}
}
catch(Exception e){}
System.out.println("Exit from even thread");
}
}

class Demo
{
public static void main(String args[])
{
Palindrome p=new Palindrome();
Even e=new Even();
p.start();
e.start();
}
}
