package pageobject.tests;

import org.junit.After;
import org.junit.Before;
import pageobject.app.Application;

import java.net.MalformedURLException;

/**
 * Created by olenamalishenko on 3/23/17.
 */
public class TestBase {

    public Application app;

    @Before
    public void start() throws MalformedURLException {
        app = new Application();
    }

    @After
    public void stop(){
        app.quit();
    }

}
