package user;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class otplogin {
	@SuppressWarnings("unchecked")
	@Test
	// mobile otp login with valid details
	public void mobileotplogin_valid() {
		RestAssured.baseURI = "https://dev.api.atomzpower.com/api/v1/user";
		RequestSpecification httprequest = RestAssured.given();
		JSONObject request_parameters = new JSONObject();
		request_parameters.put("mobileNumber", "8217766272");
		httprequest.header("Content-Type", "application/json");
		httprequest.body(request_parameters.toJSONString());
		Response response = httprequest.request(Method.POST, "/otpLogin");
		String res_body = response.getBody().asString();
		System.out.println(res_body);
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 200);
		String statusline = response.getStatusLine();
		System.out.println(statusline);
		Headers allheaders = response.headers();
		for (Header header : allheaders) {
			System.out.println(header.getName() + " " + header.getValue());
		}
	}
	// mobile otp login with invalid method
	@Test
	public void mobileotplogin_invalid_method() {
		RestAssured.baseURI = "https://dev.api.atomzpower.com/api/v1/user";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.request(Method.GET, "/otpLogin");
		String res_body = response.getBody().asString();
		System.out.println(res_body);
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 404);
		String statusline = response.getStatusLine();
		System.out.println(statusline);
	}
	// mobile otp login with invalid URI
	@Test
	public void mobileotplogin_invalid_uri() {
		RestAssured.baseURI = "https://dev.api.atomzpower.com/api/v1/user";
		RequestSpecification httprequest = RestAssured.given();
		JSONObject request_parameters = new JSONObject();
		request_parameters.put("mobileNumber", "8217766272");
		httprequest.header("Content-Type", "application/json");
		httprequest.body(request_parameters.toJSONString());
		Response response = httprequest.request(Method.POST, "/otpLogin123");
		String res_body = response.getBody().asString();
		System.out.println(res_body);
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 404);
		String statusline = response.getStatusLine();
		System.out.println(statusline);
	}
	// mobile otp login with invalid body
	@Test
	public void mobileotplogin_invalid_body() {
		RestAssured.baseURI = "https://dev.api.atomzpower.com/api/v1/user";
		RequestSpecification httprequest = RestAssured.given();
		JSONObject request_parameters = new JSONObject();
		request_parameters.put("mobileNumber", "");
		httprequest.header("Content-Type", "application/json");
		httprequest.body(request_parameters.toJSONString());
		Response response = httprequest.request(Method.POST, "/otpLogin");
		String res_body = response.getBody().asString();
		System.out.println(res_body);
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 200);
		String statusline = response.getStatusLine();
		System.out.println(statusline);
	}
	// mobile otp login with empty body
	@Test
	public void mobileotplogin_empty_body() {
		RestAssured.baseURI = "https://dev.api.atomzpower.com/api/v1/user";
		RequestSpecification httprequest = RestAssured.given();
		JSONObject request_parameters = new JSONObject();
		//request_parameters.put("", "");
		httprequest.header("Content-Type", "application/json");
		httprequest.body(request_parameters.toJSONString());
		Response response = httprequest.request(Method.POST, "/otpLogin");
		String res_body = response.getBody().asString();
		System.out.println(res_body);
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 200);
		String statusline = response.getStatusLine();
		System.out.println(statusline);
	}
	// mobile otp login with no uri
	@Test(enabled=false)
	public void mobileotplogin_no_uri() {
		RestAssured.baseURI = "https://dev.api.atomzpower.com/api/v1/user";
		RequestSpecification httprequest = RestAssured.given();
		JSONObject request_parameters = new JSONObject();
		request_parameters.put("mobileNumber", "8217766272");
		httprequest.header("Content-Type", "application/json");
		httprequest.body(request_parameters.toJSONString());
		Response response = httprequest.request(Method.POST, "");
		String res_body = response.getBody().asString();
		System.out.println(res_body);
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 404);
		String statusline = response.getStatusLine();
		System.out.println(statusline);
	}
}

		
		
		



