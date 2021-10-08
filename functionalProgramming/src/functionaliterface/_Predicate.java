package functionaliterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(" the results for the normal function");
        // checking if the following numbers are mtn numbers
        System.out.println("is 0245737893 and Mtn number? : " + isPhoneNumber("0245737893"));
        System.out.println("is 0275737893 and Mtn number? : " + isPhoneNumber("0275737893"));
        System.out.println("is 0235737893 and Mtn number? : " + isPhoneNumber("0235737893"));

        // Using predicate for the verification
        Predicate<String> isPhoneNumberVTwo  = phoneNumber -> phoneNumber.startsWith("024") && phoneNumber.length() == 10; // predicate definition
        Predicate<String> phoneNumberContains3 = phoneNumber -> phoneNumber.contains("3"); // declaring another predicate for chaining

        System.out.println("\n this is the predicate results");
        // using the predicate by calling
        System.out.println("is 0245737893 and Mtn number? : " + isPhoneNumberVTwo.test("0245737893"));
        System.out.println("is 0235737893 and Mtn number? : " + isPhoneNumberVTwo.test("0235737893"));
        System.out.println("is 0275737893 and Mtn number? : " + isPhoneNumberVTwo.test("0275737893"));


        // for the chaining of predicates, use 'and', 'or' for the conjunction
        System.out.println("this is the results for the chained predicate");

        // checking if the number is mtn and contains the number 3
        System.out.println("is 0245737893 and Mtn number and contains 3 ? : " + isPhoneNumberVTwo.and(phoneNumberContains3).test("0245737893"));
        System.out.println("is 0245737893 and Mtn number and contains 3 ? : " + isPhoneNumberVTwo.and(phoneNumberContains3).test("0275737893"));
    }

    // trying a normal function to validate a phone number

    static boolean isPhoneNumber(String phoneNumber){
        return phoneNumber.startsWith("024") && phoneNumber.length() == 10;
    }
}
