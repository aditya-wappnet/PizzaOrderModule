package PizzaOrderModule;

import java.util.Scanner;

import static PizzaOrderModule.Category.CategoryPizza;

public  class PizzaIngredients {

    //Stored Ingredients of Pizza
    static String tomchiIngredients [] ={"tomato", "onion", "chilly & cheese"};
    static String caponitoIngredients [] ={"capsicum", "onion", "tomato & cheese"};
    static String redIndianIngredients [] ={"cheese", "paneer","chilly"};
    static String partyloversIngredients [] = {"cheese","sweetcorn" ,"capsicum" , "Tomato"};
    static String americanHeatIngredients [] = {"cheese","spinach","capsicum","babycorn" , "Olives"};
    static String reUnionIngredients [] = {"cheese","spinach","Capsicum","babycorn","olives"};

    Category c = new Category();
    public static  String[] printIngredients(){
        Scanner sc = new Scanner(System.in);
        int selectPizzaItem = sc.nextInt();
        if (CategoryPizza=="Classic") {
            if (selectPizzaItem==1) {
                System.out.print("<Tomchi>");
                return tomchiIngredients;

            }else{
                System.out.print("<Caponito>");
                return caponitoIngredients;
            }
        } else if (CategoryPizza=="Premium") {
            if (selectPizzaItem==1){
                System.out.print("<Red Indians>");
                return redIndianIngredients;
            }else{
                System.out.print("<Party Lovers>");
                return partyloversIngredients;
            }
        }else if (CategoryPizza=="Supreme"){
            if (selectPizzaItem==1){
                System.out.print("<American Heat>");
                return americanHeatIngredients;
            }else{
                System.out.print("<Re-Union>");
                return reUnionIngredients;
            }
        }
        return printIngredients();

    }


}
