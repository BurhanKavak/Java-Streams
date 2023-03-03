import java.util.ArrayList;
import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Burhan");
        names.add("Burhan");
        names.add("Burhan");
        names.add("Raşit");
        names.add("Ayşe");
        names.add("Yenes");
        names.add("Burhan");


        names.stream().distinct()
                .forEach(System.out::println);
    }
}
