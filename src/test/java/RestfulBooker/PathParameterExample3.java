package RestfulBooker;

import io.restassured.RestAssured;

public class PathParameterExample3 {
    public static void main(String[] args) {
        RestAssured
                .given()
                .log()
                .all()
                .pathParam("basePath","booking")
                
                .when()
                    .get("https://restful-booker.herokuapp.com/{basePath}/{bookingId}",2)
                .then()
                    .log()
                    .all();
    }
}
