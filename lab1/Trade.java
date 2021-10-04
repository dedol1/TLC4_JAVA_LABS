package lab1;

// this is the trader class

class Trader{
    private String name;
    private String account;


}

// this is the account class
class Account{

    private double totalValueOfAllTrades;

    // using setter and getters for this class instead of the constructor
    void setTotalValueOfAllTrades(double totalValueOfAllTrades){
        this.totalValueOfAllTrades = totalValueOfAllTrades;
    }

    double getTotalValueOfAllTrades(){
        return totalValueOfAllTrades;
    }
}

// this is the trade class
class tradeClass{
    private String ID;
    private String symbol;
    private int quantity;
    private double price;

   // my basic constructor
    tradeClass(String ID, String symbol, int quantity, double price){

        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;


    }

    // constructor without the price attribute
    tradeClass(String ID, String symbol, int quantity){
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    // setting a setter and getter for the price attribute

    void setPrice(double price){
        this.price = price;

    }

    double getPrice(){
        return price;
    }

    // using toString to output the content in the object using the override
    @Override
    public String toString() {
        return "Price: " + getPrice() + "\nID: " + ID + "\nQuatity: " + quantity + "\nSymbol: " + symbol;
    }
}
public class Trade {

    public static void main(String[] args) {

        tradeClass trade = new tradeClass("T1", "appl", 100,45.54);

        trade.setPrice(44.0);
        System.out.println(trade);

    }
}
