package pageobject.tests;

import litecart.admin.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

/**
 * Created by olenamalishenko on 4/5/17.
 */
public class Checkout extends TestBase {

    @Test
    public void canAddRemoveShoppingItems(){
        app.addItemsToCart(3);
        app.clearShoppingCart();
    }

}
