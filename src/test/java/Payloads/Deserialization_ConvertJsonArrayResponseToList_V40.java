package Payloads;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

import java.util.List;
import java.util.Map;

public class Deserialization_ConvertJsonArrayResponseToList_V40 {
    public static void main(String[] args) {
        List<Map<String,Object>> allEmp=RestAssured.get("https://run.mocky.io/v3/4b200eb5-22d7-48c7-afba-8d7843e5a308")
                //.as(List.class);  --- method 1
        .as(new TypeRef<List<Map<String,Object>>>(){});  //---method 2

        System.out.println(allEmp.size());
        Map<String,Object> emp1= allEmp.get(0);   //--method 2
       // Map<String,Object> emp1=(Map<String, Object>) allEmp.get(0);  //---method 1
        System.out.println(emp1.get("first_name"));
    }
}
