package PizzaOrderModule;

import java.util.Scanner;

public class SelectCuisine  {
    //UserInterface to Display  Cuisine type.
    static String[] cuisine ={"   Select Cuisine\n"+" \t1. Regular"," \t2. Jain"," \t3. Non-veg","\t4. Exit"};

    //selectCuisine function will take input from user .
    //selectCuisine function will return Cuisine type.
    public String selectcuisine(){


        Scanner sc = new Scanner(System.in);
        int  selectCuisine = sc.nextInt();
        //Will Not Get Out from loop without Entering exact Data..
        while (selectCuisine!=4) {

            if (selectCuisine == 1) {
                return "Regular";
            } else if (selectCuisine == 2) {
                return "Jain";
            } else if (selectCuisine == 3) {
                return "Non-Veg";
            } else if (selectCuisine==4) {
               break;
            } else {
                System.out.println("Only Choose from these Cuisine");  //print these message if user ask for wrong order..
                selectCuisine = sc.nextInt();
            }
        }
        return selectcuisine();
    }


}
