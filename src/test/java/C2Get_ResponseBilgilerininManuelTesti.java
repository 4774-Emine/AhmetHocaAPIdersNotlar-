import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C2Get_ResponseBilgilerininManuelTesti {
    @Test
    public void test01(){
       /*
 https://restful-booker.herokuapp.com/booking/10 url'ine bir GET request
 gönderdiğimizde dönen Response'un ,
 status codeun 200,
 ve content type ın application/json; charset=utf-8,
 ve server isimli Header in değerinin Cowboy,
 ve status Linein HTTP/1.1 200 OK
 ve response süresinin 5 sn den kısa olduğunu manuelolarak test ediniz.
        */


        //1- gerekli body ve endpoint hazırla

        String url= "https://restful-booker.herokuapp.com/booking/10";

        //2- expected body oluştur (soruda body oluşturmamıza gerek yok)
        //3- request gönder ve dönen responsu kaydet
        Response response=given().when().get(url);
        System.out.println("status code= " + response.getStatusCode());
        System.out.println("Content type = " + response.getContentType());
        System.out.println("response.getHeader(\"Server\") = " + response.getHeader("Server"));
        System.out.println("response.getStatusLine() = " + response.getStatusLine());
        System.out.println("time() = " + response.getTime());

        //4- Assertion





    }





}
