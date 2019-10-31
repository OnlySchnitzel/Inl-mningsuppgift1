

public class GuessingGame {

    static int min;
    static int max;
    public static void main(String[] args) {
        Guesser guesser = new Guesser(0, 1000);
        guesser.start();
    }

}
