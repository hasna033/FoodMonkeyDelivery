package FoodMonkey;

public class User {
    private static User instance;
    private String uName;
    private String uAddr;
    private String uPhoneNum;
    private final String promCode = "ABCoffee";

    private User(){ }

    public static User GetInstance(){
        if (instance == null){
            instance = new User();
        }
        return instance;
    }

    //setting a user name
    public void setUName(String uName)
    {
        this.uName = uName;
    }

    //getting a user name
    public String getUName()
    {
        return uName;
    }

    //setting a user address
    public void setUAddr(String uAddr)
    {
        this.uAddr = uAddr;
    }

    //getting a user address
    public String getUAddr()
    {
        return uAddr;
    }

    //setting a user phone number
    public void setUPhoneNum(String uPhoneNum) {
        this.uPhoneNum = uPhoneNum;
    }

    //getting a user phone number
    public String getUPhoneNum() {
        return uPhoneNum;
    }


    //getting a user promCode
    public String getPromCode()
    {
        return promCode;
    }

}
