package pl.home.cb.test.steps;

import com.sun.org.apache.bcel.internal.classfile.Code;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pl.home.cb.model.CodeBreakerModel;
import pl.home.cb.test.utils.TestContext;

import static org.hamcrest.junit.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace;
import static org.junit.Assert.assertEquals;

public class CoreSteps {
    private CodeBreakerModel cb;

    public CoreSteps(TestContext context){
        cb = context.getModel();
    }

    @Given("^User starts the game$")
    public void userStartsTheGame() throws Throwable {
        //Game is initiated within test context...
    }

    @Then("^Welcome message is displayed:$")
    public void welcomeMessageIsDisplayed(String message) throws Throwable {
        assertThat(message, equalToIgnoringWhiteSpace(cb.getMessage()));
    }
}
