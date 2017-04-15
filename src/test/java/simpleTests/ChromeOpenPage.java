package simpleTests;

import litecart.admin.TestBase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by olenamalishenko on 3/16/17.
 */
public class ChromeOpenPage extends TestBase{

    @Test
    public void openPage(){
        //driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        wait.until(presenceOfElementLocated(By.cssSelector("input#lst-ib")));
        driver.findElement(By.name("q")).sendKeys("maven search");
        driver.findElement(By.name("btnG")).click();
//        wait.until(titleIs("maven search - Google-søgning"));
    }

}
