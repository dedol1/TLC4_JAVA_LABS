package lab1;

class myArray{
    int a;
    int [] numbers = new int[a];

    myArray(){
        System.out.println(">>> myArray object constructed");
    }

    void setMyArray(int [] numbers){

        this.numbers = numbers;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void display(){
        getA();

    }
}
public class array {

    public static void main(String[] args){

        // creating objects for the array class
        myArray firstArray = new myArray();





    }
}
