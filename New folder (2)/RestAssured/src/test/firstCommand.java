package TestApi.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class firstCommand {
  @Test
  public void f() {
	  
	  RestAssured.get("https://reqres.in/api/users?page=2");
	  
  }
}
