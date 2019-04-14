package net.citrite.pip.sfdc;

import java.io.Serializable;
import java.time.LocalDate;

public class OriginalOrder implements Serializable {

    private static final long serialVersionUID = 6004403973882986618L;
       
    private LocalDate Creation_Date;
    private LocalDate PO_Date;
    private LocalDate Document_Date;

    public LocalDate getCreation_Date() {
        return this.Creation_Date;
    }

    public void setCreation_Date(LocalDate Creation_Date) {
        this.Creation_Date = Creation_Date;
    }

    public LocalDate getPO_Date() {
        return this.PO_Date;
    }

    public void setPO_Date(LocalDate PO_Date) {
        this.PO_Date = PO_Date;
    }

    public LocalDate getDocument_Date() {
        return this.Document_Date;
    }

    public void setDocument_Date(LocalDate Document_Date) {
        this.Document_Date = Document_Date;
    }

    public OriginalOrder(LocalDate Creation_Date, LocalDate PO_Date, LocalDate Document_Date) {
        this.Creation_Date = Creation_Date;
        this.PO_Date = PO_Date;
        this.Document_Date = Document_Date;
    }

    public OriginalOrder() {
    }

}