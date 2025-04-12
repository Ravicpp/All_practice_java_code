class A
{
public static void main(String args[])
{
int num=15,ch,flag,i;
System.out.println("The number is"+num);
System.out.println("press 1 to identify prime or composite press 2 to identify odd or even press to identify postive or negative");
ch=2;
System.out.println(" you press "+ch);
switch(ch)
{
case 1:
if(num%2==0)
{
System.out.println("even");
}
else{
System.out.println("odd");
}
break;

case 2:
flag=0;
for(i=2;i<=num/2;i++)
{
if(num%i==0)
{
flag++;
break;
}
}
if(flag==0)
{
System.out.println("prime");
}
else
{
System.out.println("composite");
}
break;

case 3:
if(num>0)
System.out.println("positive");
else if(num==0)
System.out.println("number is zero");
else
System.out.println("negative");
break;

case 4:
break;

default:
System.out.println("wrong choice");
}
}
}