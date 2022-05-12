package Tutorial1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getDemo3 {

	public static void main(String[] args) {
		
		RestAssured.baseURI="http://localhost:3000/posts/3";
		
		RequestSpecification httpRequest=RestAssured.given();

		Response resp =httpRequest.get();
		
		System.out.println(resp.getStatusCode());
		
		System.out.println(resp.getStatusLine());
		
		System.out.println(resp.getBody().asString());
		
		
		
		
		
	}

}
