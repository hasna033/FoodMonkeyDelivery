package FoodMonkey;

import java.util.ArrayList;
import java.util.Iterator;

public class PapaPizza implements ICalculate{
    PapaPizza pizza;
    ArrayList items;
    String name;
    String dough;
    String sauce;

    public PapaPizza(){
        items = new ArrayList();

        addItem("001","New York Style Cheese Pizza", "Plum tomato sauce, Mozzarella, Parmesan, Oregano", 399);
        addItem("002","New York Style Veggie Pizza", "Plum tomato sauce, Mozzarella, Parmesan, Eggplant, Spinach, Black olives", 499);
        addItem("003","New York Style Clam Pizza", "Plum tomato sauce, Mozzarella, Parmesan, Clam", 399);
        addItem("004","New York Style Pepperoni Pizza", "Plum tomato sauce, Mozzarella, Parmesan, Pepperoni", 350);
        addItem("005","Chicago Style Cheese Pizza", "Marinara sauce, Reggiano, Garlic", 370);
        addItem("006","Chicago Style Veggie Pizza", "Marinara sauce, Reggiano, Mushrooms, Onions, Red peppers", 399);
        addItem("007","Chicago Style Clam Pizza", "Marinara sauce, Reggiano, Fresh Clams", 350);
        addItem("008","Chicago Style Pepperoni Pizza", "Marinara sauce, Reggiano, Mushrooms, Onions, Red peppers, Pepperoni", 450);

    }

    public void addItem(String code, String name, String description, double price){
        MenuItem menuItem = new MenuItem(code, name, description, price);
        items.add(menuItem);

    }

    public void printMenu() {
        System.out.println("Papa Pizza MENU\n----");
        printMenu(items.iterator());

    }
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getCode() + " ");
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }



    public String getName() {
        return name;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("NY")) {
            if (type.equals("cheese")) {
                pizza = new NYStyleCheesePizza();
            }else if (type.equals("veggie")) {
                pizza = new NYStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new NYStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new NYStylePepperoniPizza();
            }
        } else if (style.equals("Chicago")) {
            if (type.equals("cheese")) {
                pizza = new ChicagoStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new ChicagoStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new ChicagoStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new ChicagoStylePepperoniPizza();
            }
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


    public double costCalculate(String style, String type) {
        if (style.equals("NY")) {
            if (type.equals("cheese")) {
                return 399;
            } else if (type.equals("veggie")) {
                return 499;
            } else if (type.equals("clam")) {
                return 399;
            } else if (type.equals("pepperoni")) {
                return 350;
            }
        } else if (style.equals("Chicago")) {
            if (type.equals("cheese")) {
                return 370;
            } else if (type.equals("veggie")) {
                return 399;
            } else if (type.equals("clam")) {
                return 350;
            } else if (type.equals("pepperoni")) {
                return 450;
            }
        } else {
            return 0;
        }
        return 0;
    }

    public String menuName(String style, String type) {
        if (style.equals("NY")) {
            if (type.equals("cheese")) {
                return ("New York Style Cheese Pizza");
            } else if (type.equals("veggie")) {
                return ("New York Style Veggie Pizza");
            } else if (type.equals("clam")) {
                return ("New York Style Clam Pizza");
            } else if (type.equals("pepperoni")) {
                return ("New York Style Pepperoni Pizza");
            }
        } else if (style.equals("Chicago")) {
            if (type.equals("cheese")) {
                return ("Chicago Style Cheese Pizza");
            } else if (type.equals("veggie")) {
                return ("Chicago Style Veggie Pizza");
            } else if (type.equals("clam")) {
                return ("Chicago Style Clam Pizza");
            } else if (type.equals("pepperoni")) {
                return ("Chicago Style Pepperoni Pizza");
            }
        } else{
            return ("\nError: This menu is out of bound from Menu list!!");
        }
        return ("\nError: This menu is out of bound from Menu list!!");
    }

    @Override
    public double costCalculate(String mCode) {
        return 0;
    }

    public double deliveryPrice(){
        return 50;
    }

    public double promotion(){
        return 15;
    }
}
