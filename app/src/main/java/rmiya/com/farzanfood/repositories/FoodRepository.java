package rmiya.com.farzanfood.repositories;

import java.util.ArrayList;
import java.util.List;

import rmiya.com.farzanfood.models.Food;

/**
 * Created by Ronald Miya de la Cruz on 27/03/2018.
 */

public class FoodRepository {

    private static List<Food> food = new ArrayList<>();

    static {
        food.add(new Food(10, "Causa Rellena", "15 - 30 MIN", "Platos Frios", 20.00, "causa"));
        food.add(new Food(20, "Pizza", "5 - 10 MIN", "Comida Rapida", 15.00, "pizza"));
        food.add(new Food(30, "Tequeño", "5 - 10 MIN", "Aperitivo", 5.00, "tequeno"));
        food.add(new Food(40, "Triple", "5 - 10 MIN", "Sandwich", 5.00, "triple"));
    }

    public static List<Food> getList(){
        return food;
    }

}
