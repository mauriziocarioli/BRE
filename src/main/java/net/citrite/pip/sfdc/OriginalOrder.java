package net.citrite.pip.sfdc;

import java.io.Serializable;
import java.util.Date;

public class OriginalOrder implements Serializable {

    private static final long serialVersionUID = 6004403973882986618L;
       
    private Date Creation_Date;
    private Date PO_Date;
    private Date Document_Date;

    public Date getCreation_Date() {
        return this.Creation_Date;
    }

    public void setCreation_Date(Date Creation_Date) {
        this.Creation_Date = Creation_Date;
    }

    public Date getPO_Date() {
        return this.PO_Date;
    }

    public void setPO_Date(Date PO_Date) {
        this.PO_Date = PO_Date;
    }

    public Date getDocument_Date() {
        return this.Document_Date;
    }

    public void setDocument_Date(Date Document_Date) {
        this.Document_Date = Document_Date;
    }

    public OriginalOrder(Date Creation_Date, Date PO_Date, Date Document_Date) {
        this.Creation_Date = Creation_Date;
        this.PO_Date = PO_Date;
        this.Document_Date = Document_Date;
    }

    public OriginalOrder() {
    }

}