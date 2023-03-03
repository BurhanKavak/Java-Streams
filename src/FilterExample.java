
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;


public class FilterExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Burhan","Raşit","Ayşe","Yenes");

        List result = names.stream().filter(s -> s.startsWith("B"))
                .collect(Collectors.toList());


        System.out.println(result);



       names.stream().filter(name -> name.length() == 4)
               .forEach(System.out::println);


    }
}
