package citrite;

import java.io.Serializable;
import java.util.Date;

public class PartnerInfo implements Serializable {

	private static final long serialVersionUID = 7348713232086389645L;
	
	private Tag Tags;
	private String Partner_Type;
	private String Partner_Level;
	private String Partner_Status;
	private String Partner_Geo;
	private String Partner_Area;
	private String Partner_Region;
	private String Partner_Territory;
	private String Partner_Compliance;
	private Date Partner_Mship_Start_Date;
	private Date Partner_Mship_End_Date;
	private Date Partner_Mship_Inception_Date;

	public Tag getTags() {
		return this.Tags;
	}

	public void setTags(Tag Tags) {
		this.Tags = Tags;
	}

	public String getPartner_Type() {
		return this.Partner_Type;
	}

	public void setPartner_Type(String Partner_Type) {
		this.Partner_Type = Partner_Type;
	}

	public String getPartner_Level() {
		return this.Partner_Level;
	}

	public void setPartner_Level(String Partner_Level) {
		this.Partner_Level = Partner_Level;
	}

	public String getPartner_Status() {
		return this.Partner_Status;
	}

	public void setPartner_Status(String Partner_Status) {
		this.Partner_Status = Partner_Status;
	}

	public String getPartner_Geo() {
		return this.Partner_Geo;
	}

	public void setPartner_Geo(String Partner_Geo) {
		this.Partner_Geo = Partner_Geo;
	}

	public String getPartner_Area() {
		return this.Partner_Area;
	}

	public void setPartner_Area(String Partner_Area) {
		this.Partner_Area = Partner_Area;
	}

	public String getPartner_Region() {
		return this.Partner_Region;
	}

	public void setPartner_Region(String Partner_Region) {
		this.Partner_Region = Partner_Region;
	}

	public String getPartner_Territory() {
		return this.Partner_Territory;
	}

	public void setPartner_Territory(String Partner_Territory) {
		this.Partner_Territory = Partner_Territory;
	}

	public String getPartner_Compliance() {
		return this.Partner_Compliance;
	}

	public void setPartner_Compliance(String Partner_Compliance) {
		this.Partner_Compliance = Partner_Compliance;
	}

	public Date getPartner_Mship_Start_Date() {
		return this.Partner_Mship_Start_Date;
	}

	public void setPartner_Mship_Start_Date(Date Partner_Mship_Start_Date) {
		this.Partner_Mship_Start_Date = Partner_Mship_Start_Date;
	}

	public Date getPartner_Mship_End_Date() {
		return this.Partner_Mship_End_Date;
	}

	public void setPartner_Mship_End_Date(Date Partner_Mship_End_Date) {
		this.Partner_Mship_End_Date = Partner_Mship_End_Date;
	}

	public Date getPartner_Mship_Inception_Date() {
		return this.Partner_Mship_Inception_Date;
	}

	public void setPartner_Mship_Inception_Date(Date Partner_Mship_Inception_Date) {
		this.Partner_Mship_Inception_Date = Partner_Mship_Inception_Date;
	}

	public PartnerInfo(Tag Tags, String Partner_Type, String Partner_Level, String Partner_Status, String Partner_Geo, String Partner_Area, String Partner_Region, String Partner_Territory, String Partner_Compliance, Date Partner_Mship_Start_Date, Date Partner_Mship_End_Date, Date Partner_Mship_Inception_Date) {
		this.Tags = Tags;
		this.Partner_Type = Partner_Type;
		this.Partner_Level = Partner_Level;
		this.Partner_Status = Partner_Status;
		this.Partner_Geo = Partner_Geo;
		this.Partner_Area = Partner_Area;
		this.Partner_Region = Partner_Region;
		this.Partner_Territory = Partner_Territory;
		this.Partner_Compliance = Partner_Compliance;
		this.Partner_Mship_Start_Date = Partner_Mship_Start_Date;
		this.Partner_Mship_End_Date = Partner_Mship_End_Date;
		this.Partner_Mship_Inception_Date = Partner_Mship_Inception_Date;
	}

	public PartnerInfo() {
	}

}