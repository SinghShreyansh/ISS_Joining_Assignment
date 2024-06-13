package org.example;

import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;


public class Main {
    public static void main(String[] args) {
        JSONObject jsonObject = getJsonObject();
        System.out.println(jsonObject);
        JSONObject dept = jsonObject.getJSONObject("dept");
        System.out.println("dept is "+dept);
        String id = dept.getString("id");
        System.out.println("id is "+id);
        int count = dept.getJSONObject("location").getInt("count");
        System.out.println("count is "+count);
        JSONArray jsonArray = dept.getJSONObject("location").getJSONArray("addresses");
        System.out.println("addresses is "+jsonArray);
        for(int i = 0; i<jsonArray.length();i++){
            JSONObject address = jsonArray.getJSONObject(i);
            System.out.println("address is "+address);
            String state = address.getString("state");
            System.out.println("state is "+state);
        }
        String secondState = jsonArray.getJSONObject(1).getString("state");
        System.out.println("second state is "+secondState );

    }

    private static JSONObject getJsonObject() {
        String jsonString = """
            {"dept": {
                              "id": "tech",
                              "value": "IT",
                              "location": {
                                "count":3,
                                "addresses": [
                                  {"state": "CA"},
                                  {"state": "FL"},
                                  {"state": "OH"}
                                ]
                              }
                            }}
            """;
        JSONObject jsonObject = new JSONObject(jsonString);
        return jsonObject;
    }
}