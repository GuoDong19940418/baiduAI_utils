package my.utils;

import org.json.JSONObject;

public class IDcardUtilUtil {
    public static String get(JSONObject json,String key){
        return json.getJSONObject("words_result").getJSONObject(key).getString("words");
    }

}
