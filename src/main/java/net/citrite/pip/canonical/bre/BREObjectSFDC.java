package net.citrite.pip.canonical.bre;

import java.io.Serializable;
import java.util.List;
import net.citrite.pip.bre.Validation;
import net.citrite.pip.sfdc.Request;
import net.citrite.pip.sfdc.Info;

public class BREObjectSFDC implements Serializable {

	private static final long serialVersionUID = 5484795051075805077L;
	
	private Request Request;
	private Info Info;
	private List<Validation> Validations;
	private String Payout;

	public Request getRequest() {
		return this.Request;
	}

	public void setRequest(Request Request) {
		this.Request = Request;
	}

	public Info getInfo() {
		return this.Info;
	}

	public void setInfo(Info Info) {
		this.Info = Info;
	}

	public List<Validation> getValidations() {
		return this.Validations;
	}

	public void setValidations(List<Validation> Validations) {
		this.Validations = Validations;
	}

	public String getPayout() {
		return this.Payout;
	}

	public void setPayout(String Payout) {
		this.Payout = Payout;
	}

	public BREObjectSFDC(Request Request, Info Info, List<Validation> Validations, String Payout) {
		this.Request = Request;
		this.Info = Info;
		this.Validations = Validations;
		this.Payout = Payout;
	}

	public BREObjectSFDC() {
	}

}