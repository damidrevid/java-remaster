public class PositiveNegativeZero {
    public static void main(String[] args) {
        numberCheck(0);

    }
    public static void numberCheck(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number <0) {
            System.out.println("Negative");
        } else
            System.out.println("Zero");
    }
}
