package Payloads;

import io.restassured.RestAssured;
import io.restassured.specification.ResponseSpecification;

import java.util.*;

public class CreateComplexPayloadUsingMapList {
    public static void main(String[] args) {
        //Parent json array

        List<Map<String,Object>> finalPayload= new ArrayList<Map<String,Object>>();

        Map<String,Object> firstJsonObject = new LinkedHashMap<String,Object>();
        firstJsonObject.put("id",1);
        firstJsonObject.put("first_name","Claire");
        firstJsonObject.put("last_name","Dennerley");
        firstJsonObject.put("email","cdennerley@uol.com.br");
        firstJsonObject.put("gender","Male");

        /*List<String> mobileNo=new ArrayList<String>();
        mobileNo.add("123345679");
        mobileNo.add("123349879");*/

        //or

        List<String> mobileNo = Arrays.asList("13435678898","1342548454");

        firstJsonObject.put("mobile",mobileNo);

        Map<String,Object> skillSet1=new LinkedHashMap<>();
        skillSet1.put("name","Testing");
        skillSet1.put("proficiency","medium");

        firstJsonObject.put("skills",skillSet1);



        Map<String,Object> secondJsonObject = new LinkedHashMap<String,Object>();
        secondJsonObject.put("id",2);
      secondJsonObject.put("first_name","Cloe");
        secondJsonObject.put("last_name","Denney");
      secondJsonObject.put("email","cdenn@uol.com.br");
        secondJsonObject.put("gender","Female");

        List<Map<String,Object>> skillsList = new LinkedList<Map<String,Object>>();
        skillsList.add(skillSet1);

        Map<String,Object> javaSkill = new HashMap<>();
        javaSkill.put("name","java");
        javaSkill.put("proficiency","medium");

        List<String> allCert=Arrays.asList("OCJP 11","OCJP 12");
        javaSkill.put("certifications",allCert);

        skillsList.add(javaSkill);
        secondJsonObject.put("skills",skillsList);
       // secondJsonObject.put("")

        finalPayload.add(firstJsonObject);
        finalPayload.add(secondJsonObject);

        RestAssured.given().log().all().body(finalPayload).when().get();




    }
}
