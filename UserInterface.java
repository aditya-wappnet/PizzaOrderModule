package PizzaOrderModule;

public class UserInterface {
    public static void main(String[] args) {

     System.out.println("Welcome To Domino's Pizza");    //Headline of Application.e.g Proj/buIsNess Name.

        helper.diplay(SelectCuisine.cuisine);

        SelectCuisine Sc = new SelectCuisine(); //obj of Cuisine class

        String Cuisine = Sc.selectcuisine();   //var to store return value of Sc.selectcuisine() function.

        //UserInterface to Display PizzaSize
        String pizza_Size []={"  Select PizzaSize\n"+" \t1. Regular"," \t2. Medium"," \t3. Large","\t4. Exit"};
        helper.diplay(pizza_Size);

        PizzaSize ps = new PizzaSize();//obj of PizzaSize Class..

        //var to store return value of ps.SizeOfPizza() function.

        String pizza_Category []={"  Select Category\n"+" \t1. Classic"," \t2. Premium"," \t3. Supreme","\t4. Exit"};
        helper.diplay(pizza_Category);

          helper.diplay(PizzaITem.pizzaItem());



        String ingredients [] = PizzaIngredients.printIngredients();
        System.out.print(Category.CategoryPizza+" " + ps.Size +" With Ingredients ");
        helper.displayIngredient(ingredients);
        System.out.print("Worth Rupees : "+ PizzaPrice.pizzaprice());

        helper.diplay(Confirmation.confirm);
        System.out.println(Confirmation.confirmation());
    }
}
