package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteBooking {
    public static void main(String[] args) {
        RestAssured.given()
                .log()
                .all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking/{bookingId}")
                .pathParam("bookingId",5)
                .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .contentType(ContentType.JSON)
                .when()
                .delete()
                .then()
                .log()
                .all()
                .statusCode(201);
    }
}
