package pl.home.cb.cmd;

public class Game {
    private static final int MAXIMUM_SECRET_VALUE = 6000;
    private final String secret;

    public Game(String secret){
        if(secret.length()!=4 || Integer.parseInt(secret)>MAXIMUM_SECRET_VALUE)
            throw new RuntimeException("Maximum secret password is 6000");
        this.secret = secret;
    }

    public String evaluateGuess(String guess){
        StringBuffer result = new StringBuffer();
        char[] guessLetters = guess.toCharArray();
        for(int i=0; i<guessLetters.length; i++){
            if(secret.charAt(i)==guessLetters[i])
                result.append("+");
            else if(secret.contains(String.valueOf(guessLetters[i])))
                result.append("-");
        }
        return result.toString();
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
