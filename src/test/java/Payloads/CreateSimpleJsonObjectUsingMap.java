package Payloads;

import io.restassured.RestAssured;

import java.util.HashMap;
import java.util.Map;

public class CreateSimpleJsonObjectUsingMap {
    public static void main(String[] args) {
        Map<String,String> jsonObjectPayload= new HashMap<>();
        jsonObjectPayload.put("id","1");
        jsonObjectPayload.put("first_name","Amod");
        jsonObjectPayload.put("last_name","Mahajan");
        jsonObjectPayload.put("married","false");
        jsonObjectPayload.put("salary","123.45");
        RestAssured.given().log().all().body(jsonObjectPayload).when().get();
    }
}
