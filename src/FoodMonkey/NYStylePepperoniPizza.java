package FoodMonkey;

public class NYStylePepperoniPizza extends Pizza{
    public NYStylePepperoniPizza() {
        name = "NY Style and Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Plum tomato sauce";
        toppings.add("Mozzarella, Parmesan, Eggplant, Spinach, Black Olives and Pepperoni");
        System.out.println("Order's name: "+name+" Dough: "+dough+" Sauce: "+sauce+" Topped with: Mozzarella, Parmesan, Eggplant, Spinach, Black Olives and Pepperoni");

    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
}
