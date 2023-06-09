package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestAssuredScriptInBDDFormat {
    public static void main(String[] args) {


        //given - build request
        RestAssured
                .given()
                .log()
                .all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking")
                .body("{\r\n" +
                        "  \"firstname\" : \"Priya\",\r\n" +
                        "\"lastname\" : \"Garg\",\r\n" +
                        "\"totalprice\" : \"111\",\r\n" +
                        "\"depositpaid\" : \"true\",\r\n" +
                        "\"bookingdates\" : {\r\n" +
                        " \"checkin\" : \"2023-05-17\",\r\n" +
                        "\"checkout\" : \"2023-05-18\",\r\n" +
                        "},\r\n" +
                        "\"additionalneeds\" : \"Breakfast\"\r\n" +
                        "}")
                .contentType(ContentType.JSON)
        //when
                .when()
                    .post()
                .then()
                .statusCode(200);
        //then
    }
}
