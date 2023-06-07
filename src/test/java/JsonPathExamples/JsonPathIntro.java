package JsonPathExamples;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class JsonPathIntro {

    @Test
    public void jsonPathDemo(){
        String json = "{\r\n"+
                "  \"firstname\" : \"Sushant\",\r\n"+
                "\"lastname\" : \"Garg\",\r\n"+"}";


//get json path instance of given json document
        JsonPath jsonPath = new JsonPath(json);
        String firstName=jsonPath.getString("firstname");
        System.out.println(firstName);

        Object fname=jsonPath.get("firstname");
        System.out.println(fname);

        // root node - it will exact same json to us
        System.out.println((Object)jsonPath.get("$"));
        System.out.println(jsonPath.getString("$"));  //O/p : [firstname:Sushant, lastname:Garg]
        System.out.println(jsonPath.getString(""));   //O/p : [firstname:Sushant, lastname:Garg]
        System.out.println((Object)jsonPath.get());


    }

}
