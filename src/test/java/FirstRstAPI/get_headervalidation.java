package FirstRstAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class get_headervalidation {
	@Test
	void headrs() {
		RestAssured.baseURI="http://ergast.com/api/f1/";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET,"2008");
	String test =res.getBody().asPrettyString();
	System.out.println(test);
	
	
	
	// capture details of header
	String powrdby = res.header("X-Powered-By");
	System.out.println(powrdby);
	Assert.assertEquals(powrdby, "PHP/5.4.16");
	
	String cntnt = res.header("Content-Type");
	System.out.println(cntnt);
	Assert.assertEquals(cntnt, "application/xml; charset=utf-8");
	
	
	}

}
