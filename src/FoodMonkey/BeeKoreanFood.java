package FoodMonkey;

import java.util.ArrayList;
import java.util.Iterator;

public class BeeKoreanFood implements ICalculate{
    ArrayList items;

    public BeeKoreanFood(){
        items = new ArrayList();

        addItem("001","Bibimbap", "Korean rice dish.", 180);
        addItem("002","Buchimgae", "Korean pancake", 150);
        addItem("003","Naengmyeon", " Korean noodle dish of long and thin handmade noodles", 190);
        addItem("004","Samgyetang", "Ginseng chicken soup", 250);
        addItem("005","Kimchi jjigae", "Jjigae, or stew-like Korean dish", 200);
        addItem("006","Bulgogi", "Korean-style grilled or roasted dish", 200);
        addItem("007","Jajangmyeon", "Korean noodle dish topped with a thick sauce made of chunjang, diced pork, and vegetables.", 150);
        addItem("008","Takkalbi", "Spicy stir-fried chicken", 200);
        addItem("009","Tteokbokki", "Simmered rice cake", 150);

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
            return 150;
        }
        else if(mCode.equals("003")){
            return 190;
        }
        else if (mCode.equals("004")){
            return 250;
        }
        else if (mCode.equals("005")){
            return 200;
        }
        else if (mCode.equals("006")){
            return 200;
        }
        else if (mCode.equals("007")){
            return 150;
        }
        else if (mCode.equals("008")){
            return 200;
        }
        else if (mCode.equals("009")){
            return 150;
        }
        else{
            return 0;
        }
    }

    public String menuName(String mCode) {
        if(mCode.equals("001")){
            return ("Bibimbap");
        }
        else if(mCode.equals("002")){
            return ("Buchimgae");
        }
        else if(mCode.equals("003")){
            return ("Naengmyeon");
        }
        else if (mCode.equals("004")){
            return ("Samgyetang");
        }
        else if (mCode.equals("005")){
            return ("Kimchi jjigae");
        }
        else if (mCode.equals("006")){
            return ("Bulgogi");
        }
        else if (mCode.equals("007")){
            return ("Jajangmyeon");
        }
        else if (mCode.equals("008")){
            return ("Takkalbi");
        }
        else if (mCode.equals("009")){
            return ("Tteokbokki");
        }
        else{
            return ("\nError: This menu is out of bound from Menu list!!");
        }
    }

    public String menuDescription(String mCode) {
        if(mCode.equals("001")){
            return ("Korean rice dish.");
        }
        else if(mCode.equals("002")){
            return ("Korean pancake.");
        }
        else if(mCode.equals("003")){
            return ("Korean noodle dish of long and thin handmade noodles");
        }
        else if (mCode.equals("004")){
            return ("Ginseng chicken soup");
        }
        else if (mCode.equals("005")){
            return ("Jjigae, or stew-like Korean dish");
        }
        else if (mCode.equals("006")){
            return ("Korean-style grilled or roasted dish");
        }
        else if (mCode.equals("007")){
            return ("Korean noodle dish topped with a thick sauce made of chunjang, diced pork, and vegetables.");
        }
        else if (mCode.equals("008")){
            return ("Spicy stir-fried chicken");
        }
        else if (mCode.equals("009")){
            return ("Simmered rice cake");
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
        return 15;
    }

}
