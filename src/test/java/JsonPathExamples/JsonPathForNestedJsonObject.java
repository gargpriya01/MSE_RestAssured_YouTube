package JsonPathExamples;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class JsonPathForNestedJsonObject {

    @Test
    public void jsonPathDemo(){
        String json = "{\r\n"+
                "  \"firstname\" : \"Sushant\",\r\n"+
                "\"lastname\" : \"Garg\",\r\n"+
                "\"age\" : 28,\r\n"+
                "\"address\" : {\r\n"+
        "\"flatNo\":401,\r\n"+"},\r\n"+
                "\"salary\" : 10.50,\r\n"+
                "\"married\" : false,\r\n"+
                "}";

        JsonPath jsonPath=new JsonPath(json);

       int flatNo = jsonPath.getInt("address.flatNo");
        System.out.println(flatNo);



    }

}
