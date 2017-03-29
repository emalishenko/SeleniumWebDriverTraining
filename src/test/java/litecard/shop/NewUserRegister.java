package litecard.shop;

import litecart.admin.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by olenamalishenko on 3/29/17.
 */
public class NewUserRegister extends TestBase {

    @Test
    public void registerNewUser() {

        String email = getRandomString() + "@domain.com";
        String password = "password";

        driver.manage().window().maximize();
        driver.get("http://localhost/litecart");
        wait.until(titleIs("Online Store | My Store"));
        //Open register page
        driver.findElement(By.cssSelector("form[name=login_form] tr:last-child")).click();
        wait.until(titleIs("Create Account | My Store"));
        //Set country = Unites States
        driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("United States");
        driver.findElement(By.cssSelector("li.select2-results__option:first-child")).click();
        //Set state = New York; following 3 lines don't work for Safari. Simple way without Select class also
        //does not work.
        WebElement mySelectElm = driver.findElement(By.cssSelector("select[name=zone_code]"));
        Select mySelect= new Select(mySelectElm);
        mySelect.selectByVisibleText("New York");

        // Fill in simple text fields
        driver.findElement(By.cssSelector("[name=tax_id]")).sendKeys("XXX-XX-XXXX");
        driver.findElement(By.cssSelector("[name=company]")).sendKeys("Selenium WEBDRIVER");
        driver.findElement(By.cssSelector("[name=firstname]")).sendKeys("John");
        driver.findElement(By.cssSelector("[name=lastname]")).sendKeys("Smith");
        driver.findElement(By.cssSelector("[name=address1]")).sendKeys("Address 1");
        driver.findElement(By.cssSelector("[name=address2]")).sendKeys("Address 2");
        driver.findElement(By.cssSelector("[name=postcode]")).sendKeys("06390");
        driver.findElement(By.cssSelector("[name=city]")).sendKeys("New York");
        driver.findElement(By.cssSelector("[name=email]")).sendKeys(email);
        driver.findElement(By.cssSelector("[name=phone]")).sendKeys("1-518-486-9786");
        driver.findElement(By.cssSelector("[name=password]")).sendKeys(password);
        driver.findElement(By.cssSelector("[name=confirmed_password]")).sendKeys(password);
        driver.findElement(By.cssSelector("button[name=create_account]")).click();
        wait.until(titleIs("Online Store | My Store"));

        //Logout
        driver.findElement(By.cssSelector("div#box-account ul.list-vertical li:last-child a")).click();
        //wait.until(titleIs("Online Store | My Store"));

        //Login with created user
        wait.until(ExpectedConditions
                .presenceOfElementLocated(By.cssSelector("form[name=login_form] input[name=email]")));
        driver.findElement(By.cssSelector("form[name=login_form] input[name=email]")).sendKeys(email);
        driver.findElement(By.cssSelector("form[name=login_form] input[name=password]")).sendKeys(password);
        driver.findElement(By.cssSelector("form[name=login_form] button[name=login]")).click();
        //wait.until(titleIs("Online Store | My Store"));


        //Logout
        wait.until(ExpectedConditions
                .presenceOfElementLocated(By.cssSelector("div#box-account ul.list-vertical li:last-child a")));
        driver.findElement(By.cssSelector("div#box-account ul.list-vertical li:last-child a")).click();
    }

    private String getRandomString(){
        Random rnd = new Random();
        int val = Math.abs(rnd.nextInt());
        return Integer.toString(val);
    }
}
