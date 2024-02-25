import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C1_GetRequestResponseBodyYazdırma {

    @Test
    public void get01() {

//https://restful-booker.herokuapp.com/booking/10 url'ine bir GET request
// gönderdiğimizde dönen Response'yi yazdırın.


        //1- Request body ve endpoint hazırlamak
        //2- Expected data hazırlamak
        //3- Request gönderip dönen responsu kaydetme
        //4- Assertion işlemleri


        //1- Request body ve endpoint hazırlamak
        String url = "https://restful-booker.herokuapp.com/booking/10";

        //2- Expected data hazırlamak
        //3- Request gönderip dönen responsu kaydetme
        Response response = given().when().get(url);
        response.prettyPrint();

        //4- Assertion işlemleri





    }


}
