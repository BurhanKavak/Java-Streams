package mapAndReduce;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Burhan", 10);
        Person p2 = new Person("Ayşe", 15);
        Person p3 = new Person("Yenes", 20);
        Person p4 = new Person("Raşit", 25);
        Person p5 = new Person("Luffy", 30);


        List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5);

        personList
                .stream()
                .map(p -> p.getAge())
                .map(Double::valueOf)
                .reduce(0.0,(x,y) -> {
                    System.out.println((x+y));
                    return (x+y);
                });



    }
}