package my.utils;

import com.baidu.aip.ocr.AipOcr;
import my.entity.BusinessLicense;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * 营业执照信息获取
 */
public class BusinessLicenseUtil {

    //设置APPID/AK/SK
    public static final String APP_ID = "";
    public static final String API_KEY = "";
    public static final String SECRET_KEY = "";

    public static BusinessLicense get(String image){

        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();

        // 参数为本地图片路径
        //String image = "/root/Pictures/jeatong.jpg";
        JSONObject res = client.businessLicense(image, options);

        BusinessLicense businessLicense = new BusinessLicense();
        businessLicense.setSocialCreditCode(BaiduAiJsonUtil.get(res,"社会信用代码"));
        businessLicense.setLegalPerson(BaiduAiJsonUtil.get(res,"法人"));
        businessLicense.setEstablishmentData(BaiduAiJsonUtil.get(res,"成立日期"));
        businessLicense.setiDnumber(BaiduAiJsonUtil.get(res,"证件编号"));
        businessLicense.setAddress(BaiduAiJsonUtil.get(res,"地址"));
        businessLicense.setUnitName(BaiduAiJsonUtil.get(res,"单位名称"));
        businessLicense.setValidityData(BaiduAiJsonUtil.get(res,"有效期"));

        return businessLicense;
    }
}
