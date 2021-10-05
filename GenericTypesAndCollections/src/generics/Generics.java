package generics;


// implementing generics , T is used because it stands for type
// note that the data type in generics should be in classes
class container<T>{
    T value;

    // using getters and setters for this class
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    // a method to show the type of the value
    public void display(){
        System.out.println(value.getClass().getName()); // this is used to get the type
    }
}


public class Generics {

    public static void main(String[] args) {

        container<Integer> num = new container< >();
        num.setValue(45);
        num.display();
    }
}
