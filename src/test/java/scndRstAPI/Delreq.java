package scndRstAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class Delreq {
	@Test
public void del() {
	RestAssured.baseURI="https://reqres.in/api";
	RestAssured.basePath="/de";
	given().when().then();
	
}
}
