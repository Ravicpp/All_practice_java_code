package javaLocal;
import java.util.*;

public class recu2 {

    public static void printSum(int i, int n ,int sum){
    if(i==0){
        sum +=i;
        System.out.println(i);
        return;
    }
    sum +=i;
    printSum(+1, n, sum);
    System.out.println(i);
    }
public static void main(String arg[]){
    printSum(1,5,0);
}
}
