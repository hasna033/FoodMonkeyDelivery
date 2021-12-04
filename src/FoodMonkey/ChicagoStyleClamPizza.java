package FoodMonkey;

public class ChicagoStyleClamPizza extends Pizza{
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Reggiano, Fresh Clams");
        System.out.println("Order's name: "+name+" Dough: "+dough+" Sauce: "+sauce+" Topped with: Reggiano and Fresh Clams");
    }
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
}
