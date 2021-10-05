package exeptions;


// trying hands on exceptions
class except{
    double number;
    double solution;


    public void setNumber(Double number) {
        this.number = number;

    }

    public double getNumber() {
        return number;
    }

    public void setSolution(double solution) {
        this.solution = solution;
        solution = number / 0;
    }

    public double getSolution() {
        return solution;
    }

    public void display(){
        System.out.println(solution);
    }
}
public class ThrowingExceptions {

    public static void main(String[] args) {

        except error = new except();
        error.setNumber(null); // did this on purpose to create an exception
        error.display();
    }


}
