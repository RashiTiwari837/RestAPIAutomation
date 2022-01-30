package FirstRstAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class jsnresponse_body_verification {
	@Test
	void resp_body() {
		RestAssured.baseURI="https://reqres.in/api/";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET,"users?page=2");
		String ans = res.getBody().asString();
		System.out.println(ans);
		
		
	}

}
