package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;

import java.io.File;

public class CreateBookingWithSchemaValidator {
    public static void main(String[] args) {


                RestAssured
                .given()
                .log()
        .all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking")
                .body("{\r\n"+
              "  \"firstname\" : \"Priya\",\r\n"+
                "\"lastname\" : \"Garg\",\r\n"+
                "\"totalprice\" : 111,\r\n"+
                "\"depositpaid\" : true,\r\n"+
                "\"bookingdates\" : {\r\n"+
           " \"checkin\" : \"2023-05-17\",\r\n"+
                    "\"checkout\" : \"2023-05-18\"\r\n"+
        "},\r\n"+
        "\"additionalneeds\" : \"Lunch\"\r\n"+
"}")
                        .contentType(ContentType.JSON)
                        .post()
                        .then()
                        .log()
                        .all()
                                .statusCode(200)
                        //to be used only when json file is kept in  resources folder
        .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("CreateBookingResponseSchema.json"));
//processing file using file path
//.body(JsonSchemaValidator.matchesJsonSchema(new File("/Users/priyagarg/IdeaProjects/RestAssuredMaster/restAssuredProject/src/test/resources/CreateBookingResponseSchema.json"));





    }
}
