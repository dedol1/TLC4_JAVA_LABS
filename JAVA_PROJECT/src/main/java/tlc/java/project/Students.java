package JAVA_PROJECT.src.main.java.tlc.java.project;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

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
        System.out.println("Hello " + getName() +",now, enter your grades, press enter" +
                " after each grade to take you to the next input \n" + prompt);


        for (int i = 0; i < size; i++){
            grades.add(input.nextDouble());
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Students{");
        sb.append("name='").append(name).append('\'');
        sb.append(", grades=").append(grades);
        sb.append('}');
        return sb.toString();
    }

    public double getAverageGrade(){
        double sum = 0;
        double average;

        for (int i = 0; i < getGrades().size(); i++){
            sum += grades.get(i);
        }
        average = sum / getGrades().size();
        return average;
    }



}
