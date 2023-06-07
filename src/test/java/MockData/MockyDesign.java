package MockData;

import io.restassured.RestAssured;

public class MockyDesign {
    public static void main(String[] args) {

        RestAssured.given().log().all()
                .get("https://run.mocky.io/v3/50d71ebc-2e75-4793-a0f0-4b4b47cf89b0")
                .then().log().all();
    }
}
