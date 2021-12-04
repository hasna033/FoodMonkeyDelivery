package FoodMonkey;

public class NYStyleVeggiePizza extends Pizza{
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Plum tomato sauce";
        toppings.add("Mozzarella, Parmesan, Eggplant, Spinach and Black Olives");
        System.out.println("Order's name: "+name+" Dough: "+dough+" Sauce: "+sauce+" Topped with: Mozzarella, Parmesan, Eggplant, Spinach and Black Olives");

    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
}
