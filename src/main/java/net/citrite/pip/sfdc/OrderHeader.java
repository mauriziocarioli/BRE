package net.citrite.pip.sfdc;

import java.io.Serializable;
import java.util.Date;

public class OrderHeader implements Serializable {

	private static final long serialVersionUID = -1296275024467763333L;
	
	private String Order_Type;
	private String Order_ID;
	private Double Order_Amount;
	private String Award_Type;
	private String Contract_Type;
	private String Contract_Level;
	private String Contract_No;
	private Date Order_Creation_Date;
	private Date Order_Matched_Date;
	private String Matched_Registration_ID;
	private Boolean Shared_Reward_Flag;
	private Boolean New_Customer_Flag;
	private Date PO_Date;
	private String PO_Number;
	private String Validation_Status;
	private String Failure_Reasons;
	private Double Total_Partner_Eligible_Amount;
	private Double Total_Promo_Amount;
	private Double Total_Base_Amount;
	private Double OrderDiscounts;
	private String distribution_Channel;

	public String getOrder_Type() {
		return this.Order_Type;
	}

	public void setOrder_Type(String Order_Type) {
		this.Order_Type = Order_Type;
	}

	public String getOrder_ID() {
		return this.Order_ID;
	}

	public void setOrder_ID(String Order_ID) {
		this.Order_ID = Order_ID;
	}

	public Double getOrder_Amount() {
		return this.Order_Amount;
	}

	public void setOrder_Amount(Double Order_Amount) {
		this.Order_Amount = Order_Amount;
	}

	public String getAward_Type() {
		return this.Award_Type;
	}

	public void setAward_Type(String Award_Type) {
		this.Award_Type = Award_Type;
	}

	public String getContract_Type() {
		return this.Contract_Type;
	}

	public void setContract_Type(String Contract_Type) {
		this.Contract_Type = Contract_Type;
	}

	public String getContract_Level() {
		return this.Contract_Level;
	}

	public void setContract_Level(String Contract_Level) {
		this.Contract_Level = Contract_Level;
	}

	public String getContract_No() {
		return this.Contract_No;
	}

	public void setContract_No(String Contract_No) {
		this.Contract_No = Contract_No;
	}

	public Date getOrder_Creation_Date() {
		return this.Order_Creation_Date;
	}

	public void setOrder_Creation_Date(Date Order_Creation_Date) {
		this.Order_Creation_Date = Order_Creation_Date;
	}

	public Date getOrder_Matched_Date() {
		return this.Order_Matched_Date;
	}

	public void setOrder_Matched_Date(Date Order_Matched_Date) {
		this.Order_Matched_Date = Order_Matched_Date;
	}

	public String getMatched_Registration_ID() {
		return this.Matched_Registration_ID;
	}

	public void setMatched_Registration_ID(String Matched_Registration_ID) {
		this.Matched_Registration_ID = Matched_Registration_ID;
	}

	public Boolean isShared_Reward_Flag() {
		return this.Shared_Reward_Flag;
	}

	public Boolean getShared_Reward_Flag() {
		return this.Shared_Reward_Flag;
	}

	public void setShared_Reward_Flag(Boolean Shared_Reward_Flag) {
		this.Shared_Reward_Flag = Shared_Reward_Flag;
	}

	public Boolean isNew_Customer_Flag() {
		return this.New_Customer_Flag;
	}

	public Boolean getNew_Customer_Flag() {
		return this.New_Customer_Flag;
	}

	public void setNew_Customer_Flag(Boolean New_Customer_Flag) {
		this.New_Customer_Flag = New_Customer_Flag;
	}

	public Date getPO_Date() {
		return this.PO_Date;
	}

	public void setPO_Date(Date PO_Date) {
		this.PO_Date = PO_Date;
	}

	public String getPO_Number() {
		return this.PO_Number;
	}

	public void setPO_Number(String PO_Number) {
		this.PO_Number = PO_Number;
	}

	public String getValidation_Status() {
		return this.Validation_Status;
	}

	public void setValidation_Status(String Validation_Status) {
		this.Validation_Status = Validation_Status;
	}

	public String getFailure_Reasons() {
		return this.Failure_Reasons;
	}

	public void setFailure_Reasons(String Failure_Reasons) {
		this.Failure_Reasons = Failure_Reasons;
	}

	public Double getTotal_Partner_Eligible_Amount() {
		return this.Total_Partner_Eligible_Amount;
	}

	public void setTotal_Partner_Eligible_Amount(Double Total_Partner_Eligible_Amount) {
		this.Total_Partner_Eligible_Amount = Total_Partner_Eligible_Amount;
	}

	public Double getTotal_Promo_Amount() {
		return this.Total_Promo_Amount;
	}

	public void setTotal_Promo_Amount(Double Total_Promo_Amount) {
		this.Total_Promo_Amount = Total_Promo_Amount;
	}

	public Double getTotal_Base_Amount() {
		return this.Total_Base_Amount;
	}

	public void setTotal_Base_Amount(Double Total_Base_Amount) {
		this.Total_Base_Amount = Total_Base_Amount;
	}

	public Double getOrderDiscounts() {
		return this.OrderDiscounts;
	}

	public void setOrderDiscounts(Double OrderDiscounts) {
		this.OrderDiscounts = OrderDiscounts;
	}

	public String getDistribution_Channel() {
		return this.distribution_Channel;
	}

	public void setDistribution_Channel(String distribution_Channel) {
		this.distribution_Channel = distribution_Channel;
	}


	public OrderHeader(String Order_Type, String Order_ID, Double Order_Amount, String Award_Type, String Contract_Type, String Contract_Level, String Contract_No, Date Order_Creation_Date, Date Order_Matched_Date, String Matched_Registration_ID, Boolean Shared_Reward_Flag, Boolean New_Customer_Flag, Date PO_Date, String PO_Number, String Validation_Status, String Failure_Reasons, Double Total_Partner_Eligible_Amount, Double Total_Promo_Amount, Double Total_Base_Amount, Double OrderDiscounts, String distribution_Channel) {
		this.Order_Type = Order_Type;
		this.Order_ID = Order_ID;
		this.Order_Amount = Order_Amount;
		this.Award_Type = Award_Type;
		this.Contract_Type = Contract_Type;
		this.Contract_Level = Contract_Level;
		this.Contract_No = Contract_No;
		this.Order_Creation_Date = Order_Creation_Date;
		this.Order_Matched_Date = Order_Matched_Date;
		this.Matched_Registration_ID = Matched_Registration_ID;
		this.Shared_Reward_Flag = Shared_Reward_Flag;
		this.New_Customer_Flag = New_Customer_Flag;
		this.PO_Date = PO_Date;
		this.PO_Number = PO_Number;
		this.Validation_Status = Validation_Status;
		this.Failure_Reasons = Failure_Reasons;
		this.Total_Partner_Eligible_Amount = Total_Partner_Eligible_Amount;
		this.Total_Promo_Amount = Total_Promo_Amount;
		this.Total_Base_Amount = Total_Base_Amount;
		this.OrderDiscounts = OrderDiscounts;
		this.distribution_Channel = distribution_Channel;
	}

	public OrderHeader() {
	}

}