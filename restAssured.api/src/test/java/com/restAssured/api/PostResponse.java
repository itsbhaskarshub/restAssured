package com.restAssured.api;

import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostResponse {
	
	@Test
	public void Post()
	{
		JSONObject postresponse = new JSONObject();
		postresponse.put("id", "13");
		postresponse.put("email", "bharathabhaskar1@gmail.com");
		postresponse.put("first_name", "Bhaskar");
		postresponse.put("last_name", "Bharatha");
		
		
		System.out.println(postresponse);
		System.out.println(postresponse.toString());

		given()
		.body(postresponse.toJSONString())
		.when()
		.post("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(201);


	}

}
