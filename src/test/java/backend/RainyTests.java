package backend;

import helpers.backend.RequestBody;
import helpers.backend.Requests;
import helpers.backend.Responses;

import org.testng.annotations.Test;

import static config.Constants.ErrorMessages.INVALID_MESSAGE;
import static config.Constants.ErrorMessages.NOT_FOUND_MESSAGE;
import static config.Constants.Stubs.EMPTY_PC;
import static config.Constants.Stubs.INVALID_PC;
import static config.Constants.Stubs.NOT_FOUND_PC;


public class RainyTests {

    String postCode;

    @Test
    public void getErrorForEmptyPostCode ()

    {
        Responses.validateErrorResponse(Requests.postRequest(new RequestBody(EMPTY_PC)), INVALID_MESSAGE);
    }

    @Test
    public void getErrorForInvalidPostCode ()

    {
        Responses.validateErrorResponse(Requests.postRequest(new RequestBody(INVALID_PC)), INVALID_MESSAGE);
    }

    @Test
    public void getErrorForNotFoundPostCode ()

    {
        Responses.validateErrorResponse(Requests.postRequest(new RequestBody(NOT_FOUND_PC)), NOT_FOUND_MESSAGE);
    }
}
