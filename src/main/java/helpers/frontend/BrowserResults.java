package helpers.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static config.Constants.Ids.RESULT_TABLE;
import static config.Constants.Ids.SEARCH_BUTTON;
import static config.Constants.Ids.SEARCH_INPUT;

public class BrowserResults {

    public static HashMap getResults (WebDriver driver, String postCode)
    {
        HashMap<String, List<String>> results = new HashMap();

        driver.findElement(By.name(SEARCH_INPUT)).clear();
        driver.findElement(By.name(SEARCH_INPUT)).sendKeys(postCode);
        driver.findElement(By.className(SEARCH_BUTTON)).click();
        List<String> keys = new ArrayList<String>();
        List<String> values = new ArrayList<String>();
        List<WebElement> resultList = driver.findElements(By.xpath(RESULT_TABLE));
        Assert.assertTrue(resultList.size() > 0);
        for (int i = 0; i < resultList.size(); i++)
        {
            keys.add(i, resultList.get(i).findElement(By.tagName("th")).getText());
            values.add(i, resultList.get(i).findElement(By.tagName("td")).getText());
        }

        results.put("keys", keys);
        results.put("values", values);
        return results;
    }

    public static String getError (WebDriver driver, String postCode)
    {
        driver.findElement(By.name(SEARCH_INPUT)).clear();
        driver.findElement(By.name(SEARCH_INPUT)).sendKeys(postCode);
        driver.findElement(By.className(SEARCH_BUTTON)).click();

        driver.findElements(By.xpath(RESULT_TABLE));

        return driver.findElement(By.tagName("h1")).getText();
    }
}
