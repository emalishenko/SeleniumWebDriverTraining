package pageobject.app;

import pageobject.pages.ProductDetailsPage;
import pageobject.pages.ShoppingCartPage;
import pageobject.pages.StoreMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by olenamalishenko on 4/16/17.
 */
public class Application {

    private WebDriver driver;

    private StoreMainPage storeMainPage;
    private ShoppingCartPage shoppingCartPage;
    private ProductDetailsPage productDetailsPage;

    public Application() {
        driver = new ChromeDriver();
        storeMainPage = new StoreMainPage(driver);
        shoppingCartPage = new ShoppingCartPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
    }

    public void quit() {
        driver.quit();
    }

    public void clearCart(){
        shoppingCartPage.open();
        int count = orderSummaryListSize();
        while(count > 0){
            shoppingCartPage.removeProduct();
            count--;
        }
    }

    public int orderSummaryListSize(){
        return shoppingCartPage.getOrderSummaryList().size();
    }

    public void addProductsToCart(int quantityToAdd) {
        int added = 0;
        while(added != quantityToAdd){
            added++;
            storeMainPage.openProductDetailsPage();
            productDetailsPage.addProductToCart();
        }
    }

}
