package frontend;

import config.Constants;
import helpers.frontend.BrowserResults;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static config.Constants.Ids.*;
import static config.Constants.Stubs.VALID_PC;

public class SunnyTests extends Base {

    @Test
    public void checkInitialElements()
    {
        Assert.assertTrue(driver.findElement(By.className(HEADER)).isDisplayed());
        Assert.assertEquals(driver.findElement(By.className(HEADER)).getText(), "Weather Checker");
        Assert.assertTrue(driver.findElement(By.name(SEARCH_INPUT)).isDisplayed());
        Assert.assertTrue(driver.findElement(By.className(SEARCH_BUTTON)).isDisplayed());

    }

    @Test
    public void enterValidPostCodeAndCheckTimeTemperatureHumidity()
    {
        HashMap<String, List<String>> results = BrowserResults.getResults(driver, VALID_PC);

        Assert.assertTrue(results.get("keys").contains("Time:"));
        Assert.assertTrue(results.get("keys").contains("Temperature:"));
        Assert.assertTrue(results.get("keys").contains("Humidity:"));
    }

    @Test
    public void enterValidPostCodeAndCheckNonEmptyValues()
    {
        HashMap<String, List<String>> results = BrowserResults.getResults(driver, VALID_PC);

        for (int i = 0; i < results.get("values").size(); i++)
        {
            Assert.assertTrue(StringUtils.isNotBlank(results.get("values").get(i)));
        }
    }
}
