package APIRestAssured.HittingRequest;

import static io.restassured.RestAssured.* ;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequest 
{
	public static void main(String[] args) 
	{
		Response re=
		
				given().contentType(ContentType.JSON).when().get("http://localhost:3000/APIBatchStudents");
		
		
		System.out.println("status code is :: ");
		System.out.println(re.statusCode());
		System.out.println("Data is: ");
		System.out.println(re.asString());
		
	}
	
}


