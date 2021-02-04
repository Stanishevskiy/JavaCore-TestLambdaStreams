package challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge8 {

    public static void main(String[] args) {

        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .sorted()
                .peek(System.out::println)
                .count();   // this operation (termination operation) allow to perform all actions of the peek() method
    }
}
