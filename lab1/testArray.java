package lab1;

public class testArray {

    public static void main(String[] args) {
        int a = 10;
        int num = 5;
        int [] numbers = new int[a];

        for (int i = 0 ; i < a; i++){

            numbers[i] += num ;
            ++num ;
            System.out.println(numbers[i]);
        }
    }
}
