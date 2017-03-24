package litecart.admin;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by olenamalishenko on 3/23/17.
 */
public class MenuCheck extends TestBase {

    @Test
    public void MenuCheck(){
        login();
        wait.until(titleIs("My Store"));
        List<WebElement> leftMenu = driver.findElements(By.cssSelector("li#app-"));
        List<String> leftMenuItems = getMenuNames(leftMenu);
        //go through menu items
        for(String itemLevel1: leftMenuItems){
            driver.findElement(By.xpath("//span[.='" + itemLevel1 + "']")).click();
            List<WebElement> subMenu = driver.findElements(By.cssSelector("li[id^=doc-]"));
            List<String> leftMenuSubItems = getMenuNames(subMenu);
            //go through sub-menu items
            if(!leftMenuSubItems.isEmpty()){
                for(String itemLevel2: leftMenuSubItems){
                    driver.findElement(By.xpath("//span[.='" + itemLevel2 + "']")).click();
                    //String currentMenuItem = "";
                    List<WebElement> header = driver.findElements(By.cssSelector("h1"));
                    Assert.assertEquals("Title is absent", header.size(), 1);
                    System.out.println(itemLevel1 + " >> " + itemLevel2);
                }
            }
        }
    }

    private List<String> getMenuNames(List<WebElement> elList){
        List<String> items = new LinkedList<>();
        //generating set of first level menu items
        for(WebElement el:elList){
            items.add(el.getText());
        }
        return items;
    }


}
