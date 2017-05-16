package pl.home.cb.cmd;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int MAXIMUM_SECRET_VALUE = 6000;

    public static void main(String[] args){
        String secret;
        if(args.length==1)
            secret = args[0];
        else
            secret = generateRandomSecret();
        Game game = new Game(secret);
        System.out.println(game.getWelcomeMessage());
        Scanner scanner = new Scanner(System.in);
        String guess;
        while(true) {
            guess = scanner.nextLine();
            System.out.println(game.evaluateGuess(guess));
            if(guess.equals(secret))
                break;
        }
        System.out.println(game.getCongratulationsMessage());
    }

    private static String generateRandomSecret() {
        Random random = new Random();
        String secret = String.format("%04d", random.nextInt(MAXIMUM_SECRET_VALUE));
        return secret;
    }


}
