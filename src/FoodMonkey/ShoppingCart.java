package FoodMonkey;

import java.util.*;

public class ShoppingCart {

    private ArrayList items;
    private String userName;
    private String orderDate;

    /**
     *  Constructs a ShoppingCart instance.
     */
    public ShoppingCart(String userName, String orderDate)
    {
        this.userName = userName;
        this.orderDate = orderDate;
        items = new ArrayList();

    }

    public String getUserName(){
        return userName;
    }


    public String getOrderDate(){
        return orderDate;
    }

    //getting the shopping cart.
    public ArrayList getShoppingCart(){
        return items;
    }

    //getting the balance.
    public double getBalance() {
        Iterator i = items.iterator();
        double balance = 0.00;
        while (i.hasNext()) {
            Menu menu = (Menu) i.next();
            balance = balance + menu.getMenuPrice();
        }
        return balance;
    }

    //Adding the specified product.
    public void addItem(Menu menuItem) {
        items.add(menuItem);
    }

    //getting the number of items in the cart.
    public int getItemCount()
    { return items.size(); }


    //Empties the cart.
    public void empty()
    { items = new ArrayList(); }

    //Indicating whether the cart is empty.
    public boolean isEmpty()
    { return (items.size() == 0); }
}

