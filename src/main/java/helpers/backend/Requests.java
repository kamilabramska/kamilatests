package helpers.backend;

import config.Constants;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Requests {

    public static Response postRequest(Object body)
    {
        return RestAssured.given().log().all().contentType(ContentType.JSON).body(body).post(Constants.Endpoints.API_URL);
    }
}
