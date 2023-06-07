package JsonPathExamples;

import io.restassured.path.json.JsonPath;

public class JsonPathForSimpleJsonArray {
    public static void main(String[] args) {
        String jsonArray = "[\r\n" +
                " \"10\",\r\n"+
                " \"20\", \r\n"+
                "]";
        JsonPath jsonPath=new JsonPath(jsonArray);
        System.out.println(jsonPath.getString("[0]"));
        System.out.println(jsonPath.getList("$").size());
    }
}
