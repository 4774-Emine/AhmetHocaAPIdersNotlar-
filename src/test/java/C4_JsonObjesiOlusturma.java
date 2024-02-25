import org.json.JSONObject;
import org.junit.Test;

public class C4_JsonObjesiOlusturma {
   /*
   {
   "title" : "Ahmett",
   "body": "Merhabaaa",
   "userId" : 1
   }
    */
@Test
    public void test01(){

    JSONObject obj1= new JSONObject();
    obj1.put("title","Ahmett");
    obj1.put("body","Merhabaaa");
    obj1.put("userId",1);

    System.out.println(obj1);

}




}
