package PizzaOrderModule;

import static PizzaOrderModule.Category.CategoryPizza;
import static PizzaOrderModule.PizzaSize.*;

public class PizzaPrice {

    public static int pizzaprice(){
        if (CategoryPizza=="Classic"){
            if (Size=="Regular"){
                return 135;
            } else if (Size=="Medium") {
                return 210;
            }else{
                return 360;
            }
        }else if (CategoryPizza=="Premium"){
            if (Size=="Regular"){
                return 165;
            } else if (Size =="Medium") {
                return 240;
            }else{
                return 395;
            }
        } else if (CategoryPizza=="Supreme") {
            if (Size=="Regular"){
                return 190;
            } else if (Size =="Medium") {
                return 290;
            }else {
                return 425;
            }
        }
        return pizzaprice();
    }
}
