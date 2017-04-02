package litecart.admin;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.DateFormatter;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by olenamalishenko on 3/23/17.
 */
public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public static final String PRODUCT_IMAGE_PATH ="media/product.jpg";

    @Before
    public void start(){
        driver = new ChromeDriver();
        //driver = new SafariDriver();
        //driver = new FirefoxDriver();
        wait = new WebDriverWait(driver,10);
        driver.manage().window().maximize();
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
        wait.until(titleIs("My Store"));
    }

    public String getRandomString(){
        Random rnd = new Random();
        int val = Math.abs(rnd.nextInt());
        return Integer.toString(val);
    }

    public String getDate(LocalDate date, String format){
        DateTimeFormatter df = DateTimeFormatter.ofPattern(format);
        return df.format(date);
    }

    public String getAbsolutePath(String relativePath){
        //String absPath = "" + relativePath;
        return new File(relativePath).getAbsolutePath();
    }

}
