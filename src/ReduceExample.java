import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(5,3,2,8);


        int newNumber = number.stream().reduce(0,(x,y) -> {
            System.out.println(x + y);
            return x + y;
        });

        System.out.println();
        System.out.println("*************************\n");

        IntStream.of(50,20,10,40).reduce(1,(x,y) -> {
            System.out.println(x * y);
            return x * y;
        });
    }
}
