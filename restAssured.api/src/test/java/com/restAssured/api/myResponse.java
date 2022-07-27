package com.restAssured.api;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import io.restassured.response.Response;



public class myResponse {
	
	public static int n = 10;
	
	@Test(invocationCount = 200)
	public void rResponse()
	{
		Response request = RestAssured.get("https://reqres.in/api/users?page=2");
		int responseCode = request.statusCode();
		if(responseCode == 200)
		{
			System.out.println(responseCode);
			AssertJUnit.assertEquals(responseCode, 200);
		}
		else
		{
			System.out.println(responseCode);
			int[] errorCode = {300,301,302,400,401,402,404,500,501};
			for (int errorCode1: errorCode )
			{
				for (int i =0; i<errorCode.length;i++)
				{
					System.out.println(responseCode);
					System.out.println(errorCode1);
					AssertJUnit.assertEquals(responseCode,errorCode1);

				}
			}
		}
	}
}


