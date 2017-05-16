package pl.home.cb.cmd.test;

import org.junit.Before;
import org.junit.Test;
import pl.home.cb.cmd.Game;

import static org.junit.Assert.assertEquals;


public class GameMessagesTest {
    private static final String SECRET = "1234";
    private static final String WELCOME_MESSAGE = "Welcome to code-breaker game.\r\nPlease make a guess.";
    private static final String CONGRATULATIONS_MESSAGE = "Congratulations!\nYou have successfully guessed the hidden password.";
    private Game game;

    @Before
    public void setup(){
        game = new Game(SECRET);
    }

    @Test
    public void appropriateWelcomeMessageShouldBeDisplayed(){
        assertEquals(WELCOME_MESSAGE, game.getWelcomeMessage());
    }

    @Test
    public void congratulationsMessageShouldBeDisplayed(){
        assertEquals(CONGRATULATIONS_MESSAGE, game.getCongratulationsMessage());
    }
}
