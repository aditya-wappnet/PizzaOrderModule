package PizzaOrderModule;

import java.util.Scanner;

public class Confirmation {
    static String[] confirm ={"\n"+" \t1. Order"," \t2. Cancel"};
    public static String confirmation(){
        Scanner sc = new Scanner(System.in);
        int confirm = sc.nextInt();
        if (confirm==1){
            return "Your Order is Confirmed";
        }else{
            return  "Cancelled!!";
        }

    }
}
