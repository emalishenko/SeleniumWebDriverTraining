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
//        login();
//        wait.until(titleIs("My Store"));
//        //Get all elements of left menu
//        List<WebElement> leftMenu = driver.findElements(By.cssSelector("li#app-"));
//        //Get string names of the left menu
//        List<String> leftMenuItems = getMenuNames(leftMenu);
//
//        //Iterate through names of left menu
//        for(String itemLevel1: leftMenuItems) {
//            //Get each menu item using its string name
//            driver.findElement(By.xpath("//span[.='" + itemLevel1 + "']")).click();
//            //Get all sub-elements of current menu item
//            List<WebElement> subMenu = driver.findElements(By.cssSelector("li[id^=doc-]"));
//            checkIfHeaderIsPresent();
//
//            //Get string names of sub-menu items for current menu item
//            List<String> leftMenuSubItems = getMenuNames(subMenu);
//            for (String itemLevel2 : leftMenuSubItems) {
//                driver.findElement(By.xpath("//span[.='" + itemLevel2 + "']")).click();
//                checkIfHeaderIsPresent();
//                System.out.println(itemLevel1 + " >> " + itemLevel2);
//            }
//        }
    }

//    private List<String> getMenuNames(List<WebElement> elList){
//        List<String> items = new LinkedList<>();
//        //generating set of first level menu items
//        for(WebElement el:elList){
//            items.add(el.getText());
//        }
//        return items;
//    }
//
//    private void checkIfHeaderIsPresent(){
//        List<WebElement> header = driver.findElements(By.cssSelector("h1"));
//        Assert.assertEquals("Header is absent", header.size(), 1);
//    }

}
