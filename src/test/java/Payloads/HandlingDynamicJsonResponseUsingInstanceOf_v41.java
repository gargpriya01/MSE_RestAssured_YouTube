package Payloads;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class HandlingDynamicJsonResponseUsingInstanceOf_v41 {
    public static void main(String[] args) {
        Response response=RestAssured.get("https://run.mocky.io/v3/3f76e3b6-c890-45d8-ac7e-607792741bfc");
       Object responseAsObject= response.as(Object.class);
        if (responseAsObject instanceof List) {

            List responseAsList=(List) responseAsObject;
            System.out.println(responseAsList.size());
        } else if (responseAsObject instanceof Map) {
            Map responseAsMap=(Map) responseAsObject;
            System.out.println(((Map) responseAsObject).keySet());
        }
    }
}
