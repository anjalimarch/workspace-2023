package TestApi.RestAssured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;


public class basicsApiTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Validate the get api

		// given- query parameter will go inside this method 
		// when- resource and http method inside this 
		// then

		RestAssured.baseURI = "https://www.rahulshettyacademy.com";
		given().log().all().
		queryParam("key", "qaclick123").
		header("Content-Type", "application/json").
		body("{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"anjalimishra adding new values\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}").
		when().
		post("maps/api/place/add/json")
		.then().log().all().
		assertThat().statusCode(200)
		.header("server","Apache/2.4.41 (Ubuntu)");

	}
	
	/*
	 * @Test public void f() {
	 * 
	 * 
	 * Response res=get("https://reqres.in/api/users/2");
	 * 
	 * System.out.println("response from api--"+res.getStatusCode());
	 * 
	 * System.out.println("response form api---"+res.getTime());
	 * System.out.println("respinse from api--"+res.contentType());
	 * System.out.println("header -- "+res.getHeader("content-type"));
	 * 
	 * Assert.assertEquals(200, res.getStatusCode());
	 * 
	 * 
	 * }
	 */
	
	 
	

}
