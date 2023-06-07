package convertResponseToPojo;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

import java.util.List;

public class ConvertSimpleJsonArrayResponseToPojo_v57 {
    public static void main(String[] args) {
        List<Address_v54> addresses=RestAssured.get("https://run.mocky.io/v3/8176db37-27e3-444b-b641-75e62a1a1dc5")
                .as(new TypeRef<List<Address_v54>>() {
                });
        System.out.println("No of addresses:"+ addresses.size());
        System.out.println(addresses.get(0).getCity());
        System.out.println(addresses.get(1).getCity());
    }
}
