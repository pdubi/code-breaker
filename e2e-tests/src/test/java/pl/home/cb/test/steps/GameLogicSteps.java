package pl.home.cb.test.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pl.home.cb.model.CodeBreakerModel;
import pl.home.cb.test.utils.TestContext;

import static org.junit.Assert.assertEquals;

public class GameLogicSteps {
    CodeBreakerModel cb;
    public GameLogicSteps(TestContext context){
        this.cb = context.getModel();
    }

    @When("^User submits following guess: \"([^\"]*)\"$")
    public void userSubmitsFollowingGuess(String guess) {
        cb.typeText(guess);
    }

    @Then("^User receives following mark: \"([^\"]*)\"$")
    public void userReceivesFollowingMark(String mark) {
        assertEquals(mark, cb.getMessage());
    }
}
