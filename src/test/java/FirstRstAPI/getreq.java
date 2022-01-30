package FirstRstAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class getreq {
	@Test
void getweatherdetails() {
	    RestAssured.baseURI="http://ergast.com/api/f1/";
		//request object
		RequestSpecification httpreq = RestAssured.given();
		//response obj
		Response res = httpreq.request(Method.GET,"2008");
		// Print responsein consol
		String resbody =res.getBody().asString();
		System.out.println("Res body is"+resbody);
		
		// status code validation
		int statuscode = res.getStatusCode();
		System.out.println("Status code is"+statuscode);
		Assert.assertEquals(statuscode, 200);
		
		String statuslne=res.getStatusLine();
		System.out.println(statuslne);
		Assert.assertEquals(statuslne, "HTTP/1.1 200 OK");
		
	}

}
