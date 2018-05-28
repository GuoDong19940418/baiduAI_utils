package my.entity;

/**
 * 身份证信息实体类
 */
public class IDcard {

    private String name;                //姓名
    private String nation;              //民族
    private String address;             //住址
    private String citizenshipNum;      //身份证号
    private String birthday;            //出生年月日
    private String sex;                 //性别

    private String expirationDate;      //失效日期
    private String issuingOrganization; //签发机关
    private String issuingDate;         //签发日期


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCitizenshipNum() {
        return citizenshipNum;
    }

    public void setCitizenshipNum(String citizenshipNum) {
        this.citizenshipNum = citizenshipNum;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getIssuingOrganization() {
        return issuingOrganization;
    }

    public void setIssuingOrganization(String issuingOrganization) {
        this.issuingOrganization = issuingOrganization;
    }

    public String getIssuingDate() {
        return issuingDate;
    }

    public void setIssuingDate(String issuingDate) {
        this.issuingDate = issuingDate;
    }
}
