package net.citrite.pip.sfdc;

import java.io.Serializable;

public class OrderLineItem implements Serializable {

	private static final long serialVersionUID = 6096103652478769199L;
	
	private String Order_ID;
	private String OrderLine_ID;
	private String Product_Type;
	private String Edition;
	private String SKU_Marketing;
	private String Product_Line_ID;
	private Double Discount_Program;
	private Double Discount_Channel;
	private Double Discount_Program_Amount;
	private Double SRP_USD;
	private Boolean Partner_Incentive_Eligible_Flag;

	public String getOrder_ID() {
		return this.Order_ID;
	}

	public void setOrder_ID(String Order_ID) {
		this.Order_ID = Order_ID;
	}

	public String getOrderLine_ID() {
		return this.OrderLine_ID;
	}

	public void setOrderLine_ID(String OrderLine_ID) {
		this.OrderLine_ID = OrderLine_ID;
	}

	public String getProduct_Type() {
		return this.Product_Type;
	}

	public void setProduct_Type(String Product_Type) {
		this.Product_Type = Product_Type;
	}

	public String getEdition() {
		return this.Edition;
	}

	public void setEdition(String Edition) {
		this.Edition = Edition;
	}

	public String getSKU_Marketing() {
		return this.SKU_Marketing;
	}

	public void setSKU_Marketing(String SKU_Marketing) {
		this.SKU_Marketing = SKU_Marketing;
	}

	public String getProduct_Line_ID() {
		return this.Product_Line_ID;
	}

	public void setProduct_Line_ID(String Product_Line_ID) {
		this.Product_Line_ID = Product_Line_ID;
	}

	public Double getDiscount_Program() {
		return this.Discount_Program;
	}

	public void setDiscount_Program(Double Discount_Program) {
		this.Discount_Program = Discount_Program;
	}

	public Double getDiscount_Channel() {
		return this.Discount_Channel;
	}

	public void setDiscount_Channel(Double Discount_Channel) {
		this.Discount_Channel = Discount_Channel;
	}

	public Double getDiscount_Program_Amount() {
		return this.Discount_Program_Amount;
	}

	public void setDiscount_Program_Amount(Double Discount_Program_Amount) {
		this.Discount_Program_Amount = Discount_Program_Amount;
	}

	public Double getSRP_USD() {
		return this.SRP_USD;
	}

	public void setSRP_USD(Double SRP_USD) {
		this.SRP_USD = SRP_USD;
	}

	public Boolean getPartner_Incentive_Eligible_Flag() {
                return this.Partner_Incentive_Eligible_Flag;
        }

	public void setPartner_Incentive_Eligible_Flag(Boolean flag) {
                this.Partner_Incentive_Eligible_Flag = flag;
        }

	public OrderLineItem(String Order_ID, String OrderLine_ID, String Product_Type, String Edition, String SKU_Marketing, String Product_Line_ID, Double Discount_Program, Double Discount_Channel, Double Discount_Program_Amount, Double SRP_USD) {
		this.Order_ID = Order_ID;
		this.OrderLine_ID = OrderLine_ID;
		this.Product_Type = Product_Type;
		this.Edition = Edition;
		this.SKU_Marketing = SKU_Marketing;
		this.Product_Line_ID = Product_Line_ID;
		this.Discount_Program = Discount_Program;
		this.Discount_Channel = Discount_Channel;
		this.Discount_Program_Amount = Discount_Program_Amount;
		this.SRP_USD = SRP_USD;
	}

	public OrderLineItem() {
	}

}
