package Steps;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class FirstAPITestSteps {

    private BaseUtil base;
    private String baseUri;
    private RequestSpecification request;
    private Response response;
    private ValidatableResponse json;

    public FirstAPITestSteps(BaseUtil base)
    {
        this.base = base;
        this.baseUri = base.BaseUri;
    }

    @And("^I have an endpoint \"([^\"]*)\"$")
    public void iHaveAnEndpoint(String arg0)
    {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In endpoint step");
        System.out.println(base.BaseUri);

        baseURI = "https://api.github.com/repos/eugenp/tutorials";

        request = given();
        response = request.when().get();

        json = response.then().contentType(ContentType.JSON);

    }

    @Given("^as an authenticated \"([^\"]*)\" API user$")
    public void asAnAuthenticatedAPIUser(String arg0)
    {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In auth");


    }
}
