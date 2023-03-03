import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortedExample {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(31,12,33,1,3,4,2,5);
        List names = Arrays.asList("Burhan","Raşit","Ayşe","Yenes");

       names.stream()
                .sorted()
                        .forEach(System.out::println);



        stream.sorted()
                .forEach(System.out::println);
    }
}
