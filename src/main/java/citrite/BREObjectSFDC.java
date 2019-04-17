package citrite;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

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

	public void registerValidation(String orderID, String checkName, String checkType, String checkResult, Boolean header) {
        
        if (Validations == null) {
            this.Validations = new ArrayList<Validation>();
            System.out.println("BRE|BREObjectSFDC.registerValidation> created empty list of validations");
        }
        
        Validation validation = new Validation();
        
        validation.setOrderID(orderID);
        validation.setCheckName(checkName);
        validation.setCheckType(checkType);
        validation.setCheckResult(checkResult);
        validation.setHeader(header);
        validation.setCheckDate(new Date());
        
        this.Validations.add(validation);
        
        System.out.println("BRE|BREObjectSFDC.registerValidation> added validation to list");        
        
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