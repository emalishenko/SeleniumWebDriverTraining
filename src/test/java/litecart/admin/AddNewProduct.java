package litecart.admin;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by olenamalishenko on 3/30/17.
 */
public class AddNewProduct extends TestBase {


    @Test
    public void AddProduct(){
        login();
        String productPref = getRandomString();
        System.out.println("Product " + productPref + " will be created");

        wait.until(ExpectedConditions
                .presenceOfElementLocated(By.cssSelector("ul#box-apps-menu li:nth-child(2)")));
        driver.findElement(By.cssSelector("ul#box-apps-menu li:nth-child(2)")).click();
        wait.until(ExpectedConditions
                .presenceOfElementLocated(By.cssSelector("a.button:last-child")));
        driver.findElement(By.cssSelector("a.button:last-child")).click();
        wait.until(ExpectedConditions
                .presenceOfElementLocated(By.cssSelector("[name='name[en]']")));

        //Fill in General tab
        driver.findElement(By.cssSelector("input[name='name[en]']"))
                .sendKeys("Product " + productPref);
        driver.findElement(By.cssSelector("input[name=status]")).click();
        driver.findElement(By.cssSelector("input[name=code]")).sendKeys(productPref);
        driver.findElement(By.cssSelector("#tab-general input[name='product_groups[]'][value ='1-3']")).click();
        driver.findElement(By.cssSelector("#tab-general input[name=quantity]")).sendKeys("10");
        LocalDate localDate = LocalDate.now();
        driver.findElement(By.cssSelector("#tab-general input[name=date_valid_from]"))
                .sendKeys(getDate(localDate, "yyyy-MM-dd"));
        driver.findElement(By.cssSelector("#tab-general input[name=date_valid_to]"))
                .sendKeys(getDate(localDate, "yyyy-MM-dd"));
        driver.findElement(By.cssSelector("#tab-general input[name='new_images[]']"))
                .sendKeys(getAbsolutePath(PRODUCT_IMAGE_PATH));

        //Fill in Information tab
        driver.findElement(By.cssSelector(".index li:nth-child(2)")).click();
        wait.until(ExpectedConditions
                .presenceOfElementLocated(By.cssSelector("select[name=manufacturer_id]")));
        Select manufacturerSelect = new Select(driver.findElement(By.cssSelector("select[name=manufacturer_id]")));
        manufacturerSelect.selectByValue("1");
        driver.findElement(By.cssSelector("input[name=keywords]"))
                .sendKeys("keyword " + productPref);
        driver.findElement(By.cssSelector("input[name='short_description[en]']"))
                .sendKeys(productPref + " short description");
        driver.findElement(By.cssSelector("div.trumbowyg-editor"))
                .sendKeys("Product " + productPref + " description");
        driver.findElement(By.cssSelector("input[name='head_title[en]']"))
                .sendKeys("Product " + productPref + " head title");
        driver.findElement(By.cssSelector("input[name='meta_description[en]']"))
                .sendKeys("Product " + productPref + " meta description");

        //Fill in Prices tab
        driver.findElement(By.cssSelector(".index li:nth-child(4)")).click();
        Select currencySelect = new Select(driver
                .findElement(By.cssSelector("select[name=purchase_price_currency_code]")));
        currencySelect.selectByValue("EUR");
        driver.findElement(By.cssSelector("input[name=purchase_price]")).clear();
        driver.findElement(By.cssSelector("input[name=purchase_price]")).sendKeys("12.03");
        driver.findElement(By.cssSelector("input[name='prices[USD]']")).sendKeys("5.16");
        driver.findElement(By.cssSelector("input[name='prices[EUR]']")).sendKeys("3");

        //Submit product creating
        driver.findElement(By.cssSelector("button[name=save]")).click();

        //Check if the product is added
        wait.until(ExpectedConditions
                .presenceOfElementLocated(By.cssSelector("table.dataTable")));
        List<WebElement> products = driver.findElements(By
                .cssSelector("table.dataTable tr.row td:nth-child(3)"));
        int productsCreated = 0;
        for(WebElement product:products){
            if(product.getAttribute("textContent").equals(" Product " + productPref)){
                productsCreated++;
            };
        }
        Assert.assertEquals(Integer.toString(productsCreated)
                + " products have been created instead of 1", 1, productsCreated);


    }

}
