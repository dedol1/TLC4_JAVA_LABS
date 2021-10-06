package nestedClasses;

// Implementing nested classes as inner class

class outer{
    //  attribute for the outer class
    int number;

    //constructor for outer class
    outer(int number){
        this.number = number;
    }

    // method to display the content of the outer class
    public void display(){
        System.out.println(" This is the value of the number: " + number );
    }

    // defining an inner class to implement the nested class
    class Inner{

        public void show(){
            System.out.println(" This is the inner class");
        }
    }

    // you can also call the inner class inside the outer class in a method
    public void printing(){

        Inner inobj = new Inner() ;
        inobj.show();
    }
}

public class innerClass {
    public static void main(String[] args) {

        // instantiating the outer class
        outer objOuter = new outer(64);
        objOuter.display();

        // instantiating the inner class
        outer.Inner objInner = objOuter.new Inner(); // note that to instantiate the inner class, you have to make a call to the outer class and the object for the outer.new for the inner
        objInner.show();

        objOuter.printing(); // calling the inner class from the outer method printing()

    }
}
