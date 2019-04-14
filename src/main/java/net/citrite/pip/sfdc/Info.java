package net.citrite.pip.sfdc;

import java.io.Serializable;
import java.time.LocalDate;

public class Info implements Serializable {

    private static final long serialVersionUID = 6967915924242214318L;
        
    private LocalDate Request_DateTime;
    private LocalDate Response_DateTime;
    private String Status;
    private String Interaction_Id;
    private String Source;

    public LocalDate getRequest_DateTime() {
        return this.Request_DateTime;
    }

    public void setRequest_DateTime(LocalDate Request_DateTime) {
        this.Request_DateTime = Request_DateTime;
    }

    public LocalDate getResponse_DateTime() {
        return this.Response_DateTime;
    }

    public void setResponse_DateTime(LocalDate Response_DateTime) {
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

    public Info(LocalDate Request_DateTime, LocalDate Response_DateTime, String Status, String Interaction_Id, String Source) {
        this.Request_DateTime = Request_DateTime;
        this.Response_DateTime = Response_DateTime;
        this.Status = Status;
        this.Interaction_Id = Interaction_Id;
        this.Source = Source;
    }

    public Info() {
    }
 
}
