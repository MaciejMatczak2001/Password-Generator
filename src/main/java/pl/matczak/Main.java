package pl.matczak;

public class Main {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        Password password = passwordGenerator.randomizedPasswordGenerator(5, 4, 4, 1);
        System.out.println(password);
    }
}
