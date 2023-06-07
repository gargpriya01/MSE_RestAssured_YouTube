package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultipleBookingswithRequestspec {

    RequestSpecification requestSpecification;

    @BeforeClass
    public void setupRequestSpec(){
    requestSpecification = RestAssured.given();
    requestSpecification
            .log()
            .all()
            .baseUri("https://restful-booker.herokuapp.com/")
            .contentType(ContentType.JSON);
    }

    @Test
    public void createBooking() {
        RestAssured
                .given(requestSpecification)
                //.spec(requestSpecification)
                .basePath("booking")
                .body("{\r\n"+
                        "  \"firstname\" : \"Sushant\",\r\n"+
                        "\"lastname\" : \"Garg\",\r\n"+
                        "\"totalprice\" : 111,\r\n"+
                        "\"depositpaid\" : true,\r\n"+
                        "\"bookingdates\" : {\r\n"+
                        " \"checkin\" : \"2023-05-17\",\r\n"+
                        "\"checkout\" : \"2023-05-18\"\r\n"+
                        "},\r\n"+
                        "\"additionalneeds\" : \"Breakfast\"\r\n"+
                        "}")
                .contentType(ContentType.JSON)
                .post()
                .then().
                log()
                .all()
                .statusCode(200);
    }

    @Test
    public void updateBooking(){
        RestAssured.given(requestSpecification)
                .basePath("booking/1")
                .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .body(
                        "{\r\n"+
                                "  \"firstname\" : \"Priyanka\",\r\n"+
                                "\"lastname\" : \"Garg\",\r\n"+
                                "\"totalprice\" : 111,\r\n"+
                                "\"depositpaid\" : true,\r\n"+
                                "\"bookingdates\" : {\r\n"+
                                "\"checkin\" : \"2023-05-17\",\r\n"+
                                "\"checkout\" : \"2023-05-18\"\r\n" +"},\r\n"+
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
