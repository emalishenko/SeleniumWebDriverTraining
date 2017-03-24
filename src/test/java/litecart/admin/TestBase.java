package litecart.admin;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by olenamalishenko on 3/23/17.
 */
public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @Before
    public void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }

    public void login(){
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }
}
