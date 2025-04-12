import java.util.*;
class Arrmin
{
void sort(int arr[])
{
int i,j;
for(i=0;i<arr.length;i++)
{
for(j=0;j<arr.length-1-i;j++)
{
if(arr[j]>arr[j+1])
{
arr[j]=arr[j]+arr[j+1];
arr[j+1]=arr[j]-arr[j+1];
arr[j]=arr[j]-arr[j+1];
}
}
}
System.out.println("sorted array");
for(i=0;i<arr.length;i++)
{
System.out.print(" "+arr[i]);
}
}
}
class Demo
{
public static void main(String args[])
{
int num[],n,i;
Arrmin a=new Arrmin();
Scanner sc=new Scanner(System.in);
System.out.println("enter no of elements of array");
n=sc.nextInt();
num=new int[n];
System.out.println("enter "+n+" elements");
for(i=0;i<n;i++)
{
num[i]=sc.nextInt();
}
a.sort(num);
}
}
