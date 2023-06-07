package DataShare;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ShareDataAmongMethodsWithCommonDataClass_v42 {

    @Test(priority=1)
    public void createBooking() {

        DataStore_v42.BOOKING_ID= RestAssured
                .given()
                .log()
                .all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking")
                .body("{\r\n" +
                        "  \"firstname\" : \"Priya\",\r\n" +
                        "\"lastname\" : \"Garg\",\r\n" +
                        "\"totalprice\" : 111,\r\n" +
                        "\"depositpaid\" : true,\r\n" +
                        "\"bookingdates\" : {\r\n" +
                        " \"checkin\" : \"2023-05-17\",\r\n" +
                        "\"checkout\" : \"2023-05-18\"\r\n" +
                        "},\r\n" +
                        "\"additionalneeds\" : \"Lunch\"\r\n" +
                        "}")
                .contentType(ContentType.JSON)
                .post()
                .then()
                .log()
                .all()
                .statusCode(200)
                .extract()
                .jsonPath()
                .getInt("bookingid");
    }

        @Test(priority=2)
                public void retrieveBooking(){

            Response response= RestAssured
                    .given()
                    .log()
                    .all()
                    .contentType(ContentType.JSON)
                    .get("https://restful-booker.herokuapp.com/booking/" + DataStore_v42.BOOKING_ID)
                    .then().log().all().extract().response();
    }
}
