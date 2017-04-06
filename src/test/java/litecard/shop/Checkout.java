package litecard.shop;

import litecart.admin.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

/**
 * Created by olenamalishenko on 4/5/17.
 */
public class Checkout extends TestBase {

    @Test
    public void AddToRemoveFromShoppingCart(){
        //Adding first shopping item to shopping cart
        int count = 1;
        while(count != 4){
            driver.get("http://localhost/litecart");
            wait.until(titleIs("Online Store | My Store"));
            driver.findElement(By.cssSelector("div.content li.product")).click();
            wait.until(presenceOfElementLocated(By.cssSelector("button[name=add_cart_product]")));
            driver.findElement(By.cssSelector("button[name=add_cart_product]")).click();
            wait.until(attributeContains(By.cssSelector("span.quantity")
                    , "textContent", String.valueOf(count)));
            count++;
        }
        //Go to Shopping cart
        driver.findElement(By.cssSelector("div#cart a.link")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("div#order_confirmation-wrapper")));

        //Removing shop items one by one until one remains
        count = driver.findElements(By.cssSelector("div#order_confirmation-wrapper td.item")).size();
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
