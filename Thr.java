class ThreadOne extends Thread
{
public void run()
{
try{
for(int i=1;i<=3;i++)
{
System.out.println("from child Thread 1:i="+i);
Thread.sleep(1500);
}

}
catch(Exception e){}
System.out.println("Exit from child Thread one");
}
}
class ThreadTwo extends Thread
{
public void run()
{
try{
for(int j=1;j<=3;j++)
{
System.out.println("from child Thread 2:j="+j);
Thread.sleep(2500);
}
}
catch(Exception e){}
System.out.println("Exit from child Thread two");
}
}
class ThreadThree extends Thread
{
public void run()
{
try{
for(int k=1;k<=3;k++)
{
System.out.println("from child Thread 3:k="+k);
Thread.sleep(1000);
}
}
catch(Exception e){}
System.out.println("Exit from child Thread three");
}
}
class Demo
{
public static void main(String args[])
{
ThreadOne t1=new ThreadOne();

ThreadTwo t2=new ThreadTwo();

ThreadThree t3=new ThreadThree();
t1.start();
t2.start();
t3.start();
try
{
for(int m=1;m<=3;m++)
{
System.out.println("From Main Thread:m="+m);
Thread.sleep(4000);
}
}
catch(Exception e){}
System.out.println("Exit from main()");
}
}