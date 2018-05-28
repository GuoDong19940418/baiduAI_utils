package my.utils;

import com.baidu.aip.ocr.AipOcr;
import my.entity.IDcard;
import org.json.JSONObject;

import java.util.HashMap;

public class IDcardUtil {
    //设置APPID/AK/SK
    public static final String APP_ID = "";
    public static final String API_KEY = "";
    public static final String SECRET_KEY = "";

    /**
     * 验证正面
     * @param imagePath
     * @return
     */
    public static IDcard front(String imagePath) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("detect_direction", "true");
        options.put("detect_risk", "false");

        String idCardSide = "front";

        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        //client.setConnectionTimeoutInMillis(2000);
        //client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
        //client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
        //client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
        //System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

        // 调用接口
        // String image = "/root/Pictures/webwxgetmsgimg.jpg";
        JSONObject res = client.idcard(imagePath, idCardSide,options);
        IDcard iDcard = new IDcard();
        iDcard.setName(IDcardUtilUtil.get(res,"姓名"));
        iDcard.setNation(IDcardUtilUtil.get(res,"民族"));
        iDcard.setAddress(IDcardUtilUtil.get(res,"住址"));
        iDcard.setCitizenshipNum(IDcardUtilUtil.get(res,"公民身份号码"));
        iDcard.setBirthday(IDcardUtilUtil.get(res,"出生"));
        iDcard.setSex(IDcardUtilUtil.get(res,"性别"));

        return iDcard;
    }

    /**
     * 验证正面
     * @param imagePath
     * @return
     */
    public static IDcard back(String imagePath) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("detect_direction", "true");
        options.put("detect_risk", "false");

        String idCardSide = "back";

        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        //client.setConnectionTimeoutInMillis(2000);
        //client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
        //client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
        //client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
        //System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

        // 调用接口
        // String image = "/root/Pictures/webwxgetmsgimg2.jpg";
        JSONObject res = client.idcard(imagePath, idCardSide,options);
        IDcard iDcard = new IDcard();
        iDcard.setExpirationDate(IDcardUtilUtil.get(res,"失效日期"));
        iDcard.setIssuingOrganization(IDcardUtilUtil.get(res,"签发机关"));
        iDcard.setIssuingDate(IDcardUtilUtil.get(res,"签发日期"));
        return iDcard;
    }

//    public static void main(String[] args) {
//        // 传入可选参数调用接口
//        HashMap<String, String> options = new HashMap<String, String>();
//        options.put("detect_direction", "true");
//        options.put("detect_risk", "false");
//
//        String idCardSide = "back";
//
//        // 初始化一个AipOcr
//        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
//
//        // 可选：设置网络连接参数
//        //client.setConnectionTimeoutInMillis(2000);
//        //client.setSocketTimeoutInMillis(60000);
//
//        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        //client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//        //client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理
//
//        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
//        // 也可以直接通过jvm启动参数设置此环境变量
//        //System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");
//
//        // 调用接口
//        String image = "/root/Pictures/webwxgetmsgimg2.jpg";
//        JSONObject res = client.idcard(image, idCardSide,options);
//
//        System.out.println(res.toString(2));
//    }
}
