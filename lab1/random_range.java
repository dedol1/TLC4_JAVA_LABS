// generating random numbers within a given range.

package lab1;

public class random_range {

    public static void  main(String[] args){

        int max = 0;
        int min = 100;

        // this is the formula for generating random numbers between ranges.
       int randomNumbers = (int) ((Math.random() *  (max -min)) + min);

       //printing all the even numbers in the range of random numbers
       if (randomNumbers % 2 == 0){
        System.out.println("This random number is an even number\n" + "and this is the number:" + randomNumbers);

       }

       else
           System.out.println("the number is not enven");

       /*
       0 = frozen, 1-14 = cold, 15-24 = cool, 25-40 = warm, 41-60 = hot, 61-80 = very hot, 81-99 = extremely hot, 100  = boiling
       this block of code will categorize the randomNumbers into these stated categories
       */

        switch (randomNumbers) { // using switch expression

            case 0 -> System.out.println(" FROZEN");

            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 -> System.out.println("COOL");

            case 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 -> System.out.println("COLD");

            case 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 -> System.out.println("WARM");

            case 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 -> System.out.println("HOT");

            case 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80 -> System.out.println("EXTREMELY HOT");

            case 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 100 -> System.out.println("BOILING");

        }

        // note default is also applicable


    }
    
}
