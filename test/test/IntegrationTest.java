package test;

import org.junit.Test;
import play.libs.F.Callback;
import play.test.TestBrowser;

import static org.junit.Assert.assertTrue;
import static play.test.Helpers.*;

/**
 * Integration tests for application.
 */
public class IntegrationTest {

    /**
     * Add your integration test here
     * in this example we just check if the welcome page is being shown.
     */
    @Test
    public void test() {
        running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
            public void invoke(TestBrowser browser) {
                browser.goTo("http://localhost:3333");
                assertTrue(browser.pageSource().contains("Your new application is ready."));
            }
        });
    }

}