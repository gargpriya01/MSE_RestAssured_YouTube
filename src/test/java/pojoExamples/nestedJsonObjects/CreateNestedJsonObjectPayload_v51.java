package pojoExamples.nestedJsonObjects;

import io.restassured.RestAssured;

import java.util.ArrayList;
import java.util.List;

public class CreateNestedJsonObjectPayload_v51 {
    public static void main(String[] args) {
        Employee_v51 employee=new Employee_v51();
        employee.setFirstname("priya");
        employee.setLastname("garg");
        employee.setProfession("Engineer");

        Address_v50 address1=new Address_v50();
        address1.setHouseNo(404);
        address1.setStreetName("Not Found");
        address1.setCity("Bengaluru");
        address1.setState("KA");
        address1.setCountry("India");

        Address_v50 address2=new Address_v50();
        address2.setHouseNo(401);
        address2.setStreetName("Found");
        address2.setCity("Mysore");
        address2.setState("KA");
        address2.setCountry("India");

        List<Address_v50> allAddresses=new ArrayList<>();
        allAddresses.add(address1);
        allAddresses.add(address2);

        employee.setAddress(allAddresses);

        RestAssured.given().log().all().body(employee).post();
    }
}
