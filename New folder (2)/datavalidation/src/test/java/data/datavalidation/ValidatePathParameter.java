package data.datavalidation;

import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ValidatePathParameter {
	@Test
	public void passPathParam() {

		baseURI = "https://reqres.in/";

		// https://reqres.in/api/users?page=2

		given().pathParam("path", "users").queryParam("page", "2").

				when().get("/api/{path}").

				then().log().all().assertThat().statusCode(200);

	};

	@Test
	public void testCookiesOfAPI() {
		
		///getting header values -- 
		baseURI = "https://www.google.com";

		given()

				.when().get("/")

				.then().cookie("AEC")
				.header("Content-Encoding", "gzip")
				.and()
				.header("Server","gws")
				.log().all().assertThat().statusCode(200);

	}

	@Test

	public void getCookieInfo() {
		
		//getting all the cookies info 

		// baseURI="https://www.google.com";
		Response res = given().when().get("https://www.google.com");
		
		
		String response =res.cookie("AEC");
		
		Map <String, String >data=res.getCookies();
		
		
			System.out.println(data.keySet());
			
			Set s=data.keySet();
			
			/*
			 * Iterator i=s.iterator();
			 * 
			 * while(i.hasNext()) {
			 * 
			 * 
			 * 
			 * System.out.println( "keys "+i.next());
			 * 
			 * 
			 * 
			 * 
			 * };
			 */
			
			
			for(String values:data.keySet()) {
						
				String value = res.getCookie(values);
				
				System.out.println(values+"--"+value);
				
				
			}
			
			//getting header values 
			
		System.out.println(	"value of header info "+res.getHeader("Content-Type"));
		
				
		Headers headervals=res.getHeaders();
		int i;
	   List h=	headervals.asList();
	   int len= h.size();
	
	

		for(i=0;i<len;i++) {
	
			System.out.println("headers:"+h.get(i));
	    
	   
          			
		}
	

	}

}
