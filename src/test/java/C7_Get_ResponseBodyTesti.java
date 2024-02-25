import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C7_Get_ResponseBodyTesti {
/*
Response body'sindeki değerleri test etmek için
Matchers class'ından yardım alırız.
 */

//https://jsonplaceholder.typicode.com/posts/44 lur'inebir GET request
    //yolladığımızda dönen responsenin
    //status code nun 200,
    //ve content type'nin Application.JSON,
    //ve response bodysinde bulunan userıd'nin 5,
    //ve response bodysinde bulunan title'nin "optio dolor molestias sit"
    //olduğunu test edin.

    @Test
    public void test01(){
        //1- endpoit ve request body hazırla
        String url= "https://jsonplaceholder.typicode.com/posts/44";
        //2- Expected body oluştur
        //3- Request gönder ve dönen responsu kaydet
        Response response= given().when().get(url);

        //4- Assertion
        response.then()
                .assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("userId",Matchers.equalTo(5))
                .body("title",Matchers.equalTo("optio dolor molestias sit"));
    }

}
