package functionaliterface;

import java.lang.module.FindException;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        // using the function interface in java

        Function<Integer, Integer> incrementByOne = number -> number + 1; // this line creates the function

        // calling the function by using the .apply()

        int increasedNumber = incrementByOne.apply(4);
        System.out.println("This is the increased number: " + increasedNumber);

        // chaining functions together

        Function<Integer, Integer> addTwo = number -> number + 2;
        Function<Integer, Integer> multiplyByTen = number -> number * 10;

        Function<Integer, Integer> combineTwoFunctions = addTwo.andThen(multiplyByTen);// combining the two functions by creating a bigger function to hold them

        System.out.println(combineTwoFunctions.apply(4)); // printing out the results of the two functions working as one

        // this section is for biFunctions

        BiFunction<Integer, Integer,Integer> increaseAndMultiply = (numberToIncrease, multiplyNumber) -> (numberToIncrease + 1) * multiplyNumber; // declaring a biFunction

        int solution = increaseAndMultiply.apply(4,5);
        System.out.println( "this is the result from the biFunction\n" + solution);


    }

}
