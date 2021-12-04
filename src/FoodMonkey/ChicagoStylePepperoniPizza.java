package FoodMonkey;

public class ChicagoStylePepperoniPizza extends Pizza{
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Reggiano, Mushrooms, Onions, Red peppers, Pepperoni");
        System.out.println("Order's name: "+name+" Dough: "+dough+" Sauce: "+sauce+" Topped with: Reggiano, Mushrooms, Onions, Red peppers and Pepperoni");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
}
