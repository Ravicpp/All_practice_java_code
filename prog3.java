package javaLocal;

public class prog3 {
    public static void main(String agr[]){
        int n=4;
        //outer loop
        for(int i=n;i>=1;i--){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*"); // this is print exact apposite in pyramid 
            }
            System.out.println();
        }
    }
}
