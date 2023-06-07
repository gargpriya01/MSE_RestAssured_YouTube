package RestfulBooker;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.hamcrest.MatcherAssert;

public class VerifyJsonAgainstSchema {
    public static void main(String[] args) {
        String json = "{\n" +
                "    \"bookingid\": 1,\n" +
                "    \"booking\": {\n" +
                "        \"firstname\": \"Jim\",\n" +
                "        \"lastname\": \"Brown\",\n" +
                "        \"totalprice\": 111,\n" +
                "        \"depositpaid\": true,\n" +
                "        \"bookingdates\": {\n" +
                "            \"checkin\": \"2018-01-01\",\n" +
                "            \"checkout\": \"2019-01-01\"\n" +
                "        },\n" +
                "        \"additionalneeds\": \"Breakfast\"\n" +
                "    }\n" +
                "}";
        MatcherAssert.assertThat(json, JsonSchemaValidator.matchesJsonSchemaInClasspath("CreateBookingResponseSchema.json"));
    }
}
