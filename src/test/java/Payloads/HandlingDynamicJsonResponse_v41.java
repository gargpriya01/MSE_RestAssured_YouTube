package Payloads;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Map;

public class HandlingDynamicJsonResponse_v41 {
    public static void main(String[] args) {
        Response response=RestAssured.get("https://run.mocky.io/v3/3f76e3b6-c890-45d8-ac7e-607792741bfc");
       Map responseMap= response.as(Map.class);
        System.out.println(responseMap.keySet());
    }
}
