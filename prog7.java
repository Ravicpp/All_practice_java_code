package javaLocal;
import java.util.*;
public class prog7 {
    public static void main(String arg[]){
        int n=5;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                int sum=i+j;
                //check odd and even
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
