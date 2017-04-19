package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobject.pages.Page;

import static org.openqa.selenium.support.ui.ExpectedConditions.attributeContains;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by olenamalishenko on 4/18/17.
 */
public class StoreMainPage extends Page {

    public StoreMainPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("http://localhost/litecart");
        wait.until(titleIs("Online Store | My Store"));
    }

    public void openProductDetailsPage(){
        open();
        driver.findElement(By.cssSelector("div.content li.product")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("button[name=add_cart_product]")));

    }
}
