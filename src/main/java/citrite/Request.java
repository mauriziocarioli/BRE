package citrite;

import java.io.Serializable;
import java.util.List;

public class Request implements Serializable {

	private static final long serialVersionUID = -1524280697031891812L;
	
	private Order Order;
	private RewardRegistration RewardRegistration;
	private PartnerInfo PartnerInfo;
	private PartnerFunctions PartnerFunctions;
	private OriginalOrder OriginalOrder;
	private List<String> SalesExceptions;
	private List<AuthorizationItem> ProductAuthorizations;
	private EndUserInfo EndUserInfo;
	private List<Specialization> Specializations;

	public Order getOrder() {
		return this.Order;
	}

	public void setOrder(Order Order) {
		this.Order = Order;
	}

	public RewardRegistration getRewardRegistration() {
		return this.RewardRegistration;
	}

	public void setRewardRegistration(RewardRegistration RewardRegistration) {
		this.RewardRegistration = RewardRegistration;
	}

	public PartnerInfo getPartnerInfo() {
		return this.PartnerInfo;
	}

	public void setPartnerInfo(PartnerInfo PartnerInfo) {
		this.PartnerInfo = PartnerInfo;
	}

	public PartnerFunctions getPartnerFunctions() {
		return this.PartnerFunctions;
	}

	public void setPartnerFunctions(PartnerFunctions PartnerFunctions) {
		this.PartnerFunctions = PartnerFunctions;
	}

	public OriginalOrder getOriginalOrder() {
		return this.OriginalOrder;
	}

	public void setOriginalOrder(OriginalOrder OriginalOrder) {
		this.OriginalOrder = OriginalOrder;
	}

	public List<String> getSalesExceptions() {
		return this.SalesExceptions;
	}

	public void setSalesExceptions(List<String> SalesExceptions) {
		this.SalesExceptions = SalesExceptions;
	}

	public List<AuthorizationItem> getProductAuthorizations() {
		return this.ProductAuthorizations;
	}

	public void setProductAuthorizations(List<AuthorizationItem> ProductAuthorizations) {
		this.ProductAuthorizations = ProductAuthorizations;
	}

	public EndUserInfo getEndUserInfo() {
		return this.EndUserInfo;
	}

	public void setEndUserInfo(EndUserInfo EndUserInfo) {
		this.EndUserInfo = EndUserInfo;
	}

	public List<Specialization> getSpecializations() {
		return this.Specializations;
	}

	public void setSpecializations(List<Specialization> Specializations) {
		this.Specializations = Specializations;
	}

	public Request(Order Order, RewardRegistration RewardRegistration, PartnerInfo PartnerInfo, PartnerFunctions PartnerFunctions, OriginalOrder OriginalOrder, List<String> SalesExceptions, List<AuthorizationItem> ProductAuthorizations, EndUserInfo EndUserInfo, List<Specialization> Specializations) {
		this.Order = Order;
		this.RewardRegistration = RewardRegistration;
		this.PartnerInfo = PartnerInfo;
		this.PartnerFunctions = PartnerFunctions;
		this.OriginalOrder = OriginalOrder;
		this.SalesExceptions = SalesExceptions;
		this.ProductAuthorizations = ProductAuthorizations;
		this.EndUserInfo = EndUserInfo;
		this.Specializations = Specializations;
	}

	public Request() {
	}

}
