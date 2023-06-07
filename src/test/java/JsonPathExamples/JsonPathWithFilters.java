package JsonPathExamples;

import io.restassured.path.json.JsonPath;

import java.io.File;
import java.util.List;

public class JsonPathWithFilters {
    public static void main(String[] args) {
        String filePath=System.getProperty("user.dir")+"//src//test//java//JsonPathExamples//People.json";
        System.out.println(filePath);
        File jsonArrayFile=new File(filePath);

        JsonPath jsonPath = new JsonPath(jsonArrayFile);

        System.out.println(jsonPath.getString("[0].first_name"));
        List<String> allFirstNames=jsonPath.getList("first_name");
        System.out.println(allFirstNames);

        List<String> allFemalesFirstNames=jsonPath.getList("findAll{it.gender=='Female'}.first_name");
        System.out.println(allFemalesFirstNames);

       String emailId= jsonPath.getString("find{it.first_name=='Priyanka' & it.last_name=='Garg'}.email");
        System.out.println(emailId);

       List<String> allEmailId= jsonPath.getList("findAll{it.first_name=='Priya' | it.last_name=='Garg'}.email");
        System.out.println(allEmailId);

        System.out.println(jsonPath.getList("findAll{it.id>=5}.first_name"));

        System.out.println(jsonPath.getInt("size()"));

    }
}
