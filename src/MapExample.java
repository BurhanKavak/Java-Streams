import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class MapExample {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Burhan","Kavak");

        name.stream()
                .map(s -> "Map Eklentisi " + s + " Map Eklentisi")
                .forEach(System.out::println);

        System.out.println();
        System.out.println("**************************\n");

        DoubleStream doubleStream = DoubleStream.of(0.6,8.5,7.12,31.13);
        doubleStream.mapToInt(value -> (int) value)
                .forEach(System.out::println);
    }




}
