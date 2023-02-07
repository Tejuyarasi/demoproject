package charger;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getallchargestation {
	@Test (priority=1)
	public void valid() {
		String url ="https://dev.api.atomzpower.com/api/v1/charger/get/all/chargestation";
		String contentType="application/json";
		String bodyData="{\r\n"
				+ "    \"mobileNumber\":\"6301012066\",\r\n"
				+ "    \"updateObject\":{\r\n"
				+ "        \"fname\":\"Teja\",\r\n"
				+ "        \"lname\":\"K\",\r\n"
				+ "        \"email\":\"thejaswini+01@navadhiti.com\"\r\n"
				+ "    }\r\n"
				+ "}";
		
		
		
		Response response = RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzRlOGYwZjQwY2QzMzg1MDRlZTg2MmQiLCJtb2JpbGVOdW1iZXIiOiI4ODkyNjAwNjMxIiwiZW1haWwiOiJoYXJpLmsrMjBAbmF2YWRoaXRpLmNvbSIsImRldmljZVR5cGUiOiIiLCJhZGRyZXNzIjpbXSwiY3JlYXRlZEF0IjoiMjAyMi0xMC0xOFQxMTozMzozNS43ODhaIiwiY3JlYXRlZEJ5IjoiIiwidXBkYXRlZEF0IjoiMjAyMi0xMC0xOFQxMTozMzozNS43ODhaIiwidXBkYXRlZEJ5IjoiIiwiX192IjowLCJmbmFtZSI6IkhhcmkiLCJsbmFtZSI6IksifSwiaWF0IjoxNjY2MjU3MjczLCJleHAiOjE2Njg4NDkyNzN9.xwIjkq_rtW0jS8FBG2JYxM-FWKimLlFkLXbpRGdMS3M")
				.contentType(contentType)
				.body(bodyData)
				.when()
				.get(url)
				.then()
				.extract()
				.response();
		
		
		String responsebody = (response.getBody().asString());	   //body
		System.out.println("valid response body is " +responsebody);
		int status = response.getStatusCode();                      //statuscode
		System.out.println("valid status is"+status);
		
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 200);
	
	}
	@Test (priority=2)
	public void invalid_Methodname() {
		String url ="https://dev.api.atomzpower.com/api/v1/charger/get/all/chargestation";
		String contentType="application/json";
		String bodyData="{\r\n"
				+ "    \"mobileNumber\":\"6301012066\",\r\n"
				+ "    \"updateObject\":{\r\n"
				+ "        \"fname\":\"Teja\",\r\n"
				+ "        \"lname\":\"K\",\r\n"
				+ "        \"email\":\"thejaswini+01@navadhiti.com\"\r\n"
				+ "    }\r\n"
				+ "}";
		
		
		
		
		Response response = RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzRlOGYwZjQwY2QzMzg1MDRlZTg2MmQiLCJtb2JpbGVOdW1iZXIiOiI4ODkyNjAwNjMxIiwiZW1haWwiOiJoYXJpLmsrMjBAbmF2YWRoaXRpLmNvbSIsImRldmljZVR5cGUiOiIiLCJhZGRyZXNzIjpbXSwiY3JlYXRlZEF0IjoiMjAyMi0xMC0xOFQxMTozMzozNS43ODhaIiwiY3JlYXRlZEJ5IjoiIiwidXBkYXRlZEF0IjoiMjAyMi0xMC0xOFQxMTozMzozNS43ODhaIiwidXBkYXRlZEJ5IjoiIiwiX192IjowLCJmbmFtZSI6IkhhcmkiLCJsbmFtZSI6IksifSwiaWF0IjoxNjY2MjU3MjczLCJleHAiOjE2Njg4NDkyNzN9.xwIjkq_rtW0jS8FBG2JYxM-FWKimLlFkLXbpRGdMS3M")
				.contentType(contentType)
				.body(bodyData)
				.when()
				.put(url)
				.then()
				.extract()
				.response();
		
		
		String responsebody = (response.getBody().asString());	   //body
		System.out.println("invalid_Methodname response body is " +responsebody);
		int status = response.getStatusCode();                      //statuscode
		System.out.println("invalid_Methodname status is"+status);
		
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 404);
	
	}
@Test (priority=3)
public void invalid_uri() {
	String url ="https://dev.api.atomzpower.com/api/v1/charger/get/all/chargestation";
	String contentType="application/json";
	String bodyData="{\r\n"
			+ "    \"mobileNumber\":\"6301012066\",\r\n"
			+ "    \"updateObject\":{\r\n"
			+ "        \"fname\":\"Teja\",\r\n"
			+ "        \"lname\":\"K\",\r\n"
			+ "        \"email\":\"thejaswini+01@navadhiti.com\"\r\n"
			+ "    }\r\n"
			+ "}";
	
	
	
	
	Response response = RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzRlOGYwZjQwY2QzMzg1MDRlZTg2MmQiLCJtb2JpbGVOdW1iZXIiOiI4ODkyNjAwNjMxIiwiZW1haWwiOiJoYXJpLmsrMjBAbmF2YWRoaXRpLmNvbSIsImRldmljZVR5cGUiOiIiLCJhZGRyZXNzIjpbXSwiY3JlYXRlZEF0IjoiMjAyMi0xMC0xOFQxMTozMzozNS43ODhaIiwiY3JlYXRlZEJ5IjoiIiwidXBkYXRlZEF0IjoiMjAyMi0xMC0xOFQxMTozMzozNS43ODhaIiwidXBkYXRlZEJ5IjoiIiwiX192IjowLCJmbmFtZSI6IkhhcmkiLCJsbmFtZSI6IksifSwiaWF0IjoxNjY2MjU3MjczLCJleHAiOjE2Njg4NDkyNzN9.xwIjkq_rtW0jS8FBG2JYxM-FWKimLlFkLXbpRGdMS3M")
			.contentType(contentType)
			.body(bodyData)
			.when()
			.get(url)
			.then()
			.extract()
			.response();
	
	
	String responsebody = (response.getBody().asString());	   //body
	System.out.println("invalid_uri response body is " +responsebody);
	int status = response.getStatusCode();                      //statuscode
	System.out.println("invalid_uri status is"+status);
	
	
	int statuscode = response.getStatusCode();
	System.out.println(statuscode);
	Assert.assertEquals(statuscode, 404);

}



@Test (priority=6,enabled=false)

public void no_uri() {
	//String url ="https://dev.api.atomzpower.com/api/v1/user/getVehicle";
	String contentType="application/json";
	String bodyData="{\r\n"
			+ "    \"mobileNumber\":\"6301012066\",\r\n"
			+ "    \"updateObject\":{\r\n"
			+ "        \"fname\":\"Teja\",\r\n"
			+ "        \"lname\":\"K\",\r\n"
			+ "        \"email\":\"thejaswini+01@navadhiti.com\"\r\n"
			+ "    }\r\n"
			+ "}";
	
	
	
	
	Response response = RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzRlOGYwZjQwY2QzMzg1MDRlZTg2MmQiLCJtb2JpbGVOdW1iZXIiOiI4ODkyNjAwNjMxIiwiZW1haWwiOiJoYXJpLmsrMjBAbmF2YWRoaXRpLmNvbSIsImRldmljZVR5cGUiOiIiLCJhZGRyZXNzIjpbXSwiY3JlYXRlZEF0IjoiMjAyMi0xMC0xOFQxMTozMzozNS43ODhaIiwiY3JlYXRlZEJ5IjoiIiwidXBkYXRlZEF0IjoiMjAyMi0xMC0xOFQxMTozMzozNS43ODhaIiwidXBkYXRlZEJ5IjoiIiwiX192IjowLCJmbmFtZSI6IkhhcmkiLCJsbmFtZSI6IksifSwiaWF0IjoxNjY2MjU3MjczLCJleHAiOjE2Njg4NDkyNzN9.xwIjkq_rtW0jS8FBG2JYxM-FWKimLlFkLXbpRGdMS3M")
			.contentType(contentType)
			.body(bodyData)
			.when()
			.post()
			.then()
			.extract()
			.response();
	
	
	String responsebody = (response.getBody().asString());	   //body
	System.out.println("no_uri response body is " +responsebody);
	int status = response.getStatusCode();                      //statuscode
	System.out.println("no_uri status is"+status);
	
	int statuscode = response.getStatusCode();
	System.out.println(statuscode);
	Assert.assertEquals(statuscode, 200);

}

@Test (priority=7)
public void no_token() {
	String url ="https://dev.api.atomzpower.com/api/v1/charger/get/all/chargestation";
	String contentType="application/json";
	String bodyData="{\r\n"
			+ "    \"mobileNumber\":\"6301012066\",\r\n"
			+ "    \"updateObject\":{\r\n"
			+ "        \"fname\":\"Teja\",\r\n"
			+ "        \"lname\":\"K\",\r\n"
			+ "        \"email\":\"thejaswini+01@navadhiti.com\"\r\n"
			+ "    }\r\n"
			+ "}";
	
	
	
	
	Response response = RestAssured.given()
			.contentType(contentType)
			.body(bodyData)
			.when()
			.get(url)
			.then()
			.extract()
			.response();
	
	
	String responsebody = (response.getBody().asString());	   //body
	System.out.println("no_token response body is " +responsebody);
	int status = response.getStatusCode();                      //statuscode
	System.out.println("no_token status is"+status);
	
	
	int statuscode = response.getStatusCode();
	System.out.println(statuscode);
	Assert.assertEquals(statuscode, 200);


	}

	 	
}

