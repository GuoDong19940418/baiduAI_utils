package my.entity;

/**
 * 营业执照信息实体类
 */
public class BusinessLicense {
    //社会信用代码
    private String socialCreditCode;
    //法人
    private String legalPerson;
    //成立日期
    private String establishmentData;
    //证件编号
    private String iDnumber;
    //地址
    private String address;
    //单位名称
    private String UnitName;
    //有效期
    private String validityData;

    public String getSocialCreditCode() {
        return socialCreditCode;
    }

    public void setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getEstablishmentData() {
        return establishmentData;
    }

    public void setEstablishmentData(String establishmentData) {
        this.establishmentData = establishmentData;
    }

    public String getiDnumber() {
        return iDnumber;
    }

    public void setiDnumber(String iDnumber) {
        this.iDnumber = iDnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUnitName() {
        return UnitName;
    }

    public void setUnitName(String unitName) {
        UnitName = unitName;
    }

    public String getValidityData() {
        return validityData;
    }

    public void setValidityData(String validityData) {
        this.validityData = validityData;
    }
}
