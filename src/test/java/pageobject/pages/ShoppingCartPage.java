package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.pages.Page;

import java.util.List;

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

    public void removeProduct(){
        int count = getOrderSummaryList().size();
        if (count > 1){
            driver.findElement(By.cssSelector("li.shortcut img")).click();
            wait.until(attributeContains(By.cssSelector("li.shortcut a"), "className", "act"));
        }
        driver.findElement(By.cssSelector("div.viewport button[name=remove_cart_item]")).click();
        wait.until(numberOfElementsToBeLessThan(By.cssSelector("div#order_confirmation-wrapper td.item"),
                count));
    }

    public List<WebElement> getOrderSummaryList(){
        return driver.findElements(By.xpath("//td[@class = 'item']/.."));
    }


}
