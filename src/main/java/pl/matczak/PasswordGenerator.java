package pl.matczak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PasswordGenerator {
    public Password randomizedPasswordGenerator(Integer numberOfLowerCaseLetters, Integer numberOfUpperCaseLetters, Integer numberOfNumbers, Integer numberOfSymbols) {
        List<Character> password = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numberOfLowerCaseLetters; i++) {
            int element = random.nextInt(Alphabet.LATIN_LOWER_CASE.size());
            password.add(Alphabet.LATIN_LOWER_CASE.get(element));
        }
        for (int i = 0; i < numberOfUpperCaseLetters; i++) {
            int element = random.nextInt(Alphabet.LATIN_UPPER_CASE.size());
            password.add(Alphabet.LATIN_UPPER_CASE.get(element));
        }
        for (int i = 0; i < numberOfNumbers; i++) {
            int element = random.nextInt(Alphabet.NUMBERS.size());
            password.add(Alphabet.NUMBERS.get(element));
        }
        for (int i = 0; i < numberOfSymbols; i++) {
            int element = random.nextInt(Alphabet.SYMBOLS.size());
            password.add(Alphabet.SYMBOLS.get(element));
        }
        Collections.shuffle(password);
        String value = password.stream().map(Object::toString).collect(Collectors.joining());
        int length = numberOfLowerCaseLetters + numberOfUpperCaseLetters + numberOfNumbers + numberOfSymbols;

        if (length <= 0) {
            throw new PasswordLengthException("Wrong password length");
        } else {
            return new Password(length, value);
        }
    }

}
