package FoodMonkey;

import java.util.Iterator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.*;

public class FoodMonkey {
    private static int numOfCart;
    public static ABCoffee abCoffee;
    private static ShoppingCart  shoppingCart;
    private static User user;
    private static ArrayList items;
    private static ArrayList users;
    private static ArrayList uItems;
    public static PapaPizza papaPizza;
    private static WxYIceCream wxYIceCream;

    //displaying main menu.
    public static void mainMenu() {

        System.out.println("\nWelcome to Food Monkey Delivery System!");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Please select restaurant!");
        System.out.println("-----------------------------------------------------------");
        System.out.println("1. AB Coffee");
        System.out.println("2. Papa Pizza");
        System.out.println("3. WxY Ice Cream");
        System.out.println("4. Bee Korean Food");
        System.out.println("5. AROI NA");
        System.out.println("0. Exit");
        System.out.println("-----------------------------------------------------------");

        //Get user input
        int userInput = stringToInt(input("Please press the number : "));
        System.out.print("\n");
        if((userInput >= 0) &&(userInput <6)){
            if(userInput == 1) abCoffee();
            else if(userInput == 2) papaPizza();
            else if(userInput == 3) wxYIceCream();
            else if(userInput == 4) beeKoreanFood();
            else if(userInput == 5) aroiNa();
            else if(userInput == 0) System.exit(0);
            }
        else{
            System.out.println("-----------------------------------------------------------");
            System.out.println("!! Error choice !! ");
            System.out.println("-----------------------------------------------------------");
            String ch = input("[Any key to continue]");
            System.out.println("\n");
            mainMenu();
        }
    }

    private static void aroiNa() {
        AroiNa aroi = new AroiNa();
        aroi.printMenu();
        System.out.println("-----------------------------------------------------------");
        String mCode = input("Please enter menu code:");
        String mName = aroi.menuName(mCode);
        String mDescription = aroi.menuDescription(mCode);
        double mPrice = aroi.costCalculate(mCode);

        double pricePlusDeliv = (mPrice + aroi.deliveryPrice());
        double promotion = ((mPrice + aroi.deliveryPrice()) * aroi.promotion())/100;
        double total = pricePlusDeliv-promotion;
        Date now = new Date();
        String orderDate =DateFormat.getDateInstance(DateFormat.SHORT).format(now) + "  " + DateFormat.getTimeInstance(DateFormat.SHORT).format(now);

        System.out.println("Your order: " + mCode +" " + mName + " -- " + mDescription + " " + mPrice + " Baht");


        String conChar = input("Do you want to checkout? [Y:Yes, N: No]:");
        if(conChar.toUpperCase().equals("Y")){
            String uName = input("Please Enter Username : ");
            String uAddr = input("Please Enter your Address (for delivery service): ");
            String uPhoneNum = input("Please Enter your Phone number: ");
            System.out.println("-----------------------------------------------------------\n\n");

            System.out.println("---Summery order---");
            System.out.println("Username: " + uName +"\nAddress: " + uAddr +"\nPhone number: " + uPhoneNum);
            System.out.println("Your order based price: " + mCode +" " + mName + " -- " + mDescription + " " + mPrice + " Baht");
            System.out.println("Delivery cost: " + aroi.deliveryPrice() + " Baht");
            System.out.println("Special for AROI Na's customer!!! --> 10% discount for every order ^^");
            System.out.println("Total price: " + total);
            System.out.println("Date : " + orderDate);
            System.out.println("Thank you and enjoy your meal ^^");
        }else {
            System.out.println("Your order has been canceled!!! \nPlease order again and press 'Y' to checkout the your order.");
        }
    }

    private static void beeKoreanFood() {
        BeeKoreanFood bee = new BeeKoreanFood();
        bee.printMenu();
        System.out.println("-----------------------------------------------------------");
        String mCode = input("Please enter menu code:");
        String mName = bee.menuName(mCode);
        String mDescription = bee.menuDescription(mCode);
        double mPrice = bee.costCalculate(mCode);

        double pricePlusDeliv = (mPrice + bee.deliveryPrice());
        double promotion = ((mPrice + bee.deliveryPrice()) * bee.promotion())/100;
        double total = pricePlusDeliv-promotion;
        Date now = new Date();
        String orderDate =DateFormat.getDateInstance(DateFormat.SHORT).format(now) + "  " + DateFormat.getTimeInstance(DateFormat.SHORT).format(now);

        System.out.println("Your order: " + mCode +" " + mName + " -- " + mDescription + " " + mPrice + " Baht");


        String conChar = input("Do you want to checkout? [Y:Yes, N: No]:");
        if(conChar.toUpperCase().equals("Y")){
            String uName = input("Please Enter Username : ");
            String uAddr = input("Please Enter your Address (for delivery service): ");
            String uPhoneNum = input("Please Enter your Phone number: ");
            System.out.println("-----------------------------------------------------------\n\n");

            System.out.println("---Summery order---");
            System.out.println("Username: " + uName +"\nAddress: " + uAddr +"\nPhone number: " + uPhoneNum);
            System.out.println("Your order based price: " + mCode +" " + mName + " -- " + mDescription + " " + mPrice + " Baht");
            System.out.println("Delivery cost: " + bee.deliveryPrice() + " Baht");
            System.out.println("Special for Bee Korean Food's customer!!! --> 15% discount for every order ^^");
            System.out.println("Total price: " + total);
            System.out.println("Date : " + orderDate);
            System.out.println("Thank you and enjoy your meal ^^");
        }else {
            System.out.println("Your order has been canceled!!! \nPlease order again and press 'Y' to checkout the your order.");
        }
    }

    private static void wxYIceCream() {
        WxYIceCream wxY = new WxYIceCream();
        wxY.printMenu();
        System.out.println("-----------------------------------------------------------");
        String mCode = input("Please enter menu code:");
        String mName = wxY.menuName(mCode);
        String mDescription = wxY.menuDescription(mCode);
        double mPrice = wxY.costCalculate(mCode);

        double pricePlusDeliv = (mPrice + wxY.deliveryPrice());
        double promotion = ((mPrice + wxY.deliveryPrice()) * wxY.promotion())/100;
        double total = pricePlusDeliv-promotion;
        Date now = new Date();
        String orderDate =DateFormat.getDateInstance(DateFormat.SHORT).format(now) + "  " + DateFormat.getTimeInstance(DateFormat.SHORT).format(now);

        System.out.println("Your order: " + mCode +" " + mName + " -- " + mDescription + " " + mPrice + " Baht");


        String conChar = input("Do you want to checkout? [Y:Yes, N: No]:");
        if(conChar.toUpperCase().equals("Y")){
            String uName = input("Please Enter Username : ");
            String uAddr = input("Please Enter your Address (for delivery service): ");
            String uPhoneNum = input("Please Enter your Phone number: ");
            System.out.println("-----------------------------------------------------------\n\n");

            System.out.println("---Summery order---");
            System.out.println("Username: " + uName +"\nAddress: " + uAddr +"\nPhone number: " + uPhoneNum);
            System.out.println("Your order based price: " + mCode +" " + mName + " -- " + mDescription + " " + mPrice + " Baht");
            System.out.println("Delivery cost: " + wxY.deliveryPrice() + " Baht");
            System.out.println("Special for WxY Ice-cream's customer!!! --> 5% discount for every order ^^");
            System.out.println("Total price: " + total);
            System.out.println("Date : " + orderDate);
            System.out.println("Thank you and enjoy your Ice-cream ^^");
        }else {
            System.out.println("Your order has been canceled!!! \nPlease order again and press 'Y' to checkout the your order.");
        }
    }

    public static void papaPizza() {

        PapaPizza papaPizza = new PapaPizza();
        papaPizza.printMenu();
        System.out.println("-----------------------------------------------------------");
        String style = input("Please select style of pizza[New York Style:NY, Chicago Style:Chicago]: ");
        String type = input("Please select type of pizza[cheese, veggie, clam,pepperoni]: ");

        Pizza createMenu = papaPizza.createPizza(style, type);
        double mPrice = papaPizza.costCalculate(style,type);
        String mName = papaPizza.menuName(style,type);

        double pricePlusDeliv = (mPrice + papaPizza.deliveryPrice());
        double promotion = ((mPrice + papaPizza.deliveryPrice()) * papaPizza.promotion())/100;
        double total = pricePlusDeliv-promotion;
        Date now = new Date();
        String orderDate =DateFormat.getDateInstance(DateFormat.SHORT).format(now) + "  " + DateFormat.getTimeInstance(DateFormat.SHORT).format(now);

        System.out.println("\nYour Order's is " + mName +" -- Price is " + mPrice + " Baht");

        String conChar = input("Do you want to checkout? [Y:Yes, N: No]:");
        if(conChar.toUpperCase().equals("Y")){
            String uName = input("Please Enter Username : ");
            String uAddr = input("Please Enter your Address (for delivery service): ");
            String uPhoneNum = input("Please Enter your Phone number: ");
            System.out.println("-----------------------------------------------------------\n\n");

            System.out.println("---Summery order---");
            System.out.println("Username: " + uName +"\nAddress: " + uAddr +"\nPhone number: " + uPhoneNum);
            System.out.println("Your order based price: " + mName + " --- " + mPrice + " Baht");
            System.out.println("Delivery cost: " + papaPizza.deliveryPrice() + " Baht");
            System.out.println("Special for Papa Pizza's customer!!! --> 15% discount for every order ^^");
            System.out.println("Total price: " + total);
            System.out.println("Date : " + orderDate);
            System.out.println("Thank you and enjoy your meal ^^");
        }else {
            System.out.println("Your order has been canceled!!! \nPlease order again and press 'Y' to checkout the your order.");
        }

    }

    public static void abCoffee(){

        ABCoffee abCoffee = new ABCoffee();
        abCoffee.printMenu();
        System.out.println("-----------------------------------------------------------");
        String mCode = input("Please enter menu code:");
        String mName = abCoffee.menuName(mCode);
        String mDescription = abCoffee.menuDescription(mCode);
        double mPrice = abCoffee.costCalculate(mCode);
        double pricePlusDeliv = (mPrice + abCoffee.deliveryPrice());
        double promotion = ((mPrice + abCoffee.deliveryPrice()) * abCoffee.promotion())/100;
        double total = pricePlusDeliv-promotion;
        Date now = new Date();
        String orderDate =DateFormat.getDateInstance(DateFormat.SHORT).format(now) + "  " + DateFormat.getTimeInstance(DateFormat.SHORT).format(now);

        System.out.println("Your order: " + mCode +" " + mName + " -- " + mDescription + " " + mPrice + " Baht");

        try{
            abCoffee.addCartDetail(numOfCart, mCode, mName, mDescription, mPrice);
        }catch(Exception e){
            System.out.println("Error : Can't add item into your shopping cart");
        }

        String conChar = input("Do you want to checkout? [Y:Yes, N: No]:");
        if(conChar.toUpperCase().equals("Y")){
            String uName = input("Please Enter Username : ");
            String uAddr = input("Please Enter your Address (for delivery service): ");
            String uPhoneNum = input("Please Enter your Phone number: ");
            System.out.println("-----------------------------------------------------------\n\n");

            System.out.println("---Summery order---");
            System.out.println("Username: " + uName +"\nAddress: " + uAddr +"\nPhone number: " + uPhoneNum);
            System.out.println("Your order based price: " + mCode +" " + mName + " -- " + mDescription + " " + mPrice + " Baht");
            System.out.println("Delivery cost: " + abCoffee.deliveryPrice() + " Baht");
            System.out.println("Special for AB coffee's customer!!! --> 10% discount for every order ^^");
            System.out.println("Total price: " + total);
            System.out.println("Date : " + orderDate);
            System.out.println("Thank you and enjoy your coffee ^^");
        }else {
            System.out.println("Your order has been canceled!!! \nPlease order again and press 'Y' to checkout the your order.");
        }
    }

    //Reading an input from user.
    public static String input(String message) {
        System.out.println(message);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String returnString = "";
        try {
            returnString = br.readLine();
        }
        catch (IOException e){
            System.out.println("Error reading in value");
            mainMenu();
        }
        return returnString;
    }


    //Corverting string to integer.
    private static int stringToInt(String value) {
        int returnInt = -1;
        try {
            returnInt = Integer.parseInt(value);

        }
        catch (NumberFormatException e) {
            System.out.println("Please input an integer\n");
        }
        return returnInt;
    }


    public static void main(String[] args) {

        numOfCart = 0;
        abCoffee = new ABCoffee();
        user = User.GetInstance();
        mainMenu();
    }
}
