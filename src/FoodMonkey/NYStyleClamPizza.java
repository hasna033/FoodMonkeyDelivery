package FoodMonkey;

public class NYStyleClamPizza extends Pizza{
    public NYStyleClamPizza() {
        name = "NY Style and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Plum tomato sauce";
        toppings.add("Mozzarella, Parmesan and Clams");
        System.out.println("Order's name: "+name+" Dough: "+dough+" Sauce: "+sauce+" Topped with: Mozzarella, Parmesan and Clams");

    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
}
