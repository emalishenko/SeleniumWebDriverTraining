package litecart.shop;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by olenamalishenko on 3/24/17.
 */
public class MainPageStickers {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @Before
    public void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
    }

    @Test
    public void StickerIsAvailable(){
        driver.get("http://localhost/litecart");
        wait.until(titleIs("Online Store | My Store"));
        List<WebElement> items = driver.findElements(By.cssSelector("div.image-wrapper"));
        for(WebElement item:items){
            List<WebElement> sticker = item.findElements(By.cssSelector("div.sticker"));
            Assert.assertEquals("Saticker is absent", 1, sticker.size());
        }
    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
