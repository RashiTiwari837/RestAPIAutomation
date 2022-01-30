package FirstRstAPI;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class pstreq {
	@Test
void postusercreation() {
		RestAssured.baseURI = "https://reqres.in/api";
		RequestSpecification res = RestAssured.given();
		
		//Response obj,  request payload along with post request
		JSONObject reqparams = new JSONObject(); 
		reqparams.put("name", "test");
		reqparams.put("job", "qa");
		res.header("Content-Type","application/json");
		res.body(reqparams.toJSONString());
		// response obj
		
		Response response = res.request(Method.POST,"/users"); 
		String resbdy=response.getBody().asString();
		System.out.println(resbdy);
		int code =response.getStatusCode();
		System.out.println(code);
		Assert.assertEquals(201,code );
	String successcode=	response.jsonPath().get("id");
	System.out.println(successcode);
	
		
		
		
		
		
		
		
	}

}
