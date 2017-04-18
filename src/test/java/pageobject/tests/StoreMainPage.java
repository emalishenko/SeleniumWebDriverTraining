package pageobject.tests;

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

    public void addProductToCart(){
        String quantity = driver.findElement(By.cssSelector("span.quantity")).getAttribute("textContent");
        driver.findElement(By.cssSelector("div.content li.product")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("button[name=add_cart_product]")));
        driver.findElement(By.cssSelector("button[name=add_cart_product]")).click();
        String newQuantity = ((Integer)(Integer.parseInt(quantity) + 1)).toString();
        wait.until(attributeContains(By.cssSelector("span.quantity")
                , "textContent", String.valueOf(newQuantity)));
    }



}
