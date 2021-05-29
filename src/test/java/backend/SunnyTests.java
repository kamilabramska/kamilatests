package backend;

import helpers.RequestBody;
import helpers.Requests;
import helpers.Responses;
import org.testng.annotations.Test;

public class SunnyTests {

    String postCode;

    @Test
    public void validPostCode ()

    {
        postCode = "W6 0NW";
        Responses.validateResponse(Requests.postRequest(new RequestBody(postCode)));
    }
}
