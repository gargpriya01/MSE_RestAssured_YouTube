package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class DefaultHeaderBehaviour {

        @Test
        public void defaultBehaviour()
        {
            RestAssured.given()
                    .header("header1", "value1", "value2")
                    .log()
                    .all()
                    .when()
                    .get();
        }

         @Test
        public void overwriteHeaderValue() {
             RestAssured.given()
                     .config(RestAssured.config()
                             .headerConfig(HeaderConfig
                                     .headerConfig()
                                     .overwriteHeadersWithName("header1", "header2")))
                     .config(RestAssured.config().headerConfig(HeaderConfig.headerConfig().mergeHeadersWithName("header1")))
                     .header("header1", "value1")
                     .header("header1", "value2")
                     .header("header3", "value3")
                     .header("header3", "value4")
                     .header("header2", "value5")
                     .header("header2", "value6")
                     .log()
                     .all()
                     .when()
                     .get();
         }

            @Test
            public void realTimeHeaderOverwrite(){
                 RequestSpecification res1=RestAssured.given()
                         .header("header1","value1");
                 RequestSpecification res2=RestAssured.given()
                         .header("header2","value3")
                         .header("header1","value2");
                 RestAssured.given()
                         .config(RestAssured.config().headerConfig(HeaderConfig.headerConfig().overwriteHeadersWithName("header1")))
                         .spec(res1)
                         .spec(res2)
                         .log()
                         .all()
                         .given()
                         .get();
             }
        }


