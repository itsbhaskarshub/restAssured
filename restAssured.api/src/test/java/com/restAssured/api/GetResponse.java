package com.restAssured.api;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetResponse {
	
	@Test
	public void Get()
	{

				given().get("https://reqres.in/api/users?page=2").then().
				statusCode(200).
				body("data.id[0]", equalTo(7)).
				body("data.first_name", hasItems("Michael","Lindsay","Tobias","Byron","George","Rachel")).
				log().all();
		
	}

	

}
