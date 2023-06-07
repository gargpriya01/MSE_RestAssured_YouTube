package awaitilityExamples;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateBooking {

    public static int createBooking(String url) {
        int randomNumber = (int) ((Math.random() * (50 - 1)) + 1);
        System.out.println(randomNumber);
        if (randomNumber % 2 == 0) {
            System.out.println("Booking creating ---");
            return RestAssured
                    .given()
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
                    //.post("https://restful-booker.herokuap.com/booking")
                    .post(url)
                    .statusCode();
        } else {
            System.out.println("Booking creation failed");
            return 0;
        }
    }
}
