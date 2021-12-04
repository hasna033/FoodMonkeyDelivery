package FoodMonkey;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Plum tomato sauce";
        toppings.add("Grated Reggiano Cheese");
        System.out.println("Order's name: "+name+" Dough: "+dough+" Sauce: "+sauce+" Topped with: Grated Reggiano Cheese");

    }
}
