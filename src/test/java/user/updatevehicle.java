package user;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class updatevehicle {
	@Test (priority=1)
	public void valid() {
		String url ="https://dev.api.atomzpower.com/api/v1/user/updateVehicle";
		String contentType="application/json";
		String bodyData="{\n"
				+ "    \"_id\":\"634e906540cd338504ee8634\",\n"
				+ "    \"updateObject\":{\n"
				+ "        \"vehicleType\": \"ather\",\n"
				+ "                        \"modelImagePrivate\": \"\",\n"
				+ "                        \"modelImagePublic\": \"\",\n"
				+ "                        \"regNum\": \"apsr12345\",\n"
				+ "                        \"vehicleName\": \"teju\",\n"
				+ "                        \"vehiclemodel\": \"first generation\",\n"
				+ "                        \"default\": true,\n"
				+ "                        \"createdAt\": \"2022-10-14T08:03:34.831Z\",\n"
				+ "                        \"updatedAt\": \"2022-10-14T08:03:34.831Z\",\n"
				+ "                        \"__v\": 0\n"
				+ "\n"
				+ "        \n"
				+ "    }\n"
				+ "}";
		
		Response response = RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzRlOGQ4MTQwY2QzMzg1MDRlZTg2MWUiLCJtb2JpbGVOdW1iZXIiOiI2MzAxMDEyMDY2IiwiZW1haWwiOiJ0aGVqYXN3aW5pKzAxQG5hdmFkaGl0aS5jb20iLCJkZXZpY2VUeXBlIjoiIiwiYWRkcmVzcyI6W10sImNyZWF0ZWRBdCI6IjIwMjItMTAtMThUMTE6MjY6NTcuNzI5WiIsImNyZWF0ZWRCeSI6IiIsInVwZGF0ZWRBdCI6IjIwMjItMTAtMThUMTE6MjY6NTcuNzI5WiIsInVwZGF0ZWRCeSI6IiIsIl9fdiI6MCwiZm5hbWUiOiJUZWphIiwibG5hbWUiOiJLIn0sImlhdCI6MTY2NjY2MDkxMywiZXhwIjoxNjY5MjUyOTEzfQ.D5cn-eX3NONqpDL_krE-KpdWasY8WKVch-3_rl8dW34")
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
		String url ="https://dev.api.atomzpower.com/api/v1/user/updateVehicle";
		String contentType="application/json";
		String bodyData="{\n"
				+ "    \"_id\":\"634e906540cd338504ee8634\",\n"
				+ "    \"updateObject\":{\n"
				+ "        \"vehicleType\": \"ather\",\n"
				+ "                        \"modelImagePrivate\": \"\",\n"
				+ "                        \"modelImagePublic\": \"\",\n"
				+ "                        \"regNum\": \"apsr12345\",\n"
				+ "                        \"vehicleName\": \"teju\",\n"
				+ "                        \"vehiclemodel\": \"first generation\",\n"
				+ "                        \"default\": true,\n"
				+ "                        \"createdAt\": \"2022-10-14T08:03:34.831Z\",\n"
				+ "                        \"updatedAt\": \"2022-10-14T08:03:34.831Z\",\n"
				+ "                        \"__v\": 0\n"
				+ "\n"
				+ "        \n"
				+ "    }\n"
				+ "}";
		
		
		
		Response response = RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzRlOGQ4MTQwY2QzMzg1MDRlZTg2MWUiLCJtb2JpbGVOdW1iZXIiOiI2MzAxMDEyMDY2IiwiZW1haWwiOiJ0aGVqYXN3aW5pKzAxQG5hdmFkaGl0aS5jb20iLCJkZXZpY2VUeXBlIjoiIiwiYWRkcmVzcyI6W10sImNyZWF0ZWRBdCI6IjIwMjItMTAtMThUMTE6MjY6NTcuNzI5WiIsImNyZWF0ZWRCeSI6IiIsInVwZGF0ZWRBdCI6IjIwMjItMTAtMThUMTE6MjY6NTcuNzI5WiIsInVwZGF0ZWRCeSI6IiIsIl9fdiI6MCwiZm5hbWUiOiJUZWphIiwibG5hbWUiOiJLIn0sImlhdCI6MTY2NjY2MDkxMywiZXhwIjoxNjY5MjUyOTEzfQ.D5cn-eX3NONqpDL_krE-KpdWasY8WKVch-3_rl8dW34")
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
		String url ="https://dev.api.atomzpower.com/api/v1/userupdateVeh";
		String contentType="application/json";
		String bodyData="{\n"
				+ "    \"_id\":\"634e906540cd338504ee8634\",\n"
				+ "    \"updateObject\":{\n"
				+ "        \"vehicleType\": \"ather\",\n"
				+ "                        \"modelImagePrivate\": \"\",\n"
				+ "                        \"modelImagePublic\": \"\",\n"
				+ "                        \"regNum\": \"apsr12345\",\n"
				+ "                        \"vehicleName\": \"teju\",\n"
				+ "                        \"vehiclemodel\": \"first generation\",\n"
				+ "                        \"default\": true,\n"
				+ "                        \"createdAt\": \"2022-10-14T08:03:34.831Z\",\n"
				+ "                        \"updatedAt\": \"2022-10-14T08:03:34.831Z\",\n"
				+ "                        \"__v\": 0\n"
				+ "\n"
				+ "        \n"
				+ "    }\n"
				+ "}";
		
		
		
		Response response = RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzRlOGQ4MTQwY2QzMzg1MDRlZTg2MWUiLCJtb2JpbGVOdW1iZXIiOiI2MzAxMDEyMDY2IiwiZW1haWwiOiJ0aGVqYXN3aW5pKzAxQG5hdmFkaGl0aS5jb20iLCJkZXZpY2VUeXBlIjoiIiwiYWRkcmVzcyI6W10sImNyZWF0ZWRBdCI6IjIwMjItMTAtMThUMTE6MjY6NTcuNzI5WiIsImNyZWF0ZWRCeSI6IiIsInVwZGF0ZWRBdCI6IjIwMjItMTAtMThUMTE6MjY6NTcuNzI5WiIsInVwZGF0ZWRCeSI6IiIsIl9fdiI6MCwiZm5hbWUiOiJUZWphIiwibG5hbWUiOiJLIn0sImlhdCI6MTY2NjY2MDkxMywiZXhwIjoxNjY5MjUyOTEzfQ.D5cn-eX3NONqpDL_krE-KpdWasY8WKVch-3_rl8dW34")
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
		String url ="https://dev.api.atomzpower.com/api/v1/user/updateVehicle";
		String contentType="application/json";
		String bodyData="{\n"
				+ "    \"_id\":\"\",\n"
				+ "    \"updateObject\":{\n"
				+ "        \"vehicleType\": \"\",\n"
				+ "                        \"modelImagePrivate\": \"\",\n"
				+ "                        \"modelImagePublic\": \"\",\n"
				+ "                        \"regNum\": \"\",\n"
				+ "                        \"vehicleName\": \"\",\n"
				+ "                        \"vehiclemodel\": \"\",\n"
				+ "                        \"default\": true,\n"
				+ "                        \"createdAt\": \"2022-10-14T08:03:34.831Z\",\n"
				+ "                        \"updatedAt\": \"2022-10-14T08:03:34.831Z\",\n"
				+ "                        \"__v\": 0\n"
				+ "\n"
				+ "        \n"
				+ "    }\n"
				+ "}";
		
		
		
		
		Response response = RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzRlOGQ4MTQwY2QzMzg1MDRlZTg2MWUiLCJtb2JpbGVOdW1iZXIiOiI2MzAxMDEyMDY2IiwiZW1haWwiOiJ0aGVqYXN3aW5pKzAxQG5hdmFkaGl0aS5jb20iLCJkZXZpY2VUeXBlIjoiIiwiYWRkcmVzcyI6W10sImNyZWF0ZWRBdCI6IjIwMjItMTAtMThUMTE6MjY6NTcuNzI5WiIsImNyZWF0ZWRCeSI6IiIsInVwZGF0ZWRBdCI6IjIwMjItMTAtMThUMTE6MjY6NTcuNzI5WiIsInVwZGF0ZWRCeSI6IiIsIl9fdiI6MCwiZm5hbWUiOiJUZWphIiwibG5hbWUiOiJLIn0sImlhdCI6MTY2NjY2MDkxMywiZXhwIjoxNjY5MjUyOTEzfQ.D5cn-eX3NONqpDL_krE-KpdWasY8WKVch-3_rl8dW34")
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
		String url ="https://dev.api.atomzpower.com/api/v1/user/updateVehicle";
		String contentType="application/json";
		String bodyData="";
		
		
		
		
		Response response = RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzRlOGQ4MTQwY2QzMzg1MDRlZTg2MWUiLCJtb2JpbGVOdW1iZXIiOiI2MzAxMDEyMDY2IiwiZW1haWwiOiJ0aGVqYXN3aW5pKzAxQG5hdmFkaGl0aS5jb20iLCJkZXZpY2VUeXBlIjoiIiwiYWRkcmVzcyI6W10sImNyZWF0ZWRBdCI6IjIwMjItMTAtMThUMTE6MjY6NTcuNzI5WiIsImNyZWF0ZWRCeSI6IiIsInVwZGF0ZWRBdCI6IjIwMjItMTAtMThUMTE6MjY6NTcuNzI5WiIsInVwZGF0ZWRCeSI6IiIsIl9fdiI6MCwiZm5hbWUiOiJUZWphIiwibG5hbWUiOiJLIn0sImlhdCI6MTY2NjY2MDkxMywiZXhwIjoxNjY5MjUyOTEzfQ.D5cn-eX3NONqpDL_krE-KpdWasY8WKVch-3_rl8dW34")
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
				+ "    \"_id\":\"634e906540cd338504ee8634\",\n"
				+ "    \"updateObject\":{\n"
				+ "        \"vehicleType\": \"ather\",\n"
				+ "                        \"modelImagePrivate\": \"\",\n"
				+ "                        \"modelImagePublic\": \"\",\n"
				+ "                        \"regNum\": \"apsr12345\",\n"
				+ "                        \"vehicleName\": \"teju\",\n"
				+ "                        \"vehiclemodel\": \"first generation\",\n"
				+ "                        \"default\": true,\n"
				+ "                        \"createdAt\": \"2022-10-14T08:03:34.831Z\",\n"
				+ "                        \"updatedAt\": \"2022-10-14T08:03:34.831Z\",\n"
				+ "                        \"__v\": 0\n"
				+ "\n"
				+ "        \n"
				+ "    }\n"
				+ "}";
		
		
		Response response = RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzRlOGQ4MTQwY2QzMzg1MDRlZTg2MWUiLCJtb2JpbGVOdW1iZXIiOiI2MzAxMDEyMDY2IiwiZW1haWwiOiJ0aGVqYXN3aW5pKzAxQG5hdmFkaGl0aS5jb20iLCJkZXZpY2VUeXBlIjoiIiwiYWRkcmVzcyI6W10sImNyZWF0ZWRBdCI6IjIwMjItMTAtMThUMTE6MjY6NTcuNzI5WiIsImNyZWF0ZWRCeSI6IiIsInVwZGF0ZWRBdCI6IjIwMjItMTAtMThUMTE6MjY6NTcuNzI5WiIsInVwZGF0ZWRCeSI6IiIsIl9fdiI6MCwiZm5hbWUiOiJUZWphIiwibG5hbWUiOiJLIn0sImlhdCI6MTY2NjY2MDkxMywiZXhwIjoxNjY5MjUyOTEzfQ.D5cn-eX3NONqpDL_krE-KpdWasY8WKVch-3_rl8dW34")
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
		String url ="https://dev.api.atomzpower.com/api/v1/user/updateVehicle";
		String contentType="application/json";
		String bodyData="{\n"
				+ "    \"_id\":\"634e906540cd338504ee8634\",\n"
				+ "    \"updateObject\":{\n"
				+ "        \"vehicleType\": \"ather\",\n"
				+ "                        \"modelImagePrivate\": \"\",\n"
				+ "                        \"modelImagePublic\": \"\",\n"
				+ "                        \"regNum\": \"apsr12345\",\n"
				+ "                        \"vehicleName\": \"teju\",\n"
				+ "                        \"vehiclemodel\": \"first generation\",\n"
				+ "                        \"default\": true,\n"
				+ "                        \"createdAt\": \"2022-10-14T08:03:34.831Z\",\n"
				+ "                        \"updatedAt\": \"2022-10-14T08:03:34.831Z\",\n"
				+ "                        \"__v\": 0\n"
				+ "\n"
				+ "        \n"
				+ "    }\n"
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
		String url ="https://dev.api.atomzpower.com/api/v1/user/updateVehicle";
		String contentType="application/json";
		String bodyData="{\n"
				+ "    \"_id\":\"634e906540cd338504ee8634\",\n"
				+ "    \"updateObject\":{\n"
				+ "        \"vehicleType\": \"ather\",\n"
				+ "                        \"modelImagePrivate\": \"\",\n"
				+ "                        \"modelImagePublic\": \"\",\n"
				+ "                        \"regNum\": \"apsr12345\",\n"
				+ "                        \"vehicleName\": \"teju\",\n"
				+ "                        \"vehiclemodel\": \"first generation\",\n"
				+ "                        \"default\": true,\n"
				+ "                        \"createdAt\": \"2022-10-14T08:03:34.831Z\",\n"
				+ "                        \"updatedAt\": \"2022-10-14T08:03:34.831Z\",\n"
				+ "                        \"__v\": 0\n"
				+ "\n"
				+ "        \n"
				+ "    }\n"
				+ "}";
		
		
		
		Response response = RestAssured.given().header("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ2YWx1ZSI6eyJfaWQiOiI2MzRlOGQ4MTQwY2QzMzg1MDRlZTg2MWUiLCJtb2JpbGVOdW1iZXIiOiI2MzAxMDEyMDY2IiwiZW1haWwiOiIiLCJkZXZpY2VUeXBlIjoiIiwiYWRkcmVzcyI6W10sImNyZWF0ZWRBdCI6Ij")
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
}}

