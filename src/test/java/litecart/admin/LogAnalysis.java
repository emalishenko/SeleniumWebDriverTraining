package litecart.admin;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntry;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by olenamalishenko on 4/15/17.
 */
public class LogAnalysis extends TestBase {

    @Test
    public void LogCheck(){
//        login();
//        wait.until(titleIs("My Store"));
//        driver.get(SHOP_URL + "litecart/admin/?app=catalog&doc=catalog&category_id=1");
//        wait.until(presenceOfElementLocated(By.cssSelector("table.dataTable")));
//        List<WebElement> products = driver.findElements(By.cssSelector("table.dataTable tr.row td:nth-child(5) a"));
//        LinkedList<String> urls = new LinkedList<>();
//        //Get links to products' properties page
//        Iterator<WebElement> iter = products.iterator();
//        while (iter.hasNext()){
//            String href = iter.next().getAttribute("href");
//            urls.add(href);
//        }
//        //Open each  products' properties page
//        for(int i = 0; i < urls.size(); i++){
//            driver.get(urls.get(i));
//            System.out.println("Link " + urls.get(i));
//            List<LogEntry> log = driver.manage().logs().get("browser").getAll();
//            for (LogEntry l : log) {
//                System.out.println("Log entry: " + l);
//            }
//            Assert.assertTrue("Log is not empty!", log.size() == 0);
//
//        }
    }
}
