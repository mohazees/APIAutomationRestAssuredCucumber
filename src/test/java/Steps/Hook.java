package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.restassured.RestAssured;


public class Hook extends BaseUtil
{
    private BaseUtil base;

    public Hook(BaseUtil base)
    {
        this.base = base;
    }

    @Before("@FirstRestAPITests")
    public void FirstSetup()
    {
        System.out.println("Before test");
        RestAssured.baseURI = "www.gmail.com";
        RestAssured.port = 443;

        //Store the values for further use in the step definitions
        base.BaseUri = RestAssured.baseURI;
    }

    @After
    public void AfterRunningAPItest()
    {
        System.out.println("After API test");
        RestAssured.reset();
    }
}
