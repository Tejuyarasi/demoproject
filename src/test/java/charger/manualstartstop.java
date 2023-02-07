package charger;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class manualstartstop {

	@Test (priority=1)
	public void valid() {
		String url ="https://dev.api.atomzpower.com/api/v1/charger/manual/stop/session";
		String contentType="application/json";
		String bodyData="{\n"
				+ "    \"deviceId\":\"phzm91\"\n"
				+ "}";
		Response response = RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzY4ZDlhOGUyMWNlNmZlN2RkYzVkOWMiLCJtb2JpbGVOdW1iZXIiOiI2MzAxMDEyMDY2IiwiZW1haWwiOiJ0aGVqYXN3aW5pKzAxQG5hdmFkaGl0aS5jb20iLCJkZXZpY2VUeXBlIjoiIiwiYWRkcmVzcyI6W10sImNyZWF0ZWRBdCI6IjIwMjItMTEtMDdUMTA6MTA6NDguMTkzWiIsImNyZWF0ZWRCeSI6IiIsInVwZGF0ZWRBdCI6IjIwMjItMTEtMDdUMTA6MTA6NDguMTkzWiIsInVwZGF0ZWRCeSI6IiIsIl9fdiI6MCwiZm5hbWUiOiJUZWphIiwibG5hbWUiOiJLIn0sImlhdCI6MTY2Nzg5ODE1MiwiZXhwIjoxNjcwNDkwMTUyfQ.DlSA6oJgSu5WPTnGgTt83plZ26LU9x6wxL52ataHwCk")
				.contentType(contentType)
				.body(bodyData)
				.when()
				.post(url)
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
		String url ="https://dev.api.atomzpower.com/api/v1/charger/manual/stop/session";
		String contentType="application/json";
		String bodyData="{\n"
				+ "    \"deviceId\":\"phzm91\"\n"
				+ "}";
			
		Response response = RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzY4ZDlhOGUyMWNlNmZlN2RkYzVkOWMiLCJtb2JpbGVOdW1iZXIiOiI2MzAxMDEyMDY2IiwiZW1haWwiOiJ0aGVqYXN3aW5pKzAxQG5hdmFkaGl0aS5jb20iLCJkZXZpY2VUeXBlIjoiIiwiYWRkcmVzcyI6W10sImNyZWF0ZWRBdCI6IjIwMjItMTEtMDdUMTA6MTA6NDguMTkzWiIsImNyZWF0ZWRCeSI6IiIsInVwZGF0ZWRBdCI6IjIwMjItMTEtMDdUMTA6MTA6NDguMTkzWiIsInVwZGF0ZWRCeSI6IiIsIl9fdiI6MCwiZm5hbWUiOiJUZWphIiwibG5hbWUiOiJLIn0sImlhdCI6MTY2Nzg5ODE1MiwiZXhwIjoxNjcwNDkwMTUyfQ.DlSA6oJgSu5WPTnGgTt83plZ26LU9x6wxL52ataHwCk")
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
		String url ="https://dev.api.atomzpower.com/api/v1/charger/manual/start/sessionn";
		String contentType="application/json";
		String bodyData="{\n"
				+ "    \"deviceId\":\"phzm91\"\n"
				+ "}";
		
		
		
		Response response =RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzY4ZDlhOGUyMWNlNmZlN2RkYzVkOWMiLCJtb2JpbGVOdW1iZXIiOiI2MzAxMDEyMDY2IiwiZW1haWwiOiJ0aGVqYXN3aW5pKzAxQG5hdmFkaGl0aS5jb20iLCJkZXZpY2VUeXBlIjoiIiwiYWRkcmVzcyI6W10sImNyZWF0ZWRBdCI6IjIwMjItMTEtMDdUMTA6MTA6NDguMTkzWiIsImNyZWF0ZWRCeSI6IiIsInVwZGF0ZWRBdCI6IjIwMjItMTEtMDdUMTA6MTA6NDguMTkzWiIsInVwZGF0ZWRCeSI6IiIsIl9fdiI6MCwiZm5hbWUiOiJUZWphIiwibG5hbWUiOiJLIn0sImlhdCI6MTY2Nzg5ODE1MiwiZXhwIjoxNjcwNDkwMTUyfQ.DlSA6oJgSu5WPTnGgTt83plZ26LU9x6wxL52ataHwCk")
				.contentType(contentType)
				.body(bodyData)
				.when()
				.post(url)
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
	@Test (priority=4)
	public void invalid_body() {
		String url ="https://dev.api.atomzpower.com/api/v1/charger/manual/stop/session";
		String contentType="application/json";
		String bodyData="{\n"
				+ "    \"deviceId\":\"\"\n"
				+ "}";
		
		
		Response response = RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzZiNzRmNjhlYzEyYjcyMDZlMzVlY2EiLCJtb2JpbGVOdW1iZXIiOiI2MzAxMDEyMDY2IiwiZW1haWwiOiIiLCJkZXZpY2VUeXBlIjoiIiwiYWRkcmVzcyI6W10sImNyZWF0ZWRBdCI6IjIwMjItMTEtMDlUMDk6Mzc6NTguNDU3WiIsImNyZWF0ZWRCeSI6IiIsInVwZGF0ZWRBdCI6IjIwMjItMTEtMDlUMDk6Mzc6NTguNDU3WiIsInVwZGF0ZWRCeSI6IiIsIl9fdiI6MH0sImlhdCI6MTY2ODE0MTA3NSwiZXhwIjoxNjcwNzMzMDc1fQ.DugHUAC2s9bCvuTGdU4wIpfSuA3x4gLZK_RmorI6FMo")
				.contentType(contentType)
				.body(bodyData)
				.when()
				.post(url)
				.then()
				.extract()
				.response();
		
		
		String responsebody = (response.getBody().asString());	   //body
		System.out.println("invalid_body response body is " +responsebody);
		int status = response.getStatusCode();                      //statuscode
		System.out.println("invalid_body status is"+status);
		
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 200);
	}
	@Test (priority=5)
	public void no_body() {
		String url ="https://dev.api.atomzpower.com/api/v1/charger/manual/stop/session";
		String contentType="application/json";
		String bodyData="";
		
		
		
		
		Response response = RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzZiNzRmNjhlYzEyYjcyMDZlMzVlY2EiLCJtb2JpbGVOdW1iZXIiOiI2MzAxMDEyMDY2IiwiZW1haWwiOiIiLCJkZXZpY2VUeXBlIjoiIiwiYWRkcmVzcyI6W10sImNyZWF0ZWRBdCI6IjIwMjItMTEtMDlUMDk6Mzc6NTguNDU3WiIsImNyZWF0ZWRCeSI6IiIsInVwZGF0ZWRBdCI6IjIwMjItMTEtMDlUMDk6Mzc6NTguNDU3WiIsInVwZGF0ZWRCeSI6IiIsIl9fdiI6MH0sImlhdCI6MTY2ODE0MTA3NSwiZXhwIjoxNjcwNzMzMDc1fQ.DugHUAC2s9bCvuTGdU4wIpfSuA3x4gLZK_RmorI6FMo")
				.contentType(contentType)
				.body(bodyData)
				.when()
				.post(url)
				.then()
				.extract()
				.response();
		
		
		String responsebody = (response.getBody().asString());	   //body
		System.out.println("no_body response body is " +responsebody);
		int status = response.getStatusCode();                      //statuscode
		System.out.println("no_body status is"+status);
		
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 200);
	}
	@Test (priority=6)
	
	public void no_uri() {
		//String url ="https://dev.api.atomzpower.com/api/v1/user/manualSignup";
		String contentType="application/json";
		String bodyData="{\n"
				+ "    \"deviceId\":\"phzm91\"\n"
				+ "}";
	
		
		
		
		Response response = RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzZiNzRmNjhlYzEyYjcyMDZlMzVlY2EiLCJtb2JpbGVOdW1iZXIiOiI2MzAxMDEyMDY2IiwiZW1haWwiOiIiLCJkZXZpY2VUeXBlIjoiIiwiYWRkcmVzcyI6W10sImNyZWF0ZWRBdCI6IjIwMjItMTEtMDlUMDk6Mzc6NTguNDU3WiIsImNyZWF0ZWRCeSI6IiIsInVwZGF0ZWRBdCI6IjIwMjItMTEtMDlUMDk6Mzc6NTguNDU3WiIsInVwZGF0ZWRCeSI6IiIsIl9fdiI6MH0sImlhdCI6MTY2ODE0MTA3NSwiZXhwIjoxNjcwNzMzMDc1fQ.DugHUAC2s9bCvuTGdU4wIpfSuA3x4gLZK_RmorI6FMo")
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
		String url ="https://dev.api.atomzpower.com/api/v1/charger/manual/stop/session";
		String contentType="application/json";
		String bodyData="{\n"
				+ "    \"deviceId\":\"phzm91\"\n"
				+ "}";
		
		
		
		
		Response response = RestAssured.given()
				.contentType(contentType)
				.body(bodyData)
				.when()
				.post(url)
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
	@Test (priority=8)
	public void invalid_token() {
		String url ="https://dev.api.atomzpower.com/api/v1/charger/manual/stop/session";
		String contentType="application/json";
		String bodyData="{\n"
				+ "    \"deviceId\":\"phzm91\"\n"
				+ "}";
		
		
		
		
		Response response = RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzZiNzRmNjhlYzEyYjcyMDZlMzVlY2EiLCJtb2JpbGVOdW1iZXIiOiI2MzAxMDEyMDY2IiwiZW1haWwiOiIiLCJkZXZpY2VUeXBlIjoiIiwiYWRkcmVzcyI6W10sImNyZWF0ZWRBdCI6IjIwMjItMTEtMDlUMDk6Mzc6NTguNDU3WiIsImNyZWF0ZWRCeSI6IiIsInVwZGF0ZWRBdCI6IjIwMjItMTEtMDlUMDk6Mzc6NTguNDU3WiIsInVwZGF0ZWRCeSI6IiIsIl9fdiI6MH0sImlhdCI6MTY2ODE0MTA3NSwiZXhwIjoxNjcwNzMzMDc1fQ.DugHUAC2s9bCvuTGdU4wIpfSuA3x4gLZK_RmorI6FMo")
				.contentType(contentType)
				.body(bodyData)
				.when()
				.post(url)
				.then()
				.extract()
				.response();
		
		String responsebody = (response.getBody().asString());	   //body
		System.out.println("invalid_token response body is " +responsebody);
		int status = response.getStatusCode();                      //statuscode
		System.out.println("invalid_token status is"+status);
		
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 200);
}

}
