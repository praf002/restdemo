package Tutorial1;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class getDemo5 {

	public static void main(String[] args) {

		RestAssured.baseURI="http://localhost:3000";
		
		given().get("/posts/3")
		
		.then().assertThat().statusCode(200).statusLine("HTTP/1.1 200 OK").log().all();
		

	}

}
