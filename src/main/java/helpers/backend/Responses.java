package helpers.backend;

import io.restassured.response.Response;
import org.testng.Assert;

public class Responses {

    public static void validateResponse(Response response)
    {
        response.then().log().all();
        ResponseBody responseBody = response.then().statusCode(200).extract().as(ResponseBody.class);
        Assert.assertEquals(responseBody.getTimezone(), "Europe/London");
    }

    public static void validateErrorResponse(Response response, String errorMessage)
    {
        response.then().log().all();
        ErrorBody errorBody = response.then().statusCode(433).extract().as(ErrorBody.class);
        Assert.assertEquals(errorBody.getErrorMessage(), errorMessage);
    }
}
