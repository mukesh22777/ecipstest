import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {
	
	
		@BeforeClass
		public void setup() {
			// Setting BaseURI once
			RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
			
			
			// Setting BasePath once
			RestAssured.basePath ="hyderbad";
		}
				
		@Test
		public void request1() {
			RequestSpecification request = RestAssured.given();
	 
			Response response = request.get();
	 
			//System.out.println(response.asString());
			
			String responseBody=response.getBody().asString();
			System.out.println("Response Body is :" +responseBody);
		}
	 
		
	}