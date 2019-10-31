

public class Guessertesting {

    static int min;
    static int max;
    public static void main(String[] args) {

        System.out.println("Write in a minimum value");
        min = Integer.parseInt(System.console().readLine());
        System.out.println("Write in a maximum value");
        max = Integer.parseInt(System.console().readLine());

        Guesser guesser = new Guesser(min,max);
        guesser.start();
    }
}
