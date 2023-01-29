package data.datavalidation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class ValidateResponseData {
  @Test(priority=1)
  public void validateStoreApi() {
	  
	  //parsing json data 
	  baseURI= "https://rahulshettyacademy.com/";
	  
	  given().log().all()
	    .param("key", "qaclick123")
	    .param("place_id","7d361391820817e7b8ef03e25c79605f")
	  
	   
	 
	  .when().log().all()
	  
	    .get("/maps/api/place/get/json")
	  .then().log().all()
	  .statusCode(200)
	  .assertThat()
	  .statusCode(200)
	  .body("location.longitude",equalTo("33.427362"));
	  
	  
	  
  }
}
