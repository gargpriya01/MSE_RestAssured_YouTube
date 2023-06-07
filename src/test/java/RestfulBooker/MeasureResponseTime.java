package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

import java.util.concurrent.TimeUnit;

public class MeasureResponseTime {
    public static void main(String[] args) {

        //Build Request
       /* RequestSpecification requestSpecification=RestAssured.given().log().all();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking");*/

       // RequestSpecification requestSpecification=
                Response response=RestAssured
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
                    "\"checkout\" : \"2023-05-18\",\r\n"+
        "},\r\n"+
        "\"additionalneeds\" : \"Lunch\"\r\n"+
"}")
                        .contentType(ContentType.JSON)
                        .post();

                long responseTimeInMS = response.time();
        System.out.println("response time in MS: "+ responseTimeInMS);
        long responseTimeInSeconds=response.timeIn(TimeUnit.SECONDS);
        System.out.println("response time in seconds: "+responseTimeInSeconds);

        long responseTimeInMS1 = response.getTime();
        System.out.println("response time in MS1: "+ responseTimeInMS);
        long responseTimeInSeconds1=response.getTimeIn(TimeUnit.SECONDS);
        System.out.println("response time in seconds 1: "+responseTimeInSeconds);

        response.then().time(Matchers.lessThan(5000L));
        response.then().time(Matchers.greaterThan(2000L));
        response.then().time(Matchers.both(Matchers.greaterThan(2000L)).and(Matchers.lessThan(5000L)));
        response.then().time(Matchers.lessThan(2L),TimeUnit.SECONDS);
        //hit request and get response
        //Response response=requestSpecification.post();

        //validate response
     //  ValidatableResponse validatableResponse= response.then().log().all();
       // validatableResponse.statusCode(200);
    }
}
