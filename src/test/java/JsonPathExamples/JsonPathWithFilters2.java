package JsonPathExamples;

import io.restassured.path.json.JsonPath;

import java.io.File;
import java.util.List;

public class JsonPathWithFilters2 {
    public static void main(String[] args) {
        String filePath=System.getProperty("user.dir")+"//src//test//java//JsonPathExamples//People1.json";
        System.out.println(filePath);
        File jsonArrayFile=new File(filePath);

        JsonPath jsonPath = new JsonPath(jsonArrayFile);

        System.out.println(jsonPath.getString("data[0].first_name"));


        List<String> allFemalesFirstNames=jsonPath.getList("data.findAll{it.gender=='Female'}.first_name");
        System.out.println(allFemalesFirstNames);



    }
}
