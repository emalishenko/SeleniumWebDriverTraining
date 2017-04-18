package litecart.shop;

import litecart.admin.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by olenamalishenko on 3/26/17.
 */
public class ShoppingItemProperties extends TestBase {

    @Test
    public void CorrectShoppingItemIsOpened(){
//        driver.get("http://localhost/litecart");
//        wait.until(titleIs("Online Store | My Store"));
//        ShopItem shopItemMainPageProp = new ShopItem();
//        //Set ShopItem object properits according to main page
//        WebElement shopItemMainPage = driver.findElement(By.cssSelector("div#box-campaigns li a.link"));
//        //Set shopingItem name
//        shopItemMainPageProp.setName(shopItemMainPage.findElement(By.cssSelector("div.name"))
//                .getAttribute("textContent"));
//        //Set shoppingItem regular price
//        shopItemMainPageProp.setRegularPrice(shopItemMainPage.findElement(By.cssSelector("div.price-wrapper .regular-price"))
//                .getAttribute("textContent"));
//        //Set shoppingItem campaignPrice
//        shopItemMainPageProp.setCampaignPrice(shopItemMainPage.findElement(By.cssSelector("div.price-wrapper .campaign-price"))
//                .getAttribute("textContent"));
//
//        //Go to details page
//        shopItemMainPage.click();
//        wait.until(titleIs("Yellow Duck | Subcategory | Rubber Ducks | My Store"));
//        ShopItem shopItemDetailsPageProp = new ShopItem();
//        //Set ShopItem object properits according to details page
//        WebElement shopItemDetailsPage = driver.findElement(By.cssSelector("div#box-product"));
//        //Set shopingItem name
//        shopItemDetailsPageProp.setName(shopItemDetailsPage.findElement(By.cssSelector("h1.title"))
//                .getAttribute("textContent"));
//        //Set shoppingItem regular price
//        shopItemDetailsPageProp.setRegularPrice(shopItemDetailsPage.findElement(By.cssSelector("div.price-wrapper .regular-price"))
//                .getAttribute("textContent"));
//        //Set shoppingItem campaignPrice
//        shopItemDetailsPageProp.setCampaignPrice(shopItemDetailsPage.findElement(By.cssSelector("div.price-wrapper .campaign-price"))
//                .getAttribute("textContent"));
//
//        //Check is obtained values are identical
//        Assert.assertEquals("ShopItem name on main and details page are different"
//                , shopItemDetailsPageProp.getName(), shopItemMainPageProp.getName());
//        Assert.assertEquals("Regular prices on main and details page are different",
//                shopItemDetailsPageProp.getRegularPrice(), shopItemMainPageProp.getRegularPrice());
//        Assert.assertEquals("Campaign prices on main and details page are different",
//                shopItemDetailsPageProp.getCampaignPrice(), shopItemMainPageProp.getCampaignPrice());


    }

    @Test
    public void mainPagePriceStyling(){

//        driver.get("http://localhost/litecart");
//        wait.until(titleIs("Online Store | My Store"));
//        WebElement shopItemMainPage = driver.findElement(By.cssSelector("div#box-campaigns li a.link"));
//
//        //Check if the regular price text strike-trough
//        List<WebElement> regularPriceStrikeStyle = shopItemMainPage.
//                findElements(By.cssSelector("div.price-wrapper s.regular-price"));
//        Assert.assertEquals("The regular price is not strike-through", 1
//                , regularPriceStrikeStyle.size());
//
//        //Check if the campaign price style is strong
//        List<WebElement> campaignPriceStrongStyle = shopItemMainPage.
//                findElements(By.cssSelector("div.price-wrapper strong.campaign-price"));
//        Assert.assertEquals("The campaign price style is not strong", 1
//                , campaignPriceStrongStyle.size());
//
//        //JavascriptExecutor will be used for getting style properties
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//
//        //Check if the regular price colour is gray
//        String regularPriceRGB = (String)jse.executeScript("return getComputedStyle(document" +
//                ".querySelector(\"div.price-wrapper s.regular-price\")).color");
//        String[] regularPriceColors = regularPriceRGB.split("[, ()a-z]+");
//        //Using last 3 elements since the colors[0] == "" (result of splitting)
//        Assert.assertEquals("Color is not GRAY"
//                , regularPriceColors[1].equals(regularPriceColors[2]) && regularPriceColors[2].equals(regularPriceColors[3])
//                , true);
//
//        //Check if the campaign price colour is red
//        String campaignPriceRGB = (String)jse.executeScript("return getComputedStyle(document" +
//                ".querySelector(\"div.price-wrapper strong.campaign-price\")).color");
//        String[] campaignPriceColors = campaignPriceRGB.split("[, ()a-z]+");
//        //Using last 3 elements since the colors[0] == "" (result of splitting)
//        Assert.assertEquals("Color is not RED"
//                , (!campaignPriceColors[1].equals("0") && campaignPriceColors[2].equals("0") && campaignPriceColors[3].equals("0"))
//                , true);
//
//        //Check that campaign price font size is bigger than regular price font size
//        String regularPriceFontSize = (String)jse.executeScript("return getComputedStyle(document" +
//                ".querySelector(\"div.price-wrapper s.regular-price\")).fontSize");
//        String campaignPriceFontSize = (String)jse.executeScript("return getComputedStyle(document" +
//                ".querySelector(\"div.price-wrapper strong.campaign-price\")).fontSize");
//        regularPriceFontSize = regularPriceFontSize.substring(0, regularPriceFontSize.length() - 2);
//        campaignPriceFontSize = campaignPriceFontSize.substring(0, campaignPriceFontSize.length() - 2);
//        Assert.assertEquals("Campaign prise font is not bigger than regular prise font"
//                , (Float.parseFloat(campaignPriceFontSize) - Float.parseFloat(regularPriceFontSize)) > 0
//                , true);


    }

    @Test
    public void detailsPagePriceStyling(){
//        driver.get("http://localhost/litecart");
//        wait.until(titleIs("Online Store | My Store"));
//        driver.findElement(By.cssSelector("div#box-campaigns li a.link")).click();
//        wait.until(titleIs("Yellow Duck | Subcategory | Rubber Ducks | My Store"));
//        WebElement shopItemDetailsPage = driver.findElement(By.cssSelector("div#box-product"));
//
//        //Check if the regular price text strike-trough
//        List<WebElement> regularPriceStrikeStyle = shopItemDetailsPage.
//                findElements(By.cssSelector("div.price-wrapper s.regular-price"));
//        Assert.assertEquals("The regular price is not strike-through", 1
//                , regularPriceStrikeStyle.size());
//
//        //Check if the campaign price style is strong
//        List<WebElement> campaignPriceStrongStyle = shopItemDetailsPage.
//                findElements(By.cssSelector("div.price-wrapper strong.campaign-price"));
//        Assert.assertEquals("The campaign price style is not strong", 1
//                , campaignPriceStrongStyle.size());
//
//        //JavascriptExecutor will be used for getting style properties
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//
//        //Check if the regular price colour is gray
//        String regularPriceRGB = (String)jse.executeScript("return getComputedStyle(document" +
//                ".querySelector(\"div.price-wrapper s.regular-price\")).color");
//        String[] regularPriceColors = regularPriceRGB.split("[, ()a-z]+");
//        //Using last 3 elements since the colors[0] == "" (result of splitting)
//        Assert.assertEquals("Color is not GRAY"
//                , regularPriceColors[1].equals(regularPriceColors[2]) && regularPriceColors[2].equals(regularPriceColors[3])
//                , true);
//
//        //Check if the campaign price colour is red
//        String campaignPriceRGB = (String)jse.executeScript("return getComputedStyle(document" +
//                ".querySelector(\"div.price-wrapper strong.campaign-price\")).color");
//        String[] campaignPriceColors = campaignPriceRGB.split("[, ()a-z]+");
//        //Using last 3 elements since the colors[0] == "" (result of splitting)
//        Assert.assertEquals("Color is not RED"
//                , (!campaignPriceColors[1].equals("0") && campaignPriceColors[2].equals("0") && campaignPriceColors[3].equals("0"))
//                , true);
//
//        //Check that campaign price font size is bigger than regular price font size
//        String regularPriceFontSize = (String)jse.executeScript("return getComputedStyle(document" +
//                ".querySelector(\"div.price-wrapper s.regular-price\")).fontSize");
//        String campaignPriceFontSize = (String)jse.executeScript("return getComputedStyle(document" +
//                ".querySelector(\"div.price-wrapper strong.campaign-price\")).fontSize");
//        regularPriceFontSize = regularPriceFontSize.substring(0, regularPriceFontSize.length() - 2);
//        campaignPriceFontSize = campaignPriceFontSize.substring(0, campaignPriceFontSize.length() - 2);
//        Assert.assertEquals("Campaign prise font is not bigger than regular prise font"
//                , (Float.parseFloat(campaignPriceFontSize) - Float.parseFloat(regularPriceFontSize)) > 0
//                , true);

    }
}
