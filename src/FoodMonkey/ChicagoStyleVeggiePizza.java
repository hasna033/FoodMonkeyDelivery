package FoodMonkey;

public class ChicagoStyleVeggiePizza extends Pizza{
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Reggiano, Mushrooms, Onions, Red peppers");
        System.out.println("Order's name: "+name+" Dough: "+dough+" Sauce: "+sauce+" Topped with: Reggiano, Mushrooms, Onions, Red peppers");

    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

}
