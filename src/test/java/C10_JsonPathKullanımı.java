import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class C10_JsonPathKullanımı {

    @Test
    public void test01() {
        //body yi JsonPathExample img e bakarak yapabiliriz.
        //Orada toplamda Array de dahil 5 adet Json Objesi var.
        JSONObject kisiBilgileriJsonObj = new JSONObject();
        JSONObject addressJsonObj = new JSONObject();
        JSONArray telefonBilgileriArry = new JSONArray();
        JSONObject cepTelJsonObj = new JSONObject();
        JSONObject evTelJsonObj = new JSONObject();

        addressJsonObj.put("streetAddres", "naist street");
        addressJsonObj.put("city", "nara");
        addressJsonObj.put("postalCode", "630-0192");

        cepTelJsonObj.put("type", "iPhone");
        cepTelJsonObj.put("number", "0123-4567-8888");
        evTelJsonObj.put("type", "home");
        evTelJsonObj.put("number", "0123-4567-8910");
        telefonBilgileriArry.put(cepTelJsonObj);
        telefonBilgileriArry.put(evTelJsonObj);

        kisiBilgileriJsonObj.put("firstName", "John");
        kisiBilgileriJsonObj.put("lastName", "Doe");
        kisiBilgileriJsonObj.put("age", 26);
        kisiBilgileriJsonObj.put("address", addressJsonObj);
        kisiBilgileriJsonObj.put("phoneNumbers", telefonBilgileriArry);
        System.out.println(kisiBilgileriJsonObj);
        System.out.println("firstname : " + kisiBilgileriJsonObj.get("firstName"));
        System.out.println("lastName : " + kisiBilgileriJsonObj.get("lastName"));

        System.out.println("cadde :" + kisiBilgileriJsonObj
                .getJSONObject("address").get("streetAddres"));
        System.out.println("city : " + kisiBilgileriJsonObj.getJSONObject("address")
                .get("city"));

        System.out.println("cep telefon no :" + kisiBilgileriJsonObj.getJSONArray("phoneNumbers")
                .getJSONObject(0).get("number"));


//burada uzun uzun verileri getirmek yerine
// jsonpath.com'a giderek oradan kolayca ulaşabiliriz.
// Bunu otomasyonda nasıl yapacağımızı bir sonraki derste göreceğiz :)
    }
}
