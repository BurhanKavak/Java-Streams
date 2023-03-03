import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForeachExample {
    public static void main(String[] args) {
        List names = Arrays.asList("Burhan","Raşit","Ayşe","Yenes");

        Stream stream = names.stream();


        stream.forEach(name -> {
            System.out.println(name);
        });


        // Bu şekilde de kullanılabilir.
        // stream.forEach(System.out::println);
    }


}
