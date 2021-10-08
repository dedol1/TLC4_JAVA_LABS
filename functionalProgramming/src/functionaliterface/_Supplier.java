package functionaliterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        // getting the value of the url
        System.out.println("The url to the database is " + getDBConnection());

        // trying the same function using the functional method of Predicates
        Supplier<String>getUrlOfDataBase = () -> "http://localhost:5345/users";
        System.out.println("\nThis is through supplier interface");
        System.out.println("The url to the database is " + getUrlOfDataBase.get());

    }

    // creating a normal function to get the url to a database connection
    static String getDBConnection(){
        return "http://localhost:5345/users";
    }
}
