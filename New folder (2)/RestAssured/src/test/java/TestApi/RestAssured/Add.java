package TestApi.RestAssured;

import static io.restassured.RestAssured.*;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;


public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		baseURI="https://reqres.in/api";
		
		 given().get("/users?page=2")
		.then()
		.assertThat()
		.statusCode(200);
		//.body("data[4].first_name", equals("George"));
		
		
			
				
				
		
		
	}

	

}
