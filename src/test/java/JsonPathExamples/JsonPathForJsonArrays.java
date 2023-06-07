package JsonPathExamples;

import io.restassured.path.json.JsonPath;

public class JsonPathForJsonArrays {
    public static void main(String[] args) {
        String jsonArray= "";
        JsonPath jsonPath=new JsonPath(jsonArray);
        String city1= jsonPath.getString("[0].address[0].city");
        System.out.println(city1);

        String city2= jsonPath.getString("[1].address[0].city");
        System.out.println(city2);


        System.out.println(jsonPath.getList("[0].address.city"));
        System.out.println(jsonPath.getList("address.city"));
    }
}
