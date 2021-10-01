// Generate a random number in the range 0-9, and for each one print out its text name (e.g. one, two, etc.).

package lab1;

public class random_number_with_if_else {

    public static void main(String[] args){

        int max = 9;
        int min = 0;

        int randomNum = (int)((Math.random() * (max - min) ) + min);

        if (randomNum == 0)
            System.out.println("zero " + randomNum);
        else if (randomNum == 1)
            System.out.println("One " + randomNum);
        else if (randomNum == 2)
            System.out.println("Two " + randomNum);
        else if (randomNum == 3)
            System.out.println("Three " + randomNum);
        else if (randomNum == 4)
            System.out.println("Four " + randomNum);
        else if (randomNum == 5)
            System.out.println("Five " + randomNum);
        else if (randomNum == 6)
            System.out.println("Six " + randomNum);
        else if (randomNum == 7)
            System.out.println("Seven " + randomNum);
        else if (randomNum == 8)
            System.out.println("Eight " + randomNum);
        else if (randomNum == 9)
            System.out.println("Nine " + randomNum);

    }
}
