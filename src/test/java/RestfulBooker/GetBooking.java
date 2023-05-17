package RestfulBooker;

import io.restassured.RestAssured;

public class GetBooking {
    public static void main(String[] args) {


    //build request
    RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com/").basePath("booking/{id}")
            .pathParam("id",1).when().get().then().log().all().statusCode(200);

    //hit the request and get response
    //validate response
}}
