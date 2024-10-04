package javaLocal;
import java.util.*;
public class recu1 {
    public static void prinNumber(int n){
        if(n==6 )
        return ;
        
        System.out.println(n);
        prinNumber(n+1); 
    }
    public static void main(String agr[]){
       int n =1;
       prinNumber(n);
    }
}
