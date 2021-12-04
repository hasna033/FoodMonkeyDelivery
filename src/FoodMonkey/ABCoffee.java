package FoodMonkey;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.*;

public class ABCoffee implements ICalculate {

    public String code;
    public String name;
    public String description;
    public double price;
    private ShoppingCart [] shoppingCartArr;
    private ArrayList items;
    private ArrayList users;
    private Menu menuItem;
    private final int NUM_CART = 100;

    public ABCoffee(){
        shoppingCartArr = new ShoppingCart[NUM_CART];
        users = new ArrayList();
        items = new ArrayList();

        addItem("001","Espresso","Single shot of Espresso",65);
        addItem("002","Ristretto", "Restricted/Short shot of espresso", 65);
        addItem("003","Doppio", "Double shot espresso", 85);
        addItem("004","Macchiato", "Espresso with dollop of steamed milk foam", 75);
        addItem("005","Flat white", "Espresso with hot milk and then later of foam", 90);
        addItem("006","Cafe latte", "Espresso with steamed milk and foam", 90);
        addItem("007","Piccolo latte", "Short size latte", 80);
        addItem("008","Cappuccino", "Shot of espresso topped with a deep layer of foamed milk", 90);
        addItem("009","Long black", "Espresso plus hot water", 75);
        addItem("010","Mocha", "Espresso and chocolate with steamed milk and foam", 95);
        addItem("011","Affogano", "Shot of espresso with vanilla ice-cream", 90);
        addItem("012","Hot choccolate", "Chocolate plus hot water", 85);

    }

    public void addItem(String code, String name, String description, double price){
        MenuItem menuItem = new MenuItem(code, name, description, price);
        items.add(menuItem);

    }

    //adding an item into a specific shopping cart
    public void addCartDetail(int index, String mCode, String mName, String mDescription, double mPrice)   throws ArrayIndexOutOfBoundsException
    {
        menuItem = new Menu(mCode,mName, mDescription, mPrice);
        shoppingCartArr[index].addItem(menuItem);
    }

    public Iterator createIterator(){
        return items.iterator();
    }

    public void printMenu() {
        System.out.println("AB Coffee MENU\n----");
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

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double costCalculate(String mCode) {
        if(mCode.equals("001")){
            return 65;
        }
        else if(mCode.equals("002")){
            return 65;
        }
        else if(mCode.equals("003")){
            return 85;
        }
        else if (mCode.equals("004")){
            return 75;
        }
        else if (mCode.equals("005")){
            return 90;
        }
        else if (mCode.equals("006")){
            return 90;
        }
        else if (mCode.equals("007")){
            return 80;
        }
        else if (mCode.equals("008")){
            return 90;
        }
        else if (mCode.equals("009")){
            return 75;
        }
        else if (mCode.equals("010")){
            return 95;
        }
        else if (mCode.equals("011")){
            return 90;
        }
        else if (mCode.equals("012")){
            return 85;
        }
        else{
            return 0;
        }
    }

    public String menuName(String mCode) {
        if(mCode.equals("001")){
            return ("Espresso");
        }
        else if(mCode.equals("002")){
            return ("Ristretto");
        }
        else if(mCode.equals("003")){
            return ("Doppio");
        }
        else if (mCode.equals("004")){
            return ("Macchiato");
        }
        else if (mCode.equals("005")){
            return ("Flat white");
        }
        else if (mCode.equals("006")){
            return ("Cafe latte");
        }
        else if (mCode.equals("007")){
            return ("Piccolo latte");
        }
        else if (mCode.equals("008")){
            return ("Cappuccino");
        }
        else if (mCode.equals("009")){
            return ("Long black");
        }
        else if (mCode.equals("010")){
            return ("Mocha");
        }
        else if (mCode.equals("011")){
            return ("Affogano");
        }
        else if (mCode.equals("012")){
            return ("Hot choccolate");
        }
        else{
            return ("\nError: This menu is out of bound from Menu list!!");
        }
    }

    public String menuDescription(String mCode) {
        if(mCode.equals("001")){
            return ("Single shot of Espresso");
        }
        else if(mCode.equals("002")){
            return ("Restricted/Short shot of espresso");
        }
        else if(mCode.equals("003")){
            return ("Double shot espresso");
        }
        else if (mCode.equals("004")){
            return ("Espresso with dollop of steamed milk foam");
        }
        else if (mCode.equals("005")){
            return ("Espresso with hot milk and then later of foam");
        }
        else if (mCode.equals("006")){
            return ("Espresso with steamed milk and foam");
        }
        else if (mCode.equals("007")){
            return ("Short size latte");
        }
        else if (mCode.equals("008")){
            return ("Shot of espresso topped with a deep layer of foamed milk");
        }
        else if (mCode.equals("009")){
            return ("Espresso plus hot water");
        }
        else if (mCode.equals("010")){
            return ("Espresso and chocolate with steamed milk and foam");
        }
        else if (mCode.equals("011")){
            return ("Shot of espresso with vanilla ice-cream");
        }
        else if (mCode.equals("012")){
            return ("Chocolate plus hot water");
        }
        else{
            return ("Error: This menu is out of bound from Menu list!!");
        }
    }

    @Override
    public double deliveryPrice(){
        return 40;
    }

    @Override
    public double promotion(){
        return 10;
    }

}
