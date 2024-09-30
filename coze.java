package javaLocal;
import java.util.*;
public class coze {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought:");
        int pizza = sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        int puffs = sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        int CoolDrinks = sc.nextInt();
        int pizzaa = Math.abs(pizza)*100;
        int puffss = Math.abs(puffs)*20;
        int CoolDrinkss = Math.abs(CoolDrinks)*10;
        System.out.println();
        System.out.println("Bill details ");
        System.out.println("No of pizza "+pizza);
        System.out.println("No of puffs "+puffs);
        System.out.println("No of coolDrinks "+CoolDrinks);
        int totalPrice;
        totalPrice = pizzaa+puffss+CoolDrinkss;
        System.out.println("total price "+totalPrice);
        System.out.println("Enjoy your day!");
    }
}
