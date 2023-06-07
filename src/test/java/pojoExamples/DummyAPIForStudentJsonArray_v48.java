package pojoExamples;

import com.beust.ah.A;
import io.restassured.RestAssured;

import java.util.ArrayList;
import java.util.List;

public class DummyAPIForStudentJsonArray_v48 {
    public static void main(String[] args) {

        Student_v48 s1= new Student_v48();
        s1.setBalance(20.34);
        s1.setAccountNo(111);
        s1.setEmail("abc@gmail.com");
        s1.setGender("male");
        s1.setFirst_name("mahesh");
        s1.setLast_name("goda");

        Student_v48 s2= new Student_v48();
        s2.setBalance(21.34);
        s2.setAccountNo(122);
        s2.setEmail("ac@gmail.com");
        s2.setGender("male");
        s2.setFirst_name("mash");
        s2.setLast_name("goda");

        List<Student_v48> jsonArrayStudent=new ArrayList<>();
        jsonArrayStudent.add(s1);
        jsonArrayStudent.add(s2);
        RestAssured.given().log().all().body(jsonArrayStudent).when().get();
    }
}
