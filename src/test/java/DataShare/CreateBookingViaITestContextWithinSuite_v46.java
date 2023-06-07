package DataShare;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CreateBookingViaITestContextWithinSuite_v46 {
    @Test
    public void createBooking(ITestContext context){
    int id=RestAssured
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
            .extract()
            .jsonPath()
            .getInt("bookingid");

    context.getSuite().setAttribute("bookingId",id);

}}
