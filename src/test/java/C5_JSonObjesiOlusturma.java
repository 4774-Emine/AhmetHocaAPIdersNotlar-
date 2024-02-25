import org.json.JSONObject;
import org.junit.Test;

public class C5_JSonObjesiOlusturma {
    /*
    {
    "firstname": "Susan",
    "lastname": "Smith",
    "totalprice": 1000,
    "depositpaid": false,
    "bookingdates": {
        "checkin": "2021-07-02",
        "checkout": "2022-06-10"
    },
    "additionalneeds": "Breakfast"
}
     */
   @Test
    public void test01(){

       //önce inner Json objesini oluşturalım.
       JSONObject dateJsonObject = new JSONObject();
       dateJsonObject.put("checkin","2021-07-02");
       dateJsonObject.put("checkout","2022-06-10");

       //sonra outer Json objesi oluşturup yeri geldiğinde inner objeyi koyalım.
       JSONObject requestBody= new JSONObject();
       requestBody.put("firstname","Susan");
       requestBody.put("lastname","Smith");
       requestBody.put("totalprice","1000");
       requestBody.put("depositpaid","false");
       requestBody.put("bookingdates",dateJsonObject);
       requestBody.put("additionalneeds","Breakfast");

       System.out.println(requestBody);
   }





}
