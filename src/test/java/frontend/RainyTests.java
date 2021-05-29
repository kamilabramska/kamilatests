package frontend;

import helpers.frontend.BrowserResults;
import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import static config.Constants.ErrorMessages.INVALID_MESSAGE;
import static config.Constants.ErrorMessages.NOT_FOUND_MESSAGE;
import static config.Constants.Stubs.INVALID_PC;
import static config.Constants.Stubs.NOT_FOUND_PC;

public class RainyTests extends Base {

    @Test
    public void getErrorForInvalidPostCode()
    {
        String errorMessage = BrowserResults.getError(driver, INVALID_PC);
        Assert.assertEquals(errorMessage, INVALID_MESSAGE);
    }

    @Test
    public void getErrorForNotFoundPostCode()
    {
        String errorMessage = BrowserResults.getError(driver, NOT_FOUND_PC);
        Assert.assertEquals(errorMessage, NOT_FOUND_MESSAGE);
    }
}
