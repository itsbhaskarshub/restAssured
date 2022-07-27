package com.restAssured.api;

import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class patchResponse {
	
	@Test
	public void patch()
	{
		JSONObject request = new JSONObject();
		request.put("id", 2);
		request.put("email", "bharathabhaskar1@gmail.com");
		request.put("first_name", "Bhaskar");
		request.put("last_name", "Bharatha");
		request.put("avatar","https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg");
	
		System.out.println(request);
		System.out.println(request.toString());
	
		given()
		.body(request.toJSONString())
		.when()
		.patch("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(404);
		
	}


}
