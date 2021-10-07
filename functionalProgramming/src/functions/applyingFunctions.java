package functions;

import java.util.function.Function;

public class applyingFunctions {
    public static void main(String[] args) {

        // this line is creates a function that takes an integer and returns a string
        Function<Integer, String> numberToText = new Function<Integer, String>() {
            @Override   // we need to override apply object function in the function class
            public String apply(Integer integer) {
                switch (integer){
                    case 0: return "zero";
                    case 1: return "one";
                    case 2: return "two";
                    default: return "Unknown";
                }
            }


        };

        String result = numberToText.apply(2);
        System.out.println(result);
    }
}
