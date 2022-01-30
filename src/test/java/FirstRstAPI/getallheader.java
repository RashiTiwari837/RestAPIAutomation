package FirstRstAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getallheader {
	@Test
	void headrs() {
		RestAssured.baseURI="http://ergast.com/api/f1/";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET,"2008");
	String test =res.getBody().asPrettyString();
	System.out.println(test);
	Headers all = res.headers();
	for( Header allhd : all) {
		System.out.println(allhd.getName()+" "+allhd.getValue());
	}
	
	
	
	
	
	
}
}