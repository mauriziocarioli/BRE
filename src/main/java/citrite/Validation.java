package citrite;

import java.io.Serializable;
import java.util.Date;

public class Validation implements Serializable {

    private static final long serialVersionUID = -4509823521117930083L;
        
    private String CheckName;
    private Date CheckDate;
    private String CheckResult;
    private Boolean Header;
    private String OrderID;
    private String CheckType;
    private Boolean MergedStatus;

    public String getCheckName() {
        return this.CheckName;
    }

    public void setCheckName(String CheckName) {
        this.CheckName = CheckName;
    }

    public Date getCheckDate() {
        return this.CheckDate;
    }

    public void setCheckDate(Date CheckDate) {
        this.CheckDate = CheckDate;
    }

    public String getCheckResult() {
        return this.CheckResult;
    }

    public void setCheckResult(String CheckResult) {
        this.CheckResult = CheckResult;
    }

    public Boolean isHeader() {
        return this.Header;
    }

    public Boolean getHeader() {
        return this.Header;
    }

    public void setHeader(Boolean Header) {
        this.Header = Header;
    }

    public String getOrderID() {
        return this.OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getCheckType() {
        return this.CheckType;
    }

    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    public Boolean isMergedStatus() {
        return this.MergedStatus;
    }

    public Boolean getMergedStatus() {
        return this.MergedStatus;
    }

    public void setMergedStatus(Boolean MergedStatus) {
        this.MergedStatus = MergedStatus;
    }

    public Validation(String CheckName, Date CheckDate, String CheckResult, Boolean Header, String OrderID, String CheckType, Boolean MergedStatus) {
        this.CheckName = CheckName;
        this.CheckDate = CheckDate;
        this.CheckResult = CheckResult;
        this.Header = Header;
        this.OrderID = OrderID;
        this.CheckType = CheckType;
        this.MergedStatus = MergedStatus;
    }

    public Validation() {
    }

}