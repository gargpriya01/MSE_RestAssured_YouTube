package convertResponseToPojo;

import io.restassured.RestAssured;
import pojoExamples.nestedJsonObjects.Address_v50;

public class NestedJsonObjectToPojo_v54 {
    public static void main(String[] args) {
        EmployeeWithAddress_v54 employee= RestAssured.get("https://run.mocky.io/v3/cdec8027-b397-4ab0-9e93-e6e64e9ae2be")
                .as(EmployeeWithAddress_v54.class);

        String fn=employee.getFirstName();
        System.out.println(fn);

        Address_v54 address=employee.getAddress();
        System.out.println(address.getStreetName());

        System.out.println(employee.getAddress().getCity());
    }
}
