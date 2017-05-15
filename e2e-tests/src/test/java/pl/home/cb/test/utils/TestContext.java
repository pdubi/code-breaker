package pl.home.cb.test.utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import pl.home.cb.model.CodeBreakerModel;

import java.io.IOException;

public class TestContext {
    private static final String RUN_CMD_APP_COMMAND = "java -jar codebreaker-cmd-1.1-SNAPSHOT.jar %s";
    private CodeBreakerModel model;

    public void startApp(String password){
        try {
            model = new CodeBreakerModel(Runtime.getRuntime().exec(String.format(RUN_CMD_APP_COMMAND, password)));
        } catch (IOException e) {
            throw new RuntimeException("Game not started due to "+e.getMessage());
        }
    }

    @After
    public void tearDown(){
        model.shutDown();
    }

    public CodeBreakerModel getModel(){
        return this.model;
    }
}
