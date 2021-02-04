package challenges;

import java.util.function.Supplier;

public class Challenge5 {

    public static void main(String[] args) {

        Supplier<String> myString = () -> "I love Java!";

        System.out.println(myString.get());
    }
}
