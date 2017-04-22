package pl.home.cb.model;

import java.io.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by Piotrek on 21.04.2017.
 */
public class CodeBreakerModel {
    private final Process cbApp;
    private final BufferedReader cbReader;
    private final BufferedWriter cbWriter;

    public CodeBreakerModel(Process codeBreakerCMDApp) {
        cbApp = codeBreakerCMDApp;
        cbReader = new BufferedReader(new InputStreamReader(cbApp.getInputStream()));
        cbWriter = new BufferedWriter(new OutputStreamWriter(cbApp.getOutputStream()));
    }

    private void waitForCBReadiness(){
        try {
            cbApp.waitFor(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(String.format("Error during initialization of CodeBreaker APP \n%s", e.getMessage()));
        }
    }

    public String getMessage() {
        waitForCBReadiness();
        StringBuffer output = new StringBuffer();
        try {
            while (cbReader.ready())
                output.append(cbReader.readLine());
            return output.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public void typeText(String text) {
        try {
            cbWriter.write(String.format("%s\n", text));
            cbWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(String.format("Error while writing to console !\n%s", e.getMessage()));
        }
    }
}
