package lab1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optionalUse {

    public static void main(String[] args) {
        List<String> trade = Arrays.asList("Reflection","Collection","Stream");
        Optional<String> result = trade.stream().filter(s->s.startsWith("c")).findFirst();

        if (result.isPresent()){
            System.out.println(result.get());
        }else {
            System.out.println(result.orElse("okay"));

        }


    }
}
