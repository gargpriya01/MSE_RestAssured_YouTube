package JsonPathExamples;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class JsonPathForSimpleJsonObject {

    @Test
    public void jsonPathDemo(){
        String json = "{\r\n"+
                "  \"firstname\" : \"Sushant\",\r\n"+
                "\"lastname\" : \"Garg\",\r\n"+
                "\"age\" : 28,\r\n"+
                "\"address\" : \"India\",\r\n"+
                "\"salary\" : 10.50,\r\n"+
                "\"married\" : false,\r\n"+
                "}";


//get json path instance of given json document
        JsonPath jsonPath = new JsonPath(json);
        String firstName=jsonPath.getString("firstname");
        System.out.println(firstName);

       int age = jsonPath.getInt("age");
        System.out.println(age);

        boolean married = jsonPath.getBoolean("married");
        System.out.println(married);

        float salary = jsonPath.getFloat("salary");
        System.out.println(salary);

        double salaryd = jsonPath.getDouble("salary");
        System.out.println(salaryd);


    }

}
