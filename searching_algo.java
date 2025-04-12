import java.util.*;
public class searching_algo {
//print array 
    public static void PrintArray(int arr[],int size){
        for(int i=0;i<size;i++)
          System.out.print(arr[i]+" " );
         System.out.println();  
}
//complexity O(n)
    public static void linearSearch(int arr[],int size,int item){
        for(int i=0;i<size;i++){
            if(arr[i]==item){
               System.out.println("item found at index"+" "+i+" at position"+" "+(i+1));
            }
        }
 }


//complexity O(nlogn)
    public static void binarySearch(int arr[],int size,int item){
        int s=0,e=size-1,mid;
        while(s<=e){
             mid=s+(e-s)/2;
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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
         int size= sc.nextInt();
        int arr[]= new int [size];
        System.out.println("enter elements of array");
        //input
         for(int i=0;i<size;i++)
          arr[i]=sc.nextInt();

          System.out.println("elements of array are:");
          PrintArray(arr,size);
          System.out.print("enter the item you want to search:");
          int item=sc.nextInt();
         //linearSearch(arr,size,item);
          binarySearch(arr,size,item);
 }
 }

    

