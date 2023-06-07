package convertResponseToPojo;

import io.restassured.RestAssured;

public class ConvertSimpleJsonArrayResponseToPojo_v56 {
    public static void main(String[] args) {
        Address_v54[] addresses=RestAssured.get("https://run.mocky.io/v3/8176db37-27e3-444b-b641-75e62a1a1dc5")
                .as(Address_v54[].class);
        System.out.println("No of addresses:"+ addresses.length);
        System.out.println(addresses[0].getCity());
        System.out.println(addresses[1].getCity());
    }
}
