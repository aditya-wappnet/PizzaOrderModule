package PizzaOrderModule;

public class helper {
    //display function will use commonly everywhere when its required..
    public static  void diplay(String input []){

        for (int i =0;i<input.length;i++){
            System.out.println(input[i]);
        }
    }
    public static  void displayIngredient(String input[]){
        for (int i =0;i<input.length;i++){
            System.out.print(input[i]+",");
        }
    }

}
