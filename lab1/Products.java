package lab1;


class myProducts{
    // declaring the attributes for the object

    private int iD;
    int productPrice;
    String productName;

    // creating a constructor

    myProducts(){
        System.out.println(">>>Products objects constructed");
    }

    // writing the required methods or behavior

    void setProductDetails( int iD, int productPrice, String productName){
        // this.iD = iD; will not be available because it is private
        this.productName = productName;
        this.productPrice = productPrice;
    }

    // reading data from product object

    void showProductDetails(){
        System.out.println("----- Product ID "+ iD + "------\n" );
        System.out.println("\n Product Name: "+ productName);
        System.out.println("\nProduct Price: " + productPrice);
        System.out.println("\n---------------------------------");
    }

    void setiD(int iD){
        this.iD = iD;
    }

    int getiD(){
        return iD;
    }
}
public class Products {

    public static void main(String[] args){

        // creating an object

        myProducts product = new myProducts();
        myProducts product2 = new myProducts();

        // writing data into the object

        product.setProductDetails(002,454,"Card");

        // reading data from product

        product.showProductDetails();

        // this side is for product2

        product2.setiD(342);
        product2.productPrice = 450;
        product2.productName = "Gari";
        product2.showProductDetails();


        // creating an object for the child class mobile

//        Mobile mobile = new Mobile();

    }
}
