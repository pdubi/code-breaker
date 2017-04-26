package pl.home.cb.cmd;

import java.util.Random;

public class Game {
    private static final int MAXIMUM_SECRET_VALUE = 6000;
    private final String secret;
    
    public Game(String secret){
        if(Integer.parseInt(secret)>MAXIMUM_SECRET_VALUE)
            throw new RuntimeException("Maximum secret password is 6000");
        this.secret = secret;
    }

    public String evaluateGuess(String guess){
        return "";
    }

    public String getWelcomeMessage(){
        return Message.WELCOME_MESSAGE.toString();
    }
}

enum Message{
    WELCOME_MESSAGE("Welcome to code-breaker game.\r\n" +
            "Please make a guess.");

    private final String message;

    Message(final String message){
        this.message=message;
    }

    @Override
    public String toString() {
        return message;
    }
}
