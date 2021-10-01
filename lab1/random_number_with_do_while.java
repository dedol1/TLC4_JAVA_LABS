// Generate random numbers in the range -3 to +3 and stop when the value is zero. Use a
//do/while
// loop.
//Modify your program to do the same thing, but this time, use a
//while
// loop.

package lab1;

public class random_number_with_do_while {

    public  static void main(String[] args ){

        int max = 3;
        int min = -3;
        int randomNum = (int) ((Math.random() * (max - min) + min));

        // writing the do while loop to stop the randomizing when the number reaches zero
        do {
            randomNum = (int) ((Math.random() * (max - min) + min));
            System.out.println(randomNum);
        }
        while (randomNum != 0);
            System.out.println(randomNum);
    }
}


