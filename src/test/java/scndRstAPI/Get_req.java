package scndRstAPI;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasXPath;
import org.testng.annotations.Test;
public class Get_req {
	@Test
	public void get_req() {
	
		given().when().get("http://ergast.com/api/f1/2008/1").then().body(hasXPath("/MRData/RaceTable/Race/@season",containsString("2008")));
//		.statusCode(200).statusLine("HTTP/1.1 200 OK")
	//	.assertThat().header("Content-Type", "application/xml; charset=utf-8").log().all();
		
	}
}
