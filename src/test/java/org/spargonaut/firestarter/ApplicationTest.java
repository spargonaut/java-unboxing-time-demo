package org.spargonaut.firestarter;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.OutputCapture;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ApplicationTest {

    @Rule
    public OutputCapture capture = new OutputCapture();

    @Test
    public void shouldPrintHelloWorldToStandardOut() {
        Application application = new Application();
        application.main(null);
        assertThat(capture.toString(), is("Hello World!\n"));
    }
}
