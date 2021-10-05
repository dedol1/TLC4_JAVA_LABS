/*
*  Creating a custom exeption for this ID
* this is in reference to the trade clase worked on earlier*
*  */

package exeptions;

//creating my custom exception
class duplicateIDException extends Exception{
    public duplicateIDException(String message){
        super(message);
    }
}

// throwing an exception



// this is the trade class
class tradeClass {
    private String ID;
    private String symbol;
    private int quantity;
    private double price;

    // my basic constructor
    tradeClass(String ID, String symbol, int quantity, double price) {

        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;


    }

    // constructor without the price attribute
    tradeClass(String ID, String symbol, int quantity) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    // setting a setter and getter for the price attribute

    void setPrice(double price) {
        this.price = price;

    }

    double getPrice() {
        return price;
    }

    // using toString to output the content in the object using the override
    @Override
    public String toString() {
        return "Price: " + getPrice() + "\nID: " + ID + "\nQuatity: " + quantity + "\nSymbol: " + symbol;
    }
}
public class TradeIDException {
    public static void main(String[] args) {

        tradeClass trade = new tradeClass("T1", "appl", 100,45.54);

        trade.setPrice(44.0);
        System.out.println(trade);

    }
}
