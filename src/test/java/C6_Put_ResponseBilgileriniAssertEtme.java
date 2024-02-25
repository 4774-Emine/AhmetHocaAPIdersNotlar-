import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C6_Put_ResponseBilgileriniAssertEtme {
    /*
    https://jsonplaceholder.typicode.com/posts/70 url ine
    aşağıdaki Json formatındaki body ile bir PUT request gönderdiğimizde

    {
    "userId": 70,
    "id": 700,
    "title": selammm",
    "body": "Merhabaaaa" dönen Respose nin
    status code unun 200,
    ve content type nin application/json; charset=utf-8,
    ve Server isimli Header in değerinin cloudflare,
    ve status Line in HTTP/1.1 200 OK
}
     */


    @Test
    public void test01() {
        //1- endpoit ve request body hazırla
        String url = "https://jsonplaceholder.typicode.com/posts/70";
        JSONObject request = new JSONObject();
        request.put("title", "selammm");
        request.put("userId", "70");
        request.put("id", "700");
        request.put("body", "Merhabaaaa");

        //2- Expected body oluştur
        //3- Request gönder ve dönen responsu kaydet
        Response response = given().contentType(ContentType.JSON)
                .when().body(request.toString()).put(url);

        //4- Assertion

        response.then().assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .header("Server", "cloudflare")
                .statusLine("HTTP/1.1 200 OK");
    }


}
