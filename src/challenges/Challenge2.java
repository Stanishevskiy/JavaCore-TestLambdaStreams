package challenges;

import java.util.function.Function;

public class Challenge2 {

//    public static String everySecondChar(String source) {
//        StringBuilder returnVal = new StringBuilder();
//        for (int i = 0; i < source.length(); i++) {
//            if (i % 2 == 1) {
//                returnVal.append(source.charAt(i));
//            }
//        }
//
//        return returnVal.toString();
//    }

    public static void main(String[] args) {

        Function<String, String> myString = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(myString.apply("my technical super text"));
    }
}
