import java.util.*;
class A
{
	 void bubbleSort(int arr[])
	{
	  for(int i=0;i<arr.length-1;i++)
      {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
            }
      }

    }

    void insertion_sort(int arr[])
    {
        int j,temp;
        for(int i=1;i<arr.length;i++)
        {
            j=i-1;
            temp=arr[i];
            while(j>=0&&arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

     void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int t = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = t;
                j--;
            }
        }
    }

      void binarySearch(int arr[],int item)
    {
        int s=0,e=arr.length-1,mid;
        while(s<=e)
        {
            mid=(s+e)/2;
            if(arr[mid]==item){
              System.out.println("item found at index"+" "+mid+" at position"+" "+(mid+1));
              break;
            }
            else if(arr[mid]>item)
              e=mid-1;
            else
              s=mid+1;
        }
          if(s>e)
            System.out.println("item not found");
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements of  array");
        int size= sc.nextInt();
        int arr[]= new int [size];
        A obj=new A();
        System.out.println("enter elements of array");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();

        System.out.println("elements of array are:");
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" " );

        System.out.println("elements of sorted array are:");
        //obj.bubbleSort(arr);
       // obj.insertion_sort(arr);
        obj.insertionSort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" " );

        System.out.print("enter the item you want to search:");
        int item=sc.nextInt();
        obj.binarySearch(arr,item);
    }
 }
