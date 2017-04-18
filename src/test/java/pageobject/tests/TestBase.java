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

//    protected RemoteWebDriver driver;
//    protected WebDriverWait wait;
//
//    public static final String PRODUCT_IMAGE_PATH ="media/product.jpg";
//    public static final String SHOP_URL ="http://localhost/";
//
//    public static final String USERNAME = "olenamalishenko1";
//    public static final String AUTOMATE_KEY = "V3S2qTHkQHLxfZnLvWyq";
//    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


    @Before
    public void start() throws MalformedURLException {

        //Local
        //driver = new ChromeDriver();
        //System.out.println(driver.manage().logs().getAvailableLogTypes());
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

//        wait = new WebDriverWait(driver,30);
//        driver.manage().window().maximize();
        app = new Application();
    }

    @After
    public void stop(){
//        driver.quit();
//        driver = null;
        app.quit();
    }

//    public void login(){
//        //driver.get("http://localhost/litecart/admin/");
//        driver.get(SHOP_URL + "litecart/admin/");
//        wait.until(presenceOfElementLocated(By.cssSelector("[name=username]")));
//        driver.findElement(By.cssSelector("[name=username]")).sendKeys("admin");
//        driver.findElement(By.name("password")).sendKeys("admin");
//        driver.findElement(By.name("login")).click();
//        wait.until(titleIs("My Store"));
//    }
//
//    public String getRandomString(){
//        Random rnd = new Random();
//        int val = Math.abs(rnd.nextInt());
//        return Integer.toString(val);
//    }
//
//    public String getDate(LocalDate date, String format){
//        DateTimeFormatter df = DateTimeFormatter.ofPattern(format);
//        return df.format(date);
//    }
//
//    public String getAbsolutePath(String relativePath){
//        //String absPath = "" + relativePath;
//        return new File(relativePath).getAbsolutePath();
//    }

}
