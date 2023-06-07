package JsonPathExamples;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;

public class InlineAssertionsForArrays_v31 {
    public static void main(String[] args) {
         RestAssured
                .given()
                .log()
                .all()
                .baseUri("https://restful-booker.herokuapp.com/booking")
                .when()
                .get()
                .then()
                .log()
                .all()
                .body("bookingid", Matchers.hasItems(100,10));

    }
}
