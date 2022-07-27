package com.restAssured.api;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UrlResponse {
	
	@Test(invocationCount = 1)
	public void statusRespose() {
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		int statusCode = response.statusCode();
		AssertJUnit.assertEquals(statusCode, 200);
		System.out.println(response.statusLine());
	
		
	}
	



}


	
	
