package citrite;

import java.io.Serializable;

public class AuthorizationItem implements Serializable {

    private static final long serialVersionUID = -1653744350499309189L;
        
    private String Product_Line_ID;
    private String Cert_Status;

    public String getProduct_Line_ID() {
        return this.Product_Line_ID;
    }

    public void setProduct_Line_ID(String Product_Line_ID) {
        this.Product_Line_ID = Product_Line_ID;
    }

    public String getCert_Status() {
        return this.Cert_Status;
    }

    public void setCert_Status(String Cert_Status) {
        this.Cert_Status = Cert_Status;
    }

    public AuthorizationItem(String Product_Line_ID, String Cert_Status) {
        this.Product_Line_ID = Product_Line_ID;
        this.Cert_Status = Cert_Status;
    }

    public AuthorizationItem() {
    }

}    