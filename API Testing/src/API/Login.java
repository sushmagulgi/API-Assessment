package API;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Login {

	@Test(priority =1)
	public void Login1() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all()
				.when().post("/login")
				.then().log().all().assertThat().statusCode(415).extract().response().asString();
	}
	@Test(priority =2)
	public void Login2() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all()
				.when().post("/login")
				.then().log().all().assertThat().statusCode(415).extract().response().asString();
	}
	
	@Test(priority =3)
	public void Login3() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all()
				.when().post("/login")
				.then().log().all().assertThat().statusCode(415).extract().response().asString();
	}
	@Test(priority =4)
	public void Login4() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all()
				.when().post("/login")
				.then().log().all().assertThat().statusCode(415).extract().response().asString();
	}
	@Test(priority =5)
	public void Login5() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all()
				.when().post("/login")
				.then().log().all().assertThat().statusCode(415).extract().response().asString();
	}
}
