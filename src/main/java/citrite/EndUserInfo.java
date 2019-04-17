package citrite;

import java.io.Serializable;

public class EndUserInfo implements Serializable {

    private static final long serialVersionUID = -5755168015286412137L;
       
    private String End_User_Org_ID;
    private String End_User_Geo;
    private String End_User_Area;
    private String End_User_Territory;
    private String End_User_Region;   
    private String End_User_Email_Address;    
    private String High_Touch_Flag;


    public String getEnd_User_Org_ID() {
        return this.End_User_Org_ID;
    }

    public void setEnd_User_Org_ID(String End_User_Org_ID) {
        this.End_User_Org_ID = End_User_Org_ID;
    }

    public String getEnd_User_Geo() {
        return this.End_User_Geo;
    }

    public void setEnd_User_Geo(String End_User_Geo) {
        this.End_User_Geo = End_User_Geo;
    }

    public String getEnd_User_Area() {
        return this.End_User_Area;
    }

    public void setEnd_User_Area(String End_User_Area) {
        this.End_User_Area = End_User_Area;
    }

    public String getEnd_User_Territory() {
        return this.End_User_Territory;
    }

    public void setEnd_User_Territory(String End_User_Territory) {
        this.End_User_Territory = End_User_Territory;
    }

    public String getEnd_User_Region() {
        return this.End_User_Region;
    }

    public void setEnd_User_Region(String End_User_Region) {
        this.End_User_Region = End_User_Region;
    }

    public String getEnd_User_Email_Address() {
        return this.End_User_Email_Address;
    }

    public void setEnd_User_Email_Address(String End_User_Email_Address) {
        this.End_User_Email_Address = End_User_Email_Address;
    }

    public String getHigh_Touch_Flag() {
        return this.High_Touch_Flag;
    }

    public void setHigh_Touch_Flag(String High_Touch_Flag) {
        this.High_Touch_Flag = High_Touch_Flag;
    }

    public EndUserInfo(String End_User_Org_ID, String End_User_Geo, String End_User_Area, String End_User_Territory, String End_User_Region, String End_User_Email_Address, String High_Touch_Flag) {
        this.End_User_Org_ID = End_User_Org_ID;
        this.End_User_Geo = End_User_Geo;
        this.End_User_Area = End_User_Area;
        this.End_User_Territory = End_User_Territory;
        this.End_User_Region = End_User_Region;
        this.End_User_Email_Address = End_User_Email_Address;
        this.High_Touch_Flag = High_Touch_Flag;
    }

    public EndUserInfo() {
    }

}