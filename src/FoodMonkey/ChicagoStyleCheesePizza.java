package FoodMonkey;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Reggiano, Garlic");
        System.out.println("Order's name: "+name+" Dough: "+dough+" Sauce: "+sauce+" Topped with: Reggiano and Garlic");
    }
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }


}
