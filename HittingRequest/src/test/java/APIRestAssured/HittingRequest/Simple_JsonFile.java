package APIRestAssured.HittingRequest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Simple_JsonFile 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File f = new File("../HittingRequest/BodyData.json");
		FileReader fr = new FileReader(f);
		JSONTokener je = new JSONTokener(fr);
		JSONObject j = new JSONObject(je);
		
		System.out.println(j.toString());
		
		Response re = 
		given().contentType(ContentType.JSON).body(j.toString()).when().post("http://localhost:3000/APITestClasses");
		
		System.out.println("status code is: ");
		System.out.println(re.statusCode());
	}
}
