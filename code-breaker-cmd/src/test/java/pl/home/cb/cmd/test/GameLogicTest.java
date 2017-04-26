package pl.home.cb.cmd.test;

import org.junit.Test;
import pl.home.cb.cmd.Game;

import static org.junit.Assert.assertEquals;

public class GameLogicTest {
    private  Game game;

    @Test
    public void userMakesSuccessfulGuess(){
        game = new Game("0000");
        assertEquals("++++", game.evaluateGuess("0000"));
    }

    @Test
    public void userMakesCompletelyWrongGuess(){
        game = new Game("4321");
        assertEquals("", game.evaluateGuess("5666"));
    }

    @Test
    public void userMakeGuessInIncorrectOrder(){
        game = new Game("1122");
        assertEquals("----", game.evaluateGuess("2211"));
    }

    @Test
    public void userGuessesSecretPartly(){
        game = new Game("1441");
        assertEquals("++--", game.evaluateGuess("1414"));
    }
}
