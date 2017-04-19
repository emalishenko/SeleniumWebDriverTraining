package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.ui.ExpectedConditions.attributeContains;

/**
 * Created by olenamalishenko on 4/19/17.
 */
public class ProductDetailsPage extends Page {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void addProductToCart(){
        int quantity = getQuantityInCart();
        driver.findElement(By.cssSelector("button[name=add_cart_product]")).click();
        wait.until(attributeContains(By.cssSelector("span.quantity"), "textContent", String.valueOf(quantity + 1)));
    }

    public Integer getQuantityInCart(){
        return Integer.parseInt(driver.findElement(By.cssSelector("span.quantity")).getAttribute("textContent"));
    }
}
