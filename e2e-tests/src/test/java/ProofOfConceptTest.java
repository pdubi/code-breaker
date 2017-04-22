import org.junit.Before;
import org.junit.Test;
import pl.home.cb.model.CodeBreakerModel;

import java.io.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Piotrek on 22.04.2017.
 */

public class ProofOfConceptTest {
    private CodeBreakerModel cb;

    @Before
    public void setup() throws IOException {
        cb = new CodeBreakerModel(Runtime.getRuntime().exec("java -jar codebreaker-cmd-1.0-SNAPSHOT.jar"));
    }

    @Test
    public void echoTest() {
        assertEquals("Type text!", cb.getMessage());
        cb.typeText("test123");
        assertEquals("test123", cb.getMessage());
    }
}
