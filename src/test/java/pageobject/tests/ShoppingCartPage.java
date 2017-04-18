package pageobject.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.pages.Page;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.stalenessOf;

/**
 * Created by olenamalishenko on 4/18/17.
 */
public class ShoppingCartPage extends Page {
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.findElement(By.cssSelector("div#cart a.link")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("div#order_confirmation-wrapper")));
    }

    public void removeProducts(){
        int count = driver.findElements(By.cssSelector("div#order_confirmation-wrapper td.item")).size();
        WebElement elem;
        while(count > 1){
            elem = driver.findElement(By.cssSelector("li.shortcut img"));
            elem.click();
            wait.until(attributeContains(By.cssSelector("li.shortcut a"), "className", "act"));
            driver.findElement(By.cssSelector("div.viewport button[name=remove_cart_item]")).click();
            wait.until(numberOfElementsToBe(By.cssSelector("div#order_confirmation-wrapper td.item")
                    , count - 1));
            count--;
        }
        //Removing the last shop item
        elem = driver.findElement(By.cssSelector("div#box-checkout-summary"));
        driver.findElement(By.cssSelector("div.viewport button[name=remove_cart_item]")).click();
        wait.until(stalenessOf(elem));
    }


}
