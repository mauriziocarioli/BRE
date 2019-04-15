package net.citrite.pip.sfdc;

import java.io.Serializable;
import java.util.Date;

public class Info implements Serializable {

    private static final long serialVersionUID = 6967915924242214318L;
        
    private Date Request_DateTime;
    private Date Response_DateTime;
    private String Status;
    private String Interaction_Id;
    private String Source;

    public Date getRequest_DateTime() {
        return this.Request_DateTime;
    }

    public void setRequest_DateTime(Date Request_DateTime) {
        this.Request_DateTime = Request_DateTime;
    }

    public Date getResponse_DateTime() {
        return this.Response_DateTime;
    }

    public void setResponse_DateTime(Date Response_DateTime) {
        this.Response_DateTime = Response_DateTime;
    }

    public String getStatus() {
        return this.Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getInteraction_Id() {
        return this.Interaction_Id;
    }

    public void setInteraction_Id(String Interaction_Id) {
        this.Interaction_Id = Interaction_Id;
    }

    public String getSource() {
        return this.Source;
    }

    public void setSource(String Source) {
        this.Source = Source;
    }

    public Info(Date Request_DateTime, Date Response_DateTime, String Status, String Interaction_Id, String Source) {
        this.Request_DateTime = Request_DateTime;
        this.Response_DateTime = Response_DateTime;
        this.Status = Status;
        this.Interaction_Id = Interaction_Id;
        this.Source = Source;
    }

    public Info() {
    }
 
}
