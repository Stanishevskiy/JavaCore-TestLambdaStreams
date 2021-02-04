package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge6 {

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

        // Return naturally sorted names, with 1-st char upper case

        // Using only lambda functions
        List<String> myLambdaList = new ArrayList<>();
        topNames2015.forEach(name ->
                myLambdaList.add(name.substring(0, 1).toUpperCase() + name.substring(1)));
        myLambdaList.sort((s1, s2) -> s1.compareTo(s2));
        myLambdaList.forEach(s -> System.out.println(s));
        System.out.println("-----------------------------------------");

        // Using only lambda functions with method references
        List<String> myLambdaReferencesList = new ArrayList<>();
        topNames2015.forEach(name ->
                myLambdaReferencesList.add(name.substring(0, 1).toUpperCase() + name.substring(1)));
        myLambdaReferencesList.sort(String::compareTo);
        myLambdaReferencesList.forEach(System.out::println);
        System.out.println("-----------------------------------------");

        // Using streams
        topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .sorted()
                .forEach(System.out::println);
    }
}
