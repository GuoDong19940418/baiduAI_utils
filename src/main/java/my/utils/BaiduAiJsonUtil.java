package my.utils;

import org.json.JSONObject;

/**
 * 获取身份证信息依赖工具
 */
public class BaiduAiJsonUtil {
    public static String get(JSONObject json,String key){
        return json.getJSONObject("words_result").getJSONObject(key).getString("words");
    }
}
