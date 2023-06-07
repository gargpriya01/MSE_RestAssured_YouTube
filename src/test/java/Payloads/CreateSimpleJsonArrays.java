package Payloads;

import io.restassured.RestAssured;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CreateSimpleJsonArrays {
    public static void main(String[] args) {

        Map<String,Object> empDetails= new LinkedHashMap<>();
        empDetails.put("id",1);
        empDetails.put("first_name","Amod");
        empDetails.put("last_name","Mahajan");
        empDetails.put("married",false);
        empDetails.put("salary",123.45);

        Map<String,Object> emp2Details= new LinkedHashMap<>();
        emp2Details.put("id",2);
        emp2Details.put("first_name","Amodgya");
        emp2Details.put("last_name","Mahajana");
        emp2Details.put("married",false);
        emp2Details.put("salary",120.45);

        List<Map<String,Object>> allEmp = new ArrayList<>();
        allEmp.add(empDetails);
        allEmp.add(emp2Details);
        RestAssured.given().log().all().body(allEmp).when().get();
    }
}
