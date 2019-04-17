package citrite;

import java.io.Serializable;
import java.util.Map;

public class Specialization implements Serializable {

    private static final long serialVersionUID = -9184570138321925886L;
        
	private String SystemName;
	private String Status;
	private String BRE_Status;
	private Map<String,Object> AddData;

    public String getSystemName() {
        return this.SystemName;
    }

    public void setSystemName(String SystemName) {
        this.SystemName = SystemName;
    }

    public String getStatus() {
        return this.Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getBRE_Status() {
        return this.BRE_Status;
    }

    public void setBRE_Status(String BRE_Status) {
        this.BRE_Status = BRE_Status;
    }

    public Map<String,Object> getAddData() {
        return this.AddData;
    }

    public void setAddData(Map<String,Object> AddData) {
        this.AddData = AddData;
    }

    public Specialization(String SystemName, String Status, String BRE_Status, Map<String,Object> AddData) {
        this.SystemName = SystemName;
        this.Status = Status;
        this.BRE_Status = BRE_Status;
        this.AddData = AddData;
    }

    public Specialization() {
    }

}
