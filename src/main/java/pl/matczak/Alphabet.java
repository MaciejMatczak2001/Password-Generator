package pl.matczak;

import java.util.List;
import java.util.stream.IntStream;

public class Alphabet {

    public static final List<Character> LATIN_LOWER_CASE = latinStream('a');
    public static final List<Character> LATIN_UPPER_CASE = latinStream('A');
    public static final List<Character> SYMBOLS = List.of('!', '@', '#', '$', '%', '^', '&', '*', '(', ')');
    public static final List<Character> NUMBERS = List.of('1', '2', '3', '4', '5', '6', '7', '8', '9');

    private static List<Character> latinStream(char firstLetter) {
        return IntStream.range(0, 26).boxed().map(element -> (char) (element + firstLetter)).toList();
    }
}
