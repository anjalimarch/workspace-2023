package data.datavalidation;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class ValidateTest {
	
	
	
	@Test(priority=1)
	
	public void createData() {
		HashMap data= new HashMap();
		
		String courses[]= {"p","c"};
		
		data.put("name", "AnjaliMishra");
		data.put("job","Chota resource");
		data.put("courses", courses);
		
		  baseURI= "https://reqres.in/";
		  
		  given().log().all().header("Conten-Type", "application/json")
		      .body(data)
		  
		  .when().
		      post("api/users")
		  .then().
		      assertThat()
		  .statusCode(200)
		  .body("courses[0]", equalTo("p"));
	}
	
  @Test(priority=2)
  public void verifyIngtheJsonRequest() {
	  
	  //org.json body 
	  
	  JSONObject data = new JSONObject();
	  
	  String courses[]= {"p","c"};
		
		data.put("name", "AnjaliMishra");
		data.put("job","Chota resource");
		data.put("courses", courses);
		
		given().
		   header("Content-Type","application/json").
		   body(data.toString()).
		  
		when().
		   post("api/users").
		
		then().
		  assertThat()
		  .statusCode(200)
		  .body("courses[1]",equalTo("c"));
		
	  
	  
	
	  
  }
  
  
  
  @Test(priority=3)
  
  public void addObjectPojo() {
	  
	  //pojo (Plain Old Java Object)
	  
	  Pojo_PostRequest p= new Pojo_PostRequest();
	  String courses[]= {"p","c"};
	  p.setName("scott");
	  p.setJob("Leader");
	  p.setCourses(courses);
	  
	  
	  given().
        header("Content-Type","application/json")
        .body(p).
	  
	  when().post("api/users").
	  
	  
	  then().
	  
	  assertThat()
	  .statusCode(200)
	  .body("",equalTo("23"));
	  
	  
	  
	  
  }
  
  
  
  @Test
  public void usingExternalJson() throws FileNotFoundException {
	  
	  File f= new File(".\\body.json");
	  FileReader fr = new FileReader(f);
	  JSONTokener jt= new JSONTokener(fr);
	  JSONObject data = new JSONObject(jt); 
	  
	  given().
      header("Content-Type","application/json")
      .body(data).
	  
	  when().post("api/users").
	  
	  
	  then().
	  
	  assertThat()
	  .statusCode(200)
	  .body("",equalTo("23"));
	  
	  
	  
  }
}
