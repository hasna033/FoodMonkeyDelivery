package FoodMonkey;

public class Menu {
    private String code;
    private String menuName;
    private String menuDescription;
    private double menuPrice;

    public Menu(String code, String menuName, String menuDescription, double menuPrice) {
        this.code = code;
        this.menuName = menuName;
        this.menuDescription = menuDescription;
        this.menuPrice = menuPrice;
    }

    public String getCode() {
        return code;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public double getMenuPrice() {
        return menuPrice;
    }

    //comparing book title with other.
    public boolean equals(Object obj) {
        if (obj instanceof Menu) {
            Menu menuItem = (Menu) obj;
            return menuItem.getMenuName().equals(menuName);
        }
        return false;
    }
}
