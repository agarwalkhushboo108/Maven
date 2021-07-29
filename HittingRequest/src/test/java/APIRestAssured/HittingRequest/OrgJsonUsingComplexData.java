package APIRestAssured.HittingRequest;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class OrgJsonUsingComplexData 
{
	public static void main(String[] args) 
	{
		Pojo_Array_1[] address = new Pojo_Array_1[2];
		
		address[0] = new Pojo_Array_1();
		address[1] = new Pojo_Array_1();
		
		address[0].setHouseNumber1("8/91");
		address[0].setArea1("Sarai: Hakeem");
		address[0].setCity1("Aligarh");
		address[0].setType1("Permanent Address");
		
		address[1].setHouseNumber1("XYZ");
		address[1].setArea1("ABC");
		address[1].setCity1("123");
		address[1].setType1("456");
		
		Pojo_Array_2 adress2 = new Pojo_Array_2();
		adress2.setHouseNumber2("2205B");
		adress2.setArea2("Wellington Panchsheel");
		adress2.setCity2("Ghaziabad");
		adress2.setType2("current Address");
		adress2.setAddress1(address);
		
		Response re=
				
				given().contentType(ContentType.JSON).body(adress2).when().post("http://localhost:3000/APITestClasses");
				
				System.out.println("status code is: ");
				System.out.println(re.statusCode());
	}
}
