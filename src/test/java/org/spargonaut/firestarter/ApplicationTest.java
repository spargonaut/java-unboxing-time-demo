package org.spargonaut.firestarter;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.OutputCapture;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ApplicationTest {

    @Rule
    public OutputCapture capture = new OutputCapture();

    @Test
    public void shouldPrintHelloWorldToStandardOut() {
        Application.main(null);
        assertTrue(capture.toString().contains("Hello World!\n"));
    }

    @Test
    @Ignore("Unignore this test to demonstate the time require to sum reference types")
    public void shouldDemonstrateTheTimeRequiredForSummingReferenceTypes() {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Max int size: " + Integer.MAX_VALUE);
        System.out.println("Reference type sum: " + sum);
    }

    @Test
    @Ignore("Unignore this test to demonstate the time require to sum primitive types")
    public void shouldDemonstrateTheTimeRequiredForSummingPrimitiveTypes() {
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Max int size: " + Integer.MAX_VALUE);
        System.out.println("Primitive type sum: " + sum);
    }
}
