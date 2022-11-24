package pl.matczak;

public class Password {
    private final int length;
    private final String value;

    public Password(int length, String value) {
        this.length = length;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Password: " + value + "\n" + "Length of this password is: " + length;
    }
}
