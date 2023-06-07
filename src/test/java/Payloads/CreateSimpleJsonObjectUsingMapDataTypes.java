package Payloads;

import io.restassured.RestAssured;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CreateSimpleJsonObjectUsingMapDataTypes {
    public static void main(String[] args) {
        //whatever keys are coming in json are coming in random order .
        // if we want the order of keys in which we have added , we can use Linked hashmap
        //Map<String,Object> jsonObjectPayload= new HashMap<>();
        Map<String,Object> jsonObjectPayload= new LinkedHashMap<>();
        jsonObjectPayload.put("id",1);
        jsonObjectPayload.put("first_name","Amod");
        jsonObjectPayload.put("last_name","Mahajan");
        jsonObjectPayload.put("married",false);
        jsonObjectPayload.put("salary",123.45);
        RestAssured.given().log().all().body(jsonObjectPayload).when().get();
    }
}
