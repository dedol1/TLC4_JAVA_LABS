package lab1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sortingAList {

    public static void main(String[] args) {

        // declaring a list and passing it into an arrayList
        List <Integer> values = new ArrayList<>();

        // adding values into the arrayList
        values.add(2);
        values.add(4);
        values.add(74);
        values.add(87);
        values.add(44);

        for(int i : values){

            System.out.println(i);
        }

         // sorting the list

        Collections.sort(values);

        // printing out the sorted values in the list
        System.out.println("\n Sorted list");
        for (int a : values){


            System.out.println(a);
        }


    }
}
