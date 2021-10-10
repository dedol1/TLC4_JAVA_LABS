package tlc.java.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class student {
    private String name;
    private List<Double> grades = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
        String prompt = ":>> ";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name\n" + prompt);
        name = input.nextLine();
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades() {
        this.grades = grades;
        Scanner input = new Scanner(System.in);
        String prompt = ":>> ";
        int size;

        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("                 ACCEPTING STUDENT GRADES            ");
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("\nPlease enter the number of grades you wish to add\n" + prompt);
        size = input.nextInt();
        System.out.println("Hello " + getName() +",now, enter your grades \n" + prompt);


        for (int i = 0; i < size; i++){
            grades.add(input.nextDouble());
        }

        }
    }


public class Students {
    public static void main(String[] args) {
        student student1 = new student();
        student1.setName();
        student1.setGrades();

    }
}
