package pl.home.cb.cmd;

import java.util.Random;
import java.util.Scanner;

public class Main {

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
        }
    }

    private static String generateRandomSecret() {
        Random random = new Random();
        String secret = String.format("%04d", random.nextInt(6000));
        return secret;
    }


}
