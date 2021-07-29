package APIRestAssured.HittingRequest;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.* ;

public class OrgJsonUsingArray 
{
	public static void main(String[] args) 
	{
		JSONObject inner1 = new JSONObject();
		inner1.put("House Number", "2205B");
		inner1.put("Society", "Wellington Panchsheel");
		inner1.put("Area", "Crossing Republik");
		inner1.put("City", "Ghaziabad");
		inner1.put("State", "Uttar Pradesh");
		inner1.put("type", "current address");
		
		JSONObject inner2 = new JSONObject();
		inner2.put("House Number:", "8/91");
		inner2.put("Street", "Sarai Hakeem");
		inner2.put("City", "Aligarh");
		inner2.put("State", "Uttar Pradesh");
		inner2.put("type", "permanent address");
		
		JSONArray array = new JSONArray();
		array.put(0,inner1);
		array.put(1,inner2);
		
		JSONObject outer = new JSONObject();
		outer.put("firstname", "Khushboo");
		outer.put("lastname", "Agrawal");
		outer.put("Designation", "Analyst");
		outer.put("Age", "24");
		outer.put("Address", array);
		
		Response re = 
		given().contentType(ContentType.JSON).body(outer.toString()).post("http://localhost:3000/APITestClasses");
		
		System.out.println("status code is: ");
		System.out.println(re.statusCode());
	}
}
