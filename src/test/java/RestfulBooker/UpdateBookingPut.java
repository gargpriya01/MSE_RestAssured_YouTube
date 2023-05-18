package RestfulBooker;

import io.restassured.RestAssured;

public class UpdateBookingPut {
    public static void main(String[] args) {
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking/1")
                .header("Content-Type","application/json")
                .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .body(
                        "{\r\n"+
                                "  \"firstname\" : \"Priyanka\",\r\n"+
                                "\"lastname\" : \"Garg\",\r\n"+
                                "\"totalprice\" : \"111\",\r\n"+
                                "\"depositpaid\" : \"true\",\r\n"+
                                "\"bookingdates\" : {\r\n"+
                                " \"checkin\" : \"2023-05-17\",\r\n"+
                                "\"checkout\" : \"2023-05-18\",\r\n"+
                                "},\r\n"+
                                "\"additionalneeds\" : \"Breakfast\"\r\n"+
                                "}")
                .log()
                .all()
                .when()
                .put()
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);

    }
}
