package pageobject.app;

import pageobject.tests.ShoppingCartPage;
import pageobject.tests.StoreMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by olenamalishenko on 4/16/17.
 */
public class Application {

    private WebDriver driver;

    private StoreMainPage storeMainPage;
    private ShoppingCartPage shoppingCartPage;


    public Application() {
        driver = new ChromeDriver();
        storeMainPage = new StoreMainPage(driver);
        shoppingCartPage = new ShoppingCartPage(driver);
    }

    public void quit() {
        driver.quit();
    }


    public void clearShoppingCart() {
        shoppingCartPage.open();
        shoppingCartPage.removeProducts();
    }


    public void addItemsToCart(int quantityToAdd) {
        int added = 0;
        while(added != quantityToAdd){
            added++;
            storeMainPage.open();
            storeMainPage.addProductToCart();
        }
    }
}
