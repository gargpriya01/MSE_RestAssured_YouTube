package DataShare;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class GetBookingDetailsITestContextWithinSuite_v46 {

    @Test
    public void getBooking(ITestContext context)
    {
        Response response= RestAssured
                .given()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .get("https://restful-booker.herokuapp.com/booking/" + context.getSuite().getAttribute("bookingId"))
                .then().log().all().extract().response();
    }
}
