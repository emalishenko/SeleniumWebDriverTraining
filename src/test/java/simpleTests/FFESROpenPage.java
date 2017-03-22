package simpleTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by olenamalishenko on 3/16/17.
 */
public class FFESROpenPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private DesiredCapabilities caps;

    @Before
    public void start(){
        //caps.setCapability(FirefoxDriver.MARIONETTE, false);
        //workaround for the issue:
        FirefoxOptions opt = new FirefoxOptions();
        opt.setLegacy(true);
        opt.setBinary("/Applications/Firefox2.app/Contents/MacOS/firefox-bin");

        driver = new FirefoxDriver(opt);
        wait = new WebDriverWait(driver,10);
    }

    @Test
    public void openPage(){
        System.out.println(((HasCapabilities)driver).getCapabilities());
        driver.manage().window().maximize();
        driver.get("http://google.com/");
        driver.findElement(By.name("q")).sendKeys("maven search");
        driver.findElement(By.name("btnG")).click();
        wait.until(titleIs("maven search - Google-søgning"));
    }


    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
