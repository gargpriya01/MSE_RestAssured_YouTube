package convertResponseToPojo;

import io.restassured.RestAssured;

public class PartOfNestedJsonObjectToPojo_v55 {
    public static void main(String[] args) {
        Address_v54 address= RestAssured.get("https://run.mocky.io/v3/cdec8027-b397-4ab0-9e93-e6e64e9ae2be")
                .jsonPath().getObject("address",Address_v54.class);
        System.out.println(address.getStreetName());
    }
}
