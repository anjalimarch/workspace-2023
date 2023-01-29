package data.datavalidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class RestAssuredTest {

	
	  @Test
	  
	  public void setup() {
	  
	  baseURI="https://reqres.in/api";
	  
	  given().get("/users?page=2") .then() .assertThat() .statusCode(200);
	 // .body(null, null);
	  
	  
	  
	  }
	 

	
	  @Test public void dataValidatePost() {
	  
	  baseURI="https://rahulshettyacademy.com/";
	  
	  given().log().all(). queryParam("Key", "qaclick123").
	  header("Content-Type","application/json"). body("{\n" + "  \"location\": {\n"
	  + "    \"lat\": -38.383494,\n" + "    \"lng\": 33.427362\n" + "  },\n" +
	  "  \"accuracy\": 50,\n" +
	  "  \"name\": \"anjaliMEnthusiastic adding values\",\n" +
	  "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
	  "  \"address\": \"29, side layout, cohen 09\",\n" + "  \"types\": [\n" +
	  "    \"shoe park\",\n" + "    \"shop\"\n" + "  ],\n" +
	  "  \"website\": \"http://google.com\",\n" + "  \"language\": \"French-IN\"\n"
	  + "}"). when() .post("maps/api/place/add/json"). then().log().all().
	  assertThat().statusCode(200);
	  
	  
	  
	  }
	 

	
	  @Test 
	  public void getData() {
	  
	  baseURI="https://rahulshettyacademy.com/";
	  
	  given().log().all(). param("key", "qaclick123"). param("place_id",
	  "2148822f1fb44783c1e9397c4efa04d5") .when().log().all().
	  get("/maps/api/place/get/json"). then().log().all(). assertThat().
	  statusCode(200);
	  
	  
	  
	  
	  }
	 

	
	  @Test public void updateData() {
	  
	  baseURI="https://rahulshettyacademy.com/";
	  
	  given().log().all() .param("place_id", "2148822f1fb44783c1e9397c4efa04d5")
	  .header("Content-Type","application/json").
	  
	  body("{\n" + "\"place_id\":\"2148822f1fb44783c1e9397c4efa04d5\",\n" +
	  "\"address\":\"70 test Job PolandTestEngineer, USA\",\n" +
	  "\"key\":\"qaclick123\"\n" + "\n" + "\n" + "}") .when().log().all()
	  .put("maps/api/place/update/json") .then().log().all() .assertThat()
	  .statusCode(200);
	  
	  
	  
	  
	  
	  
	  
	  }
	  
	 
	@Test

	public void deleteDataForApi() {

		baseURI = "https://rahulshettyacademy.com/";

		given().log().all().param("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\n" + "\n" + " \"place_id\": \"31505b619eb8768360a09f5ec9fd8a70\"\n" + "\n" + "\n" + "}").when()
				.log().all().delete("maps/api/place/delete/json").then().log().all().assertThat().statusCode(200);

	}

}
