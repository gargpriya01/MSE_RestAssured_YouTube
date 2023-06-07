package DataShare;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TestModule2WithThreadLocalDataMap_v44 {

    @Test(priority=1)
    public void createBooking() {

        int id= RestAssured
                .given()
                .log()
                .all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking")
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
                .post()
                .then()
                .log()
                .all()
                .statusCode(200)
                .extract()
                .jsonPath()
                .getInt("bookingid");

       // DataStoreAsMap.setValue("bookingId",id);

        // way 2
        DataStoreAsMap.setValue(Constants.BOOKING_ID,id);
        System.out.println("Thread id is:---->" + Thread.currentThread().getId() +
                "Created booking id----> "+DataStoreAsMap.getValue(Constants.BOOKING_ID));


    }

        @Test(priority=2)
                public void retrieveBooking() throws InterruptedException {
        Thread.sleep(10000);
            System.out.println("Thread id is:---->" + Thread.currentThread().getId() +
                    "Retrieve booking id----> "+DataStoreAsMap.getValue(Constants.BOOKING_ID));
//int id = (int)DataStoreAsMap.getValue("bookingId");
            //way 2
            int id = (int)DataStoreAsMap.getValue(Constants.BOOKING_ID);
            Response response= RestAssured
                    .given()
                    .log()
                    .all()
                    .contentType(ContentType.JSON)
                    .get("https://restful-booker.herokuapp.com/booking/" + id)
                    .then().log().all().extract().response();
    }
}
