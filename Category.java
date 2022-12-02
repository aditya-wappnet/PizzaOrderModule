package PizzaOrderModule;

import java.util.Scanner;

public class Category {
    String pizza_Category []={"  Select Category\n"+" \t1. Classic"," \t2. Premium"," \t3. Supreme","\t4. Exit"};

    //CategoryOfPizza function will take input from user .
    //CategoryOfPizza function will return Category of Pizza .

    public static String CategoryOfPizza(){
        Scanner sc = new Scanner(System.in);
        int selectCategory = sc.nextInt();
        //Will Not Get Out from loop without Entering exact Data..
        while (selectCategory!=4){
            if (selectCategory==1){
                return "Classic";
            } else if (selectCategory==2) {
                return "Premium";
            } else if (selectCategory==3) {
                return "Supreme";
            }else{
                //print these message if user ask for wrong order
                System.out.println("We don't have any other Category of Pizza Select From given One!!");
                selectCategory = sc.nextInt();
            }
        }
        return CategoryOfPizza();
    }
    static String CategoryPizza = CategoryOfPizza();

}
