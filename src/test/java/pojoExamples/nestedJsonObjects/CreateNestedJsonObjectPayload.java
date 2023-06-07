package pojoExamples.nestedJsonObjects;

import io.restassured.RestAssured;

public class CreateNestedJsonObjectPayload {
    public static void main(String[] args) {
        Employee_v50 employee=new Employee_v50();
        employee.setFirstname("priya");
        employee.setLastname("garg");
        employee.setProfession("Engineer");

        Address_v50 address=new Address_v50();
        address.setHouseNo(404);
        address.setStreetName("Not Found");
        address.setCity("Bengaluru");
        address.setState("KA");
        address.setCountry("India");

        employee.setAddress(address);

        RestAssured.given().log().all().body(employee).post();
    }
}
