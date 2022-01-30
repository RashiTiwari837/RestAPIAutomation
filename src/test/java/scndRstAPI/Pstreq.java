package scndRstAPI;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import io.restassured.RestAssured;

public class Pstreq {
	public static HashMap map = new HashMap();

	@BeforeClass
	public void postdata() {
		map.put("name", RestUtils.getusername());
		map.put("job", RestUtils.getjob());
		RestAssured.baseURI="https://reqres.in/api";
		RestAssured.basePath="/users";
		
	}
	@Test
	public void data() {
		given()
		.contentType("application/json").body(map)
		.when().post()
		.then().assertThat().statusCode(201);
		
	}
}
