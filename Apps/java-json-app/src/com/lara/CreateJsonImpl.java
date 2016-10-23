package com.lara;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CreateJsonImpl {

	public static void main(String[] args) throws Exception {
      JSONObject mainJson = new JSONObject();
     JSONArray empArr = new JSONArray();
     
     JSONObject json1 = new JSONObject();
     json1.put("name", "Vinod");
     json1.put("salary", 450000);
     
     
     JSONObject json2 = new JSONObject();
     json2.put("name", "ram");
     json2.put("salary", 13000);
     
     JSONObject json3  = new JSONObject();
     json3.put("name", "mahesh");
     json3.put("salary", 5400404);
     
     empArr.put(json1);
     empArr.put(json2);
     empArr.put(json3);
     
     mainJson.put("empArr", empArr);
     
     System.out.println(mainJson);
     System.out.println("------------------");
    int sal =     mainJson.getJSONArray("empArr").getJSONObject(1).getInt("salary");
     
    System.out.println("ram salary:"+sal);
     
	}
}
