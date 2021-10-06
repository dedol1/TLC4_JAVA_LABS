package lab1;

import org.w3c.dom.ls.LSOutput;

class outerClass{

    String  name;

    outerClass(String name){

        this.name = name;

    }

    public void display(){
        System.out.println(name);
    }

    class innerClass{

        public void output(){
            System.out.println(" This is the inner class for testing");

        }
    }

    public void displayOuter(){

        // instantiating the inner class for use
        innerClass objInner = new innerClass();

        System.out.println(" This is the method from the inner class called in the outer class");
        objInner.output();
    }
}

public class dummyInnerClass {

    public static void main(String[] args) {
        // instantiating the outer class
        outerClass outer = new outerClass("Training");
        outer.display();

        // creating an object for the inner class
        outerClass.innerClass inner = outer.new innerClass();
        inner.output();

        //calling the outer method displayOuter

        outer.displayOuter();


    }

}
