import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CountExample {
    public static void main(String[] args) {

        long x = IntStream.range(18,25).count();
        System.out.println(x);


        List<String> cars = Arrays.asList("Mercedes","BMW","Volvo","Tofaş");

        System.out.println("Araba sayısı : " + cars.stream().count());


    }
}
