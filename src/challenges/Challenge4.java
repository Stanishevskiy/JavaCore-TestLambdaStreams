package challenges;

import java.util.function.Function;

public class Challenge4 {

    public static void main(String[] args) {

        System.out.println(everySecondChar("1234567890"));
    }

    public static String everySecondChar(String string) {

        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };
        return lambdaFunction.apply(string);
    }
}
