package setupCheck;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by olenamalishenko on 3/16/17.
 */
public class OpenPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver", "../selenium/drivers/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
    }

    @Test
    public void openPage(){
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
