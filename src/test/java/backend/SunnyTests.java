package backend;

import helpers.backend.RequestBody;
import helpers.backend.Requests;
import helpers.backend.Responses;
import org.testng.annotations.Test;

import static config.Constants.Stubs.VALID_PC;

public class SunnyTests {

    @Test
    public void enterValidPostCodeAndCheckStatusCodeAndBodyModel ()

    {
        Responses.validateResponse(Requests.postRequest(new RequestBody(VALID_PC)));
    }
}
