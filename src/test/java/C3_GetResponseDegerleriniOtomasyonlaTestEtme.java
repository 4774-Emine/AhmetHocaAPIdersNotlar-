import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C3_GetResponseDegerleriniOtomasyonlaTestEtme {

           /*
 https://restful-booker.herokuapp.com/booking/10 url'ine bir GET request
 gönderdiğimizde dönen Response'un ,
 status codeun 200,
 ve content type ın application/json; charset=utf-8,
 ve server isimli Header in değerinin Cowboy,
 ve status Linein HTTP/1.1 200 OK
 ve response süresinin 5 sn den kısa olduğunu  test ediniz.
        */

    @Test
    public void test02(){
        //1- Request body ve endpoint hazırlamak
        String url= "https://restful-booker.herokuapp.com/booking/10";

        //2- Expected data hazırlamak
        //3- Request gönderip dönen responsu kaydetme
        Response response=given().when().get(url);

        //4- Assertion işlemleri
        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .header("Server","Cowboy")
                .statusLine("HTTP/1.1 200 OK");





    }
}
