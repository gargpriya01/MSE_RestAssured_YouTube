package Payloads;

import io.restassured.RestAssured;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CreateNestedJsonObjects {
    public static void main(String[] args) {
        Map<String,Object> payload = new LinkedHashMap<>();
        payload.put("id",1);
        payload.put("first_name","Amod");
        payload.put("last_name","Mahajan");
        payload.put("married",false);
        payload.put("salary",123.45);

        Map<String,Object> addressMap= new HashMap<>();
        addressMap.put("no",81);
        addressMap.put("streetName","404 Not Found");
        addressMap.put("city","BLR");
        addressMap.put("state","KA");

        payload.put("address",addressMap);
        RestAssured.given().log().all().body(payload).when().get();
    }
}
