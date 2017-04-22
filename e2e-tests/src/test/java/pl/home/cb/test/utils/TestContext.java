package pl.home.cb.test.utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import pl.home.cb.model.CodeBreakerModel;

import java.io.IOException;

public class TestContext {
    private static final String RUN_CMD_APP_COMMAND = "java -jar codebreaker-cmd-1.0-SNAPSHOT.jar";
    private CodeBreakerModel model;

    @Before
    public void testSetup() throws IOException {
        model = new CodeBreakerModel(Runtime.getRuntime().exec(RUN_CMD_APP_COMMAND));
    }

    @After
    public void tearDown(){
        model.shutDown();
    }

    public CodeBreakerModel getModel(){
        return this.model;
    }
}
