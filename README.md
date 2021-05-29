# My responses

* The tests can be executed from either of the following:

1. Terminal using "mvn test" (from project directory)
2. Running src/test/resources/testng.xml (context menu -> Run) in IDE
3. By clicking on play button next to tests/classes in IDE

* Frontend:

1. Please see tests in frontend folder - some tests fail due to the issues found
2. I would use a docker image of the service and run the tests against it. The dependecies would be covered either by docker images if available or would be mocked

* Backend:

1. Please see tests in backend folder - requests and responses are currentry being logged for clarity but this can be removed
2. I would use a docker image of the service and run the tests against it. The dependecies would be covered either by docker images if available or would be mocked
3. I would ask for the exact response body model, any expected values, clarification on what should happen in case the post code is empty or when the request body is random/empty. Currently, the error messages are incorrect and invalid postcode status code is wrong which is reflected in failing tests
