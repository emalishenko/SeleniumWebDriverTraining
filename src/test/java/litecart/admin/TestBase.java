package litecart.admin;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.DateFormatter;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by olenamalishenko on 3/23/17.
 */
public class TestBase {
    protected RemoteWebDriver driver;
    protected WebDriverWait wait;

    public static final String PRODUCT_IMAGE_PATH ="media/product.jpg";
    public static final String SHOP_URL ="http://192.168.0.13/";

    public static final String USERNAME = "olenamalishenko1";
    public static final String AUTOMATE_KEY = "V3S2qTHkQHLxfZnLvWyq";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


    @Before
    public void start() throws MalformedURLException {

        //Local
        driver = new ChromeDriver();
        //driver = new SafariDriver();
        //driver = new FirefoxDriver();

        //Remote for Selenium grid
        //driver = new RemoteWebDriver(new URL("http://192.168.0.13:4444/wd/hub"), DesiredCapabilities.chrome());

        //Cloud
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("browser", "chrome");
//        caps.setCapability("browserstack.debug", "true");
//        caps.setCapability("build", "First build");
//
//        driver = new RemoteWebDriver(new URL(URL), caps);

        wait = new WebDriverWait(driver,30);
        driver.manage().window().maximize();
    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }

    public void login(){
        //driver.get("http://localhost/litecart/admin/");
        driver.get(SHOP_URL + "litecart/admin/");
        wait.until(presenceOfElementLocated(By.cssSelector("[name=username]")));
        driver.findElement(By.cssSelector("[name=username]")).sendKeys("admin");
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
