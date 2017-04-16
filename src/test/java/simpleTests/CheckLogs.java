package simpleTests;

import litecart.admin.TestBase;
import org.junit.Test;
import org.openqa.selenium.logging.LogEntry;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by olenamalishenko on 4/16/17.
 */
public class CheckLogs extends TestBase {
    @Test
    public void Logs(){
        driver.get("http://software-testing.ru/");
        wait.until(titleIs("Software-Testing.Ru"));
        for (LogEntry l:driver.manage().logs().get("browser").getAll())
        {
            System.out.println(l);
        }
    }
}
