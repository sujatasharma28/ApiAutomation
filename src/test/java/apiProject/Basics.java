package apiProject;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//given:: Give all input details
		//when : submit the api :: resource and http method
		//Then: validate the response
		
		RestAssured.baseURI ="https://rahulshettyacademy.com/";
		given().log().all().queryParam("Key", "qaclick123").header("Content-Type", "application/json")
		.body("{\r\n"
				+ "&quot;location&quot;: {\r\n"
				+ "&quot;lat&quot;: -38.383494,\r\n"
				+ "&quot;lng&quot;: 33.427362\r\n"
				+ "},\r\n"
				+ "&quot;accuracy&quot;: 50,\r\n"
				+ "\r\n"
				+ "&quot;name&quot;: &quot;Frontline house&quot;,\r\n"
				+ "&quot;phone_number&quot;: &quot;(+91) 983 893 3937&quot;,\r\n"
				+ "&quot;address&quot;: &quot;29, side layout, cohen 09&quot;,\r\n"
				+ "&quot;types&quot;: [\r\n"
				+ "&quot;shoe park&quot;,\r\n"
				+ "&quot;shop&quot;\r\n"
				+ "],\r\n"
				+ "&quot;website&quot;: &quot;http://google.com&quot;,\r\n"
				+ "&quot;language&quot;: &quot;French-IN&quot;\r\n"
				+ "}").when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200);
		
		
	}

}
