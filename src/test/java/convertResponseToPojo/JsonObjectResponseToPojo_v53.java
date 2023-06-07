package convertResponseToPojo;

import io.restassured.RestAssured;

public class JsonObjectResponseToPojo_v53 {
    public static void main(String[] args) {
        Employee_v53 employee=RestAssured.get("https://run.mocky.io/v3/d35374ef-6e88-463f-9d42-efad3141ccfe")
                .as(Employee_v53.class);
    int age=employee.getAge();
        System.out.println(age);
    }
}
