package collections;

// trying my hands on simple collections
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        // using the Collection word, you do not specify which of the generics you wish to use yet it works
        Collection value = new ArrayList();

        value.add(3);
        value.add(45);
        value.add(4);

        System.out.println(value);

        // giving collection a type
        Collection <Integer> newValue = new ArrayList<>(); // note you can use any type, but it should be an object not a primitive

        newValue.add(34);
        newValue.add(78);

        System.out.println(newValue);

        // specifying the generic type i wish to use

        List<String> names = new ArrayList<String>();

        names.add("sam");
        names.add("Joseph");
        names.add("Kesh");

        System.out.println(names);

        // using for each to list the items in the list
        for(String name :names){
            System.out.println(name);
        }



    }
}
