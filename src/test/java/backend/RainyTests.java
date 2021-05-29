package backend;

import helpers.RequestBody;
import helpers.Requests;
import helpers.Responses;

import org.testng.annotations.Test;


public class RainyTests {

    String postCode;

    @Test
    public void emptyPostCode ()

    {
        postCode = "";
        Responses.validateErrorResponse(Requests.postRequest(new RequestBody(postCode)), "Postcode not valid.");
    }

    @Test
    public void invalidPostCode ()

    {
        postCode = "EC1A 1BB";
        Responses.validateErrorResponse(Requests.postRequest(new RequestBody(postCode)), "Postcode not valid.");
    }

    @Test
    public void notFoundPostCode ()

    {
        postCode = "B99 9AA";
        Responses.validateErrorResponse(Requests.postRequest(new RequestBody(postCode)),"Postcode not found!");
    }
}
