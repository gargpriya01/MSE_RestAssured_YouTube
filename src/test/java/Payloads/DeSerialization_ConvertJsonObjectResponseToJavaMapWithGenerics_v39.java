package Payloads;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

import java.util.Map;

public class DeSerialization_ConvertJsonObjectResponseToJavaMapWithGenerics_v39 {
    public static void main(String[] args) {

        Map<String,Object> jsonResponseAsMap=RestAssured.get("https://run.mocky.io/v3/50d71ebc-2e75-4793-a0f0-4b4b47cf89b0")
                .as(new TypeRef<Map<String,Object>>() {
                });
        String firstname=(String) jsonResponseAsMap.get("first_name");
        System.out.println(firstname);
        System.out.println(jsonResponseAsMap);
        jsonResponseAsMap.keySet().forEach(k-> System.out.println(k));

    }
}
