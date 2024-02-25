import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class C9_Get_TestYaparkenTekrarlardanKurtulma {

          /*
 https://restful-booker.herokuapp.com/booking/10 url'ine bir GET request
 gönderdiğimizde dönen Response'un ,
 status codeun 200,
 ve content type ın application/json,
ve reponse bodysindeki
 "firstname" in "Susan",
 "lastname"nin "Jones"
 "totalprice"in 1000 den küçük olduğunu,
 "depositpaid"in false olduğunu,
 ve "additionalneeds"in null olduğunu test ediniz.
        */
@Test
    public void test01(){
    //1- endpoit ve request body hazırla
    String url="https://restful-booker.herokuapp.com/booking/10";

    //2- Expected body oluştur
    //3- Request gönder ve dönen responsu kaydet
    Response response=given()
            .when()
            .get(url);

    //Assertion
    response.prettyPrint();
    response.then().assertThat()
            .statusCode(200)
            .contentType(ContentType.JSON)
            .body("firstname",equalTo("Susan"),
                    "lastname",equalTo("Jones"),
                    "totalprice",lessThan(1000),
                    "depositpaid",equalTo(false),
                    "additionalneeds",nullValue());
    //biz yukarda import static org.hamcrest.Matchers.*; diyerek Matchers classından gelen
    //tüm methodları classa import etmiş olduk.

}

}
