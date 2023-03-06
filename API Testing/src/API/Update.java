package API;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Update {
	
	@Test(priority =1)
	public void update1() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all().pathParam("id", "1")
				.when().put("/users/{id}")
				.then().log().all().assertThat().statusCode(200).extract().response().asString();
	}

	@Test(priority =2)
	public void update2() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all().pathParam("id", "2")
				.when().put("/users/{id}")
				.then().log().all().assertThat().statusCode(200).extract().response().asString();
	}
	@Test(priority =3)
	public void update3() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all().pathParam("id", "3")
				.when().put("/users/{id}")
				.then().log().all().assertThat().statusCode(200).extract().response().asString();
	}
	@Test(priority =4)
	public void update4() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all().pathParam("id", "4")
				.when().put("/users/{id}")
				.then().log().all().assertThat().statusCode(200).extract().response().asString();
	}
	@Test(priority =5)
	public void update5() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all().pathParam("id", "5")
				.when().put("/users/{id}")
				.then().log().all().assertThat().statusCode(200).extract().response().asString();
	}
}
