
package projectdemo;

import javafx.beans.property.SimpleStringProperty;

public class CustomerPolicyDetails {
    private SimpleStringProperty cpdcID, pID, pType, cpdAmount;

    public CustomerPolicyDetails(String cpdcID, String pID, String pType, String cpdAmount) {
        this.cpdcID = new SimpleStringProperty(cpdcID);
        this.pID = new SimpleStringProperty(pID);
        this.pType = new SimpleStringProperty(pType);
        this.cpdAmount = new SimpleStringProperty(cpdAmount);
    }

    public String getcpdcID() {
        return cpdcID.get();
    }

    public void setcpdcID(SimpleStringProperty cpdcID) {
        this.cpdcID = cpdcID;
    }

    public String getpID() {
        return pID.get();
    }

    public void setpID(SimpleStringProperty pID) {
        this.pID = pID;
    }

    public String getPType() {
        return pType.get();
    }

    public void setPType(SimpleStringProperty pType) {
        this.pType = pType;
    }

    public String getCPDAmount() {
        return cpdAmount.get();
    }

    public void setCPDAmount(SimpleStringProperty cpdAmount) {
        this.cpdAmount = cpdAmount;
    }
    
    
}
