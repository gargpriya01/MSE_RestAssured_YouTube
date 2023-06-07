package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ExtractResponseAsString {
    public static void main(String[] args) {

        //Build Request
       /* RequestSpecification requestSpecification=RestAssured.given().log().all();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking");*/

       // RequestSpecification requestSpecification=
                String responseBody=RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking")
                .body("{\r\n"+
              "  \"firstname\" : \"Priyanka\",\r\n"+
                "\"lastname\" : \"Garg\",\r\n"+
                "\"totalprice\" : \"121\",\r\n"+
                "\"depositpaid\" : \"true\",\r\n"+
                "\"bookingdates\" : {\r\n"+
           " \"checkin\" : \"2023-05-18\",\r\n"+
                    "\"checkout\" : \"2023-05-19\",\r\n"+
        "},\r\n"+
        "\"additionalneeds\" : \"Breakfast\"\r\n"+
"}")
                        .contentType(ContentType.JSON)
                        .post()
                        .then()
                        .extract()
                       // .body()
                        .asPrettyString();
        System.out.println(responseBody);

        //hit request and get response
        //Response response=requestSpecification.post();

        //validate response
     //  ValidatableResponse validatableResponse= response.then().log().all();
       // validatableResponse.statusCode(200);
    }
}
