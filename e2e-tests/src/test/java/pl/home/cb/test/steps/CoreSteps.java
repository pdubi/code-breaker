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
    TestContext context;

    public CoreSteps(TestContext context){
        this.context = context;
    }

    @Given("^User starts the game$")
    public void userStartsTheGame() {
        context.startApp("1234");
    }

    @Given("^The game starts with secret password \"([^\"]*)\"$")
    public void theGameStartsWithSecretPassword(String secret) {
        context.startApp(secret);
    }

    @Given("^User skips welcome message$")
    public void userSkipsWelcomeMessage() {
        context.getModel().getMessage();
    }

    @Then("^Welcome message is displayed:$")
    public void welcomeMessageIsDisplayed(String message) {
        assertThat(message, equalToIgnoringWhiteSpace(context.getModel().getMessage()));
    }
}
