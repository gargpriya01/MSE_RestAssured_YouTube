package RestfulBooker;

import io.restassured.RestAssured;

public class PathParameterExample2 {
    public static void main(String[] args) {
        RestAssured
                .given()
                .log()
                .all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("{basePath}/{bookingId}")

                .when()
                    .get("https://restful-booker.herokuapp.com/{basePath}/{bookingId}","booking",2)
                .then()
                    .log()
                    .all();
    }
}
