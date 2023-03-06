package API;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class Delete {
	
	@Test(priority =1)
	public void delete1() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all().pathParam("id", "1")
				.when().delete("/users/{id}")
				.then().log().all().assertThat().statusCode(204).extract().response().asString();
	}
	@Test(priority =2)
	public void delete2() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all().pathParam("id", "2")
				.when().delete("/users/{id}")
				.then().log().all().assertThat().statusCode(204).extract().response().asString();
	}
	@Test(priority=3)
	public void delete3() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all().pathParam("id", "3")
				.when().delete("/users/{id}")
				.then().log().all().assertThat().statusCode(204).extract().response().asString();
	}
	@Test(priority =4)
	public void delete4() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all().pathParam("id", "4")
				.when().delete("/users/{id}")
				.then().log().all().assertThat().statusCode(204).extract().response().asString();
	}
	@Test(priority =5)
	public void delete5() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all().pathParam("id", "5")
				.when().delete("/users/{id}")
				.then().log().all().assertThat().statusCode(204).extract().response().asString();
	}

}
