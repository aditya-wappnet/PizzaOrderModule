package PizzaOrderModule;

import java.util.Scanner;

public class PizzaSize  {


    //SizeOfPizza function will take input from user .
    //SizeOfPizza function will return Size of Pizza .
    public static String SizeOfPizza(){
        Scanner sc = new Scanner(System.in);

        int sizeOfpizza = sc.nextInt();
        //Will Not Get Out from loop without Entering exact Data..
        while (sizeOfpizza!=4){
            if (sizeOfpizza==1){
                return "RegularSize";
            } else if (sizeOfpizza==2) {
                return "MediumSize";
            } else if (sizeOfpizza==3) {
                return "LargeSize";
            }else{
                System.out.println("We don't have any other Size of Pizza Select From given One!!");
                sizeOfpizza = sc.nextInt();
            }
        }
        return SizeOfPizza();
    }
   static String Size = SizeOfPizza();

}
