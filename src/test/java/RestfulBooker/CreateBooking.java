package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateBooking {
    public static void main(String[] args) {

        //Build Request
       /* RequestSpecification requestSpecification=RestAssured.given().log().all();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking");*/

       // RequestSpecification requestSpecification=
                RestAssured
                .given()
                .log()
        .all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking")
                .body("{\r\n"+
              "  \"firstname\" : \"Priya\",\r\n"+
                "\"lastname\" : \"Garg\",\r\n"+
                "\"totalprice\" : \"111\",\r\n"+
                "\"depositpaid\" : \"true\",\r\n"+
                "\"bookingdates\" : {\r\n"+
           " \"checkin\" : \"2023-05-17\",\r\n"+
                    "\"checkout\" : \"2023-05-18\",\r\n"+
        "},\r\n"+
        "\"additionalneeds\" : \"Breakfast\"\r\n"+
"}")
                        .contentType(ContentType.JSON)
                        .post()
                        .then().
                        log()
                        .all()
                                .statusCode(200);

        //hit request and get response
        //Response response=requestSpecification.post();

        //validate response
     //  ValidatableResponse validatableResponse= response.then().log().all();
       // validatableResponse.statusCode(200);
    }
}
