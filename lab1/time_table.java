package lab1;

public class time_table {

    public static void main(String[] args){

        int counter = 1;

        while (counter <11) {
            for (int i = 1; i <= 10; i++) {

                System.out.println(counter + " * " + i + " = " + counter * i);

            }

            ++counter;
        }
    }
}
