package pojoExamples;

import io.restassured.RestAssured;

public class DummyAPIForStudent_v48 {
    public static void main(String[] args) {

        Student_v48 s1= new Student_v48();
        s1.setBalance(20.34);
        s1.setAccountNo(111);
        s1.setEmail("abc@gmail.com");
        s1.setGender("male");
        s1.setFirst_name("mahesh");
        s1.setLast_name("goda");

        RestAssured.given().log().all().body(s1).when().get();
    }
}
