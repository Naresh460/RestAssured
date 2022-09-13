package RestAssured.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestt {

	@Test
	void getWeatherDetails() {
		
		//Specify Base URI
		RestAssured.baseURI="https://demoqa.com/BookStore/v1";
		
		//request Object
		RequestSpecification requestSpec =RestAssured.given();
		
		//Response Object
		Response resp =requestSpec.request(Method.GET,"/Books");
		
		//Print the response in screen
		String responseBody=resp.getBody().asString();
		System.out.println(responseBody);
		
		//Print response code
		int code=resp.getStatusCode();
		System.out.println("Code is ---->"+code);
		
		//Print status line
		String statuslin=resp.getStatusLine();
		System.out.println("Status line is-->"+statuslin);
	}
}
