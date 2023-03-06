package API;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetTest {

	
	@Test(priority =1)
	public void Fetch1() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all().pathParam("id", "1")
				.when().get("/users/{id}")
				.then().log().all().assertThat().statusCode(200).extract().response().asString();
	}
	
	@Test(priority =2)
	public  void Fetch2() {
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all().pathParam("id", "2")
				.when().get("/users/{id}")
				.then().log().all().assertThat().statusCode(200).extract().response().asString();
	}
	
	@Test(priority =3)
	public  void Fetch3() {
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all().pathParam("id", "3")
				.when().get("/users/{id}")
				.then().log().all().assertThat().statusCode(200).extract().response().asString();
	}
	
	@Test(priority =4)
	public  void Fetch4() {
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all().pathParam("id", "4")
				.when().get("/users/{id}")
				.then().log().all().assertThat().statusCode(200).extract().response().asString();
	}
	
	@Test(priority =5)
	public  void Fetch5() {
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all().pathParam("id", "5")
				.when().get("/users/{id}")
				.then().log().all().assertThat().statusCode(200).extract().response().asString();
	}
	
	}

