package data.datavalidation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class DummyRequestTest {
	
	int id;

	/*
	 * @Test public void getUsers() {
	 * 
	 * 
	 * baseURI= "https://reqres.in/";
	 * 
	 * given().log().all() .param("page", "2") .header("Content-Type",
	 * "application/json") .when().log().all() .get("api/users") .then().log().all()
	 * .assertThat() .statusCode(200) .body("page", equalTo(2));
	 * 
	 * }
	 * 
	 * 
	 * @Test public void createUsers() { baseURI= "https://reqres.in/";
	 * 
	 * given().log().all()
	 * 
	 * .header("Content-Type", "application/json") .body("{\n" +
	 * "    \"name\": \"Anjali\",\n" + "    \"job\": \"Mishra\"\n" + "}")
	 * .when().log().all() .post("api/users") .then().log().all() .assertThat()
	 * .statusCode(201);
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @Test public void updateUsers() { baseURI= "https://reqres.in/";
	 * 
	 * given().log().all()
	 * 
	 * 
	 * .header("Content-Type", "application/json") .body("{\n" +
	 * "    \"name\": \"Anjali\",\n" + "    \"job\": \"Mishra SdetRole\"\n" + "}")
	 * .when().log().all() .put("api/users/2") .then().log().all() .assertThat()
	 * .statusCode(200);
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * @Test public void patchUsers() { baseURI= "https://reqres.in/";
	 * 
	 * given().log().all()
	 * 
	 * 
	 * .header("Content-Type", "application/json") .body("{\n" +
	 * "    \"name\": \"Anjali\",\n" +
	 * "    \"job\": \"Mishra SdetRole Finally Healing kept a patch\"\n" + "}")
	 * .when().log().all() .patch("api/users/2") .then().log().all() .assertThat()
	 * .statusCode(200);
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * @Test public void deleteUsers() { baseURI= "https://reqres.in/";
	 * 
	 * given().log().all()
	 * 
	 * 
	 * .header("Content-Type", "application/json") .body("{\n" +
	 * "    \"name\": \"Anjali\",\n" +
	 * "    \"job\": \"Mishra SdetRole Finally Healing\"\n" + "}")
	 * .when().log().all() .delete("api/users/2") .then().log().all() .assertThat()
	 * .statusCode(204);
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 */
  @Test(priority=1)
  
  public void createAndUpdateUser() {
	  
	  baseURI= "https://reqres.in/";
	  
	  //posting and fetching id 
	  
	  id=given().log().all()
	     .header("Content-Type", "application/json")
	     .body("{\n"
	     		+ "    \"name\": \"Rudransh Pyara\",\n"
	     		+ "    \"job\": \"Tripathi\"\n"
	     		+ "}")
	  
	  .when().log().all()
	  .post("api/users")
	   .jsonPath()
	   .getInt("id");
	   
	   System.out.println("Id captured from the request posted"+id);
	   
	  
	  
	 
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  @Test(priority=2)
  
  public void updateUserwithID() {
	  
	  
 // put updating the response in the api
	  
	  baseURI= "https://reqres.in/";
	  given()
	    .header("Content-Type","application/json")
	    
	    .body("{\n"
	    		+ "    \"name\": \"pochu\",\n"
	    		+ "    \"job\": \"mishraleader\"\n"
	    		+ "}")
	    .when().log().all()
	    .put("api/users/"+id)
	    .then()
	    .log().all();
	  
	  
	  
	  
  }
  
  
  
 
  
  
  
  
  
  
  
}
