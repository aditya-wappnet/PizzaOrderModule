package PizzaOrderModule;

public class PizzaITem {
    //UserInterface to ClassicPizzaItem
    static String[] ClassicPizzaItem =  {"  Select ClassicPizza\n"+" \t1. Tomchi"," \t2. Caponito","\t3. Exit"};


    //UserInterface to PremiumPizzaItem
    static String[] PremiumPizzaItem =  {"  Select PremiumPizza\n"+" \t1. Red Indian"," \t2. Party Lovers","\t3. Exit"};


    static String[] SupremePizzaItem =  {"  Select SupremePizza\n"+" \t1. AmericanHeat"," \t2. Re-Union","\t3. Exit"};

UserInterface UI = new UserInterface();
public static String[] pizzaItem(){
   String selectpizza = Category.CategoryPizza;
   if (selectpizza=="Classic"){
       return ClassicPizzaItem;
   } else if (selectpizza=="Premium") {
        return PremiumPizzaItem;
   }  else {
       return SupremePizzaItem;
   }
}

}
