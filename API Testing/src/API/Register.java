package API;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Register {
	@Test(priority =1)
	public void reg1() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all()
				.when().post("/register")
				.then().log().all().assertThat().statusCode(415).extract().response().asString();
	}
	@Test(priority =2)
	public void reg2() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all()
				.when().post("/register")
				.then().log().all().assertThat().statusCode(415).extract().response().asString();
	}
	@Test(priority =3)
	public void reg3() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all()
				.when().post("/register")
				.then().log().all().assertThat().statusCode(415).extract().response().asString();
	}
	@Test(priority =4)
	public void reg4() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all()
				.when().post("/register")
				.then().log().all().assertThat().statusCode(415).extract().response().asString();
	}
	@Test(priority =5)
	public void reg5() {
		
		
		RestAssured.baseURI="https://reqres.in/api";
		String response = given().log().all()
				.when().post("/register")
				.then().log().all().assertThat().statusCode(415).extract().response().asString();
	}

}
