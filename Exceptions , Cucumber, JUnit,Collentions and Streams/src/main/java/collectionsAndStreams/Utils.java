package collectionsAndStreams;

import java.util.HashSet;
import java.util.Set;

public class Utils {

    public static Set<String> printSecondFourthAndSixthCharacters(String input) {
        Set<String> result = new HashSet<>();

        String[] split = input.split("\\s+");

        for (int i = 1; i < split.length; i += 2) {
            String currentWord = split[i];
            result.add(currentWord);
            System.out.println(currentWord);
        }
        return result;
    }


    public static Set<String> makeSetFromString(String str) {
        Set<String> result = new HashSet<>();

        String[] split = str.split("\\s+");

        for (String s : split) {
            result.add(s);
        }
        return result;
    }

    public static int getSize(Set<String> strings) {
        return strings.size();
    }


    public static Book findBookWithCheapestPrice(Set<Book> books){
        Book book = books.stream().min((b1, b2) -> Double.compare(b1.getDiscountedPrice(), b2.getDiscountedPrice()))
                .orElse(null);
        return book;
    }

    public static Book findThirdCheapestBook(Set<Book> books) {
        Book book = books.stream()
                .sorted((b1, b2) -> Double.compare(b1.getDiscountedPrice(), b2.getDiscountedPrice()))
                .skip(2)
                .findFirst()
                .orElseThrow();
        return book;
    }
}
