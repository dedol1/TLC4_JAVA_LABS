package lab1;

class myArray{
    int [] numbers = new int[6];

    myArray(){
        System.out.println(">>> myArray object constructed");
    }

    void setMyArray(int [] numbers){

        this.numbers = numbers;
    }



}
public class array {

    public static void main(String[] args){

        // creating objects for the array class
        myArray firstArray = new myArray();


       firstArray.numbers[0] = 1;




    }
}
