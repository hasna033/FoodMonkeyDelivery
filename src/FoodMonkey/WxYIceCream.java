package FoodMonkey;

import java.util.ArrayList;
import java.util.Iterator;

public class WxYIceCream implements ICalculate{
    ArrayList items;

    public WxYIceCream(){
        items = new ArrayList();

        addItem("001","Blueberry Yogurt", "Homemade cone ice-cream, Blueberry Yogurt flavor", 25);
        addItem("002","Apple Kiwi Sorbet", "Homemade cone ice-cream, Apple Kiwi Sorbet flavor", 25);
        addItem("003","Cappuccino Choc Chip", "Homemade cone ice-cream, Cappuccino Choc Chip flavor", 30);
        addItem("004","Strawberry Cheese", "Homemade cone ice-cream, Strawberry Cheese flavor", 30);
        addItem("005","Cocoa Pudding", "Homemade cone ice-cream, Cocoa Pudding flavor", 30);
        addItem("006","Coconut", "Homemade cone ice-cream, Coconut flavor", 25);
        addItem("007","Double malted Vanilla", "Homemade cone ice-cream, Double malted Vanilla flavor", 25);
        addItem("008","Cocoa Brownie", "Homemade cone ice-cream, Cocoa Brownie flavor", 30);
        addItem("009","Lychee", "Homemade cone ice-cream, Lychee flavor", 25);
        addItem("010","Passion Fruit Sorbet", "Homemade cone ice-cream, Passion Fruit Sorbet flavor", 25);
        addItem("011","Raspberry White Choc", "Homemade cone ice-cream, Raspberry White Choc flavor", 30);
        addItem("012","Durian", "Homemade cone ice-cream, Durian flavor", 30);
        addItem("013","Redbean & Green Cake", "Homemade cone ice-cream, Redbean & Green Cake flavor", 25);
        addItem("014","Redbean", "Homemade cone ice-cream, Redbean flavor", 25);

    }

    public void addItem(String code, String name, String description, double price){
        MenuItem menuItem = new MenuItem(code, name, description, price);
        items.add(menuItem);

    }

    public void printMenu() {
        System.out.println("WxY Ice-Cream MENU\n----");
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

    @Override
    public double costCalculate(String mCode) {
        if(mCode.equals("001")){
            return 25;
        }
        else if(mCode.equals("002")){
            return 25;
        }
        else if(mCode.equals("003")){
            return 30;
        }
        else if (mCode.equals("004")){
            return 30;
        }
        else if (mCode.equals("005")){
            return 30;
        }
        else if (mCode.equals("006")){
            return 25;
        }
        else if (mCode.equals("007")){
            return 25;
        }
        else if (mCode.equals("008")){
            return 30;
        }
        else if (mCode.equals("009")){
            return 25;
        }
        else if (mCode.equals("010")){
            return 25;
        }
        else if (mCode.equals("011")){
            return 30;
        }
        else if (mCode.equals("012")){
            return 30;
        }
        else if (mCode.equals("013")){
            return 25;
        }
        else if (mCode.equals("014")){
            return 30;
        }
        else{
            return 0;
        }
    }

    public String menuName(String mCode) {
        if(mCode.equals("001")){
            return ("Blueberry Yogurt");
        }
        else if(mCode.equals("002")){
            return ("Apple Kiwi Sorbet");
        }
        else if(mCode.equals("003")){
            return ("Cappuccino Choc Chip");
        }
        else if (mCode.equals("004")){
            return ("Strawberry Cheese");
        }
        else if (mCode.equals("005")){
            return ("Cocoa Pudding");
        }
        else if (mCode.equals("006")){
            return ("Coconut");
        }
        else if (mCode.equals("007")){
            return ("Double malted Vanilla");
        }
        else if (mCode.equals("008")){
            return ("Cocoa Brownie");
        }
        else if (mCode.equals("009")){
            return ("Lychee");
        }
        else if (mCode.equals("010")){
            return ("Passion Fruit Sorbet");
        }
        else if (mCode.equals("011")){
            return ("Raspberry White Choc");
        }
        else if (mCode.equals("012")){
            return ("Durian");
        }
        else if (mCode.equals("013")){
            return ("Redbean & Green Cake");
        }
        else if (mCode.equals("014")){
            return ("Redbean");
        }
        else{
            return ("\nError: This menu is out of bound from Menu list!!");
        }
    }

    public String menuDescription(String mCode) {
        if(mCode.equals("001")){
            return ("Homemade cone ice-cream, Blueberry Yogurt flavor");
        }
        else if(mCode.equals("002")){
            return ("Homemade cone ice-cream, Apple Kiwi Sorbet flavor");
        }
        else if(mCode.equals("003")){
            return ("Homemade cone ice-cream, Cappuccino Choc Chip flavor");
        }
        else if (mCode.equals("004")){
            return ("Homemade cone ice-cream, Strawberry Cheese flavor");
        }
        else if (mCode.equals("005")){
            return ("Homemade cone ice-cream, Cocoa Pudding flavor");
        }
        else if (mCode.equals("006")){
            return ("Homemade cone ice-cream, Coconut flavor");
        }
        else if (mCode.equals("007")){
            return ("Homemade cone ice-cream, Double malted Vanilla flavor");
        }
        else if (mCode.equals("008")){
            return ("Homemade cone ice-cream, Cocoa Brownie flavor");
        }
        else if (mCode.equals("009")){
            return ("Homemade cone ice-cream, Lychee flavor");
        }
        else if (mCode.equals("010")){
            return ("Homemade cone ice-cream, Passion Fruit Sorbet flavor");
        }
        else if (mCode.equals("011")){
            return ("Homemade cone ice-cream, Raspberry White Choc flavor");
        }
        else if (mCode.equals("012")){
            return ("Homemade cone ice-cream, Durian flavor");
        }
        else if (mCode.equals("013")){
            return ("Homemade cone ice-cream, Redbean & Green Cake flavor");
        }
        else if (mCode.equals("014")){
            return ("Homemade cone ice-cream, Redbean flavor");
        }
        else{
            return ("Error: This menu is out of bound from Menu list!!");
        }
    }

    @Override
    public double deliveryPrice(){
        return 20;
    }

    @Override
    public double promotion(){
        return 5;
    }

}
