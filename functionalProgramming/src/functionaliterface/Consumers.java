package functionaliterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

// with the consumer, you have to create your own class and pass it as a type, or you can use the classes of the various primitive types.
 class Customer{
    String name;
    String  phoneNumber;

    Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

public class Consumers {

    public static void main(String[] args) {

        Customer samuel = new Customer("DeDol", "0543233440");

        // declaring consumer takes one argument

        Consumer<Customer> greetingToCustomer = customer -> System.out.println("Hello " + customer.name +", you have registered the phone number " + customer.phoneNumber) ;
        greetingToCustomer.accept(samuel);

        // using a biConsumer for the same class

        System.out.println("this is for the biConsumer");
        BiConsumer<Customer ,Boolean> greetingToCustomerBi = (customer,showPhoneNumber) ->
                System.out.println("Hello " + customer.name +", you have registered the phone number " + (showPhoneNumber ? customer.phoneNumber : "************")) ;
        greetingToCustomerBi.accept(samuel, false);//displays the phone number when the boolean is set to true





    }
}
