import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C8_Post_ResponseBodyTesti {
    /*
    https://jsonplaceholder.typicode.com/posts url'ine aşağıdaki body ile bir POST request gönderdiğimizde
    {
    "title":"API",
    "body" : "API öğrenmek ne güzel",
    "userId" : 10,
    } dönen responsenin
    status code'nun 200,
    content type'nin application/json
    response Bodysindeki
    "title" in "API" olduğunu
    "userId" değerinin 100'den küçük olduğunnu
    "body"nin "API" kelimesi içerdiğini test edin
     */
    @Test
    public void test01() {

        //1- endpoit ve request body hazırla
        String url = "https://jsonplaceholder.typicode.com/posts ";

        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "API");
        requestBody.put("body", "API öğrenmek ne güzel");
        requestBody.put("userId", 10);

        //2- Expected body oluştur
        //3- Request gönder ve dönen responsu kaydet
        Response response = given().contentType(ContentType.JSON)
                .when().body(requestBody.toString())
                .post(url);

        //Assertion
        response
                .then()
                .assertThat()
                .statusCode(201)
                .contentType(ContentType.JSON)
                .body("title", Matchers.equalTo("API"))
                .body("userId", Matchers.lessThan(100))
                .body("body", Matchers.containsString("API"));

    }


}
