package pl.home.cb.cmd.test;

import org.junit.Before;
import org.junit.Test;
import pl.home.cb.cmd.Game;

import static org.junit.Assert.assertEquals;


public class GameTest {
    private static final String WELCOME_MESSAGE = "Welcome to code-breaker game.\r\nPlease make a guess.";
    private Game game;

    @Before
    public void setup(){
        game = new Game();
    }

    @Test
    public void appropriateWelcomeMessageShouldBeDisplayed(){
        assertEquals(WELCOME_MESSAGE, game.getWelcomeMessage());
    }
}
