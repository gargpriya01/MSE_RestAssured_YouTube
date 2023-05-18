package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PatchBooking {
    public static void main(String[] args) {
        RestAssured.given()
                .log().all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking/1")
                .body("{\r\n"+
                        "  \"firstname\" : \"Ericson\",\r\n"+
                        "\"lastname\" : \"Garg\",\r\n"+"}")
                .contentType(ContentType.JSON)
                .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .when()
                .patch()
                .then()
                .statusCode(200)
                .log()
                .all();
    }
}
