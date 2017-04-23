package pl.home.cb.cmd;

public class Game {
    public Game(){

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
