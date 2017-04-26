package pl.home.cb.cmd;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        String secret = String.format("%04d", random.nextInt(6000));
        Game game = new Game(secret);
        System.out.println(game.getWelcomeMessage());
        Scanner scanner = new Scanner(System.in);
        String guess;
        while(true) {
            guess = scanner.nextLine();
            System.out.println(game.evaluateGuess(guess));
        }
    }
}
