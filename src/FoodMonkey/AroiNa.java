package FoodMonkey;

import java.util.ArrayList;
import java.util.Iterator;

public class AroiNa implements ICalculate{
    ArrayList items;

    public AroiNa(){
        items = new ArrayList();

        addItem("001","Gaeng Keow Wan", "Sweet green curry", 180);
        addItem("002","Pad Thai", "Stir-fried rice noodle dish", 60);
        addItem("003","Kai Jiew Kung Saap", "Thai-style Omelet", 50);
        addItem("004","Kao Niew Gai Yang", "Sticky rice with grilled chicken", 60);
        addItem("005","Kao Niew Moon", "Sticky rice with mango", 100);
        addItem("006","Gang Massaman", "Massaman curry", 180);
        addItem("007","Som tam", "Thai papaya salad", 60);
        addItem("008","Tom Kha Gai", "Spicy and sour hot soup with coconut milk in Thai cuisine", 180);
        addItem("009","Pad Kra Pao", "Stir-fried holy basil with chicken", 60);

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
            return 180;
        }
        else if(mCode.equals("002")){
            return 60;
        }
        else if(mCode.equals("003")){
            return 50;
        }
        else if (mCode.equals("004")){
            return 60;
        }
        else if (mCode.equals("005")){
            return 100;
        }
        else if (mCode.equals("006")){
            return 180;
        }
        else if (mCode.equals("007")){
            return 60;
        }
        else if (mCode.equals("008")){
            return 180;
        }
        else if (mCode.equals("009")){
            return 60;
        }
        else{
            return 0;
        }
    }

    public String menuName(String mCode) {
        if(mCode.equals("001")){
            return ("Gaeng Keow Wan");
        }
        else if(mCode.equals("002")){
            return ("Pad Thai");
        }
        else if(mCode.equals("003")){
            return ("Kai Jiew Kung Saap");
        }
        else if (mCode.equals("004")){
            return ("Kao Niew Gai Yang");
        }
        else if (mCode.equals("005")){
            return ("Kao Niew Moon");
        }
        else if (mCode.equals("006")){
            return ("Gang Massaman");
        }
        else if (mCode.equals("007")){
            return ("Som tam");
        }
        else if (mCode.equals("008")){
            return ("Tom Kha Gai");
        }
        else if (mCode.equals("009")){
            return ("Pad Kra Pao");
        }
        else{
            return ("\nError: This menu is out of bound from Menu list!!");
        }
    }

    public String menuDescription(String mCode) {
        if(mCode.equals("001")){
            return ("Sweet green curry");
        }
        else if(mCode.equals("002")){
            return ("Stir-fried rice noodle dish");
        }
        else if(mCode.equals("003")){
            return ("Thai-style Omelet");
        }
        else if (mCode.equals("004")){
            return ("Sticky rice with grilled chicken");
        }
        else if (mCode.equals("005")){
            return ("Sticky rice with mango");
        }
        else if (mCode.equals("006")){
            return ("Massaman curry");
        }
        else if (mCode.equals("007")){
            return ("Thai papaya salad");
        }
        else if (mCode.equals("008")){
            return ("Spicy and sour hot soup with coconut milk in Thai cuisine");
        }
        else if (mCode.equals("009")){
            return ("Stir-fried holy basil with chicken");
        }
        else{
            return ("Error: This menu is out of bound from Menu list!!");
        }
    }

    @Override
    public double deliveryPrice(){
        return 50;
    }

    @Override
    public double promotion(){
        return 10;
    }

}
