
import java.util.*;
class A
{
	static void merge(int arr[],int beg,int mid,int end)
	{
 		int i,j,index=0;
 		int temp[index];
		i=beg;j=mid+1;index=0;
		while(i<=mid&&j<=end)
        {
            if(arr[i]<arr[j])
            {
                temp[index]=arr[i];
                i++;
            }
            else
            {
                temp[index]=arr[j];
                j++;
            }
        }
        if(i>mid)
        {
            while(j<=end)
            {
                temp[index]=arr[j];
                j++;
                index++;
            }
        }
        else
        {
            while(i<=mid)
            {
                 temp[index]=arr[i];
                i++;
                index++;
            }
        }
        for(int k=beg;k<index;k++)
            arr[k]=temp[k];

	}

    static void merge_sort(int arr[],int beg,int end)
	{
	    int mid=(beg+end)/2;
		if(beg<end)
		{
			merge_sort(arr,beg,mid);
			merge_sort(arr,mid+1,end);
			merge(arr,beg,mid,end);

		}
	}

	 public static void main(String[] args)
	 {
      Scanner sc=new Scanner(System.in);

	  System.out.println("enter size of array");
	  int size= sc.nextInt();
          int arr[]= new int [size];
 	  System.out.println("enter elements of array");

      for(int i=0;i<arr.length;i++)
          	arr[i]=sc.nextInt();
     System.out.println("elements of array are:");
     for(int i=0;i<arr.length;i++)
         	 System.out.println(arr[i]+" " );
     System.out.println("elements of sorted array are:");

     merge_sort(arr,0,arr.length-1);

     for(int i=0;i<arr.length;i++)
          	System.out.println(arr[i]+" " );
   	 }
}
