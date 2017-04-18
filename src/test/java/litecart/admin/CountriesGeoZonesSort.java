package litecart.admin;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by olenamalishenko on 3/25/17.
 */
public class CountriesGeoZonesSort extends TestBase {

    @Test
    public void CountriesSortingTest(){
//        login();
//        driver.get("http://localhost/litecart/admin/?app=countries&doc=countries");
//        List<WebElement> countiresWebElems = driver.findElements(By.cssSelector("td#sidebar td:nth-child(5)"));
//        Assert.assertEquals("Countries list is not sorted alphabetically",
//                isSorted(countiresWebElems, "textContent"), true);
    }

    @Test
    //Did not pay attention to the link where to check. Therefore created exstra test
    public void TimeZonesSortingTest(){
//        login();
//        driver.get("http://localhost/litecart/admin/?app=countries&doc=countries");
//        List<WebElement> countriesList = driver.findElements(By.cssSelector("table.dataTable tr.row"));
//
//        //Compose the list of links to countiry details page, where zones count !=0
//        List<String> linksToNonEmptyTimeSones = new LinkedList<>();
//        String zoneLink = "";
//        for(WebElement elem:countriesList){
//            zoneLink = elem.findElement(By.cssSelector("tr td:nth-child(6)")).getAttribute("textContent");
//            if(zoneLink.compareToIgnoreCase("0") != 0){
//                linksToNonEmptyTimeSones.add(elem.findElement(By.cssSelector("td:nth-child(7) a"))
//                        .getAttribute("href"));
//            }
//        }
//        //Compose list of zones and check if it is sorted
//        List<WebElement> zonesWebElem;
//        if (!linksToNonEmptyTimeSones.isEmpty()){
//            for(String link:linksToNonEmptyTimeSones){
//                driver.get(link);
//                zonesWebElem = driver.findElements(By.cssSelector("table#table-zones td:nth-child(3) input[type=hidden]"));
//                Assert.assertEquals("Time zones list is not sorted alphabetically",
//                isSorted(zonesWebElem, "value"), true);
//
//            }
//        }
    }

    @Test
    public void GeoZonesSortingTest(){
//        login();
//        driver.get("http://localhost/litecart/admin/?app=geo_zones&doc=geo_zones");
//        List<WebElement> countriesList = driver.findElements(By.cssSelector("table.dataTable tr.row"));
//        //Compose the list of links to countiry details page
//        List<String> linksToGeoZones = new LinkedList<>();
//        String zoneLink = "";
//        for(WebElement elem:countriesList){
//            zoneLink = elem.findElement(By.cssSelector("tr td:nth-child(3)")).getAttribute("textContent");
//            if(zoneLink.compareToIgnoreCase("0") != 0){
//                linksToGeoZones.add(elem.findElement(By.cssSelector("td:nth-child(3) a"))
//                        .getAttribute("href"));
//            }
//        }
//        //Compose list of zones and check if it is sorted
//        List<WebElement> zonesWebElem;
//        if (!linksToGeoZones.isEmpty()){
//            for(String link:linksToGeoZones){
//                driver.get(link);
//                zonesWebElem = driver.findElements(By
//                        .cssSelector("table#table-zones td:nth-child(3) option[selected=selected]"));
//                Assert.assertEquals("Geo zones list is not sorted alphabetically",
//                        isSorted(zonesWebElem, "textContent"), true);
//
//            }
//        }

    }

//Creates a list of strings from a list of web elements by getting a value from passed attribute
//    private boolean isSorted(List<WebElement> webElems, String attribute) {
//        Iterator<WebElement> iter = webElems.iterator();
//        while(iter.hasNext()){
//            String prevStringItem
//                    = iter.next().getAttribute(attribute);
//            if(iter.hasNext()){
//                String nextStringItem = iter.next().getAttribute(attribute);
//                System.out.println("Prev value "+ prevStringItem + " is compared to next value " + nextStringItem);
//                if(prevStringItem.compareToIgnoreCase(nextStringItem) >= 0 ){
//                    System.out.println("Value "+ prevStringItem + " goes before value " + nextStringItem);
//                    return false;
//                }
//            }else{
//                return true;
//            }
//        }
//        return true;
//    }
}
