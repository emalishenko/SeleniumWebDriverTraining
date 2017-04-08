package litecart.admin;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by olenamalishenko on 4/7/17.
 */
public class CountryEdit extends TestBase {

    @Test
    public void CountryEditTest(){
        login();
        wait.until(titleIs("My Store"));
        //driver.findElement(By.cssSelector("ul#box-apps-menu li:nth-child(3)")).click();
        driver.get("http://localhost/litecart/admin/?app=countries&doc=countries");
        wait.until(presenceOfElementLocated(By.cssSelector("form[name=countries_form] .row")));
        driver.findElement(By.cssSelector("form[name=countries_form] .row"))
                .findElement(By.cssSelector("td:nth-child(5) a")).click();
        wait.until(presenceOfElementLocated(By.cssSelector("td#content i.fa-external-link")));
        List<WebElement> externalLinks = driver
                .findElements(By.cssSelector("td#content i.fa-external-link"));
        //Click through external links
        String linkUrl, pageUrl;
        for(WebElement link:externalLinks){
            String mainWindow = driver.getWindowHandle();
            link.click();
            linkUrl = link.findElement(By.xpath("..")).getAttribute("pathname");
            System.out.println("Link URL " + linkUrl);
            String newWindow = getAnotherWindow(mainWindow);
            driver.switchTo().window(newWindow);
            pageUrl = driver.getCurrentUrl();
            System.out.println("Page URL " + pageUrl);
            //Assert.assertTrue("Incorrect page is opened",pageUrl.endsWith(linkUrl));
            driver.close();
            driver.switchTo().window(mainWindow);
        }
    }

private String getAnotherWindow(String mainWindow) {
        wait.until(numberOfWindowsToBe(2));
        Set<String> allHandlers = driver.getWindowHandles();
        allHandlers.remove(mainWindow);
        return allHandlers.iterator().next();
    }

}
