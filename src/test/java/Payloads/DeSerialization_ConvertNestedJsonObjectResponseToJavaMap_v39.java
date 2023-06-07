package Payloads;

import io.restassured.RestAssured;

import java.util.Map;

public class DeSerialization_ConvertNestedJsonObjectResponseToJavaMap_v39 {
    public static void main(String[] args) {

        Map jsonResponseAsMap=RestAssured.get("https://run.mocky.io/v3/70106634-78dd-47e4-aba2-9572747af915")
                .as(Map.class);
        String firstname=(String) jsonResponseAsMap.get("first_name");
        System.out.println(firstname);
        System.out.println(jsonResponseAsMap);
        jsonResponseAsMap.keySet().forEach(k-> System.out.println(k));

       Map<String,String> skillsMap= (Map<String,String>)jsonResponseAsMap.get("skills");
        System.out.println(skillsMap.get("name"));
        System.out.println(skillsMap.get("proficiency"));

    }
}
