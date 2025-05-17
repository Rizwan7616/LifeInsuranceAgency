
package projectdemo;

import javafx.beans.property.SimpleStringProperty;

public class policyStatus {
    private SimpleStringProperty cPolicyStatusID, cPolicyStatusName, cPolicyStatusAmount ,cPolicyStatusAmountPaid;

    public policyStatus(SimpleStringProperty cPolicyStatusID, SimpleStringProperty cPolicyStatusName, SimpleStringProperty cPolicyStatusAmount, SimpleStringProperty cPolicyStatusAmountPaid) {
        this.cPolicyStatusID = cPolicyStatusID;
        this.cPolicyStatusName = cPolicyStatusName;
        this.cPolicyStatusAmount = cPolicyStatusAmount;
        this.cPolicyStatusAmountPaid = cPolicyStatusAmountPaid;
    }

    public String getcPolicyStatusID() {
        return cPolicyStatusID.get();
    }

    public void setcPolicyStatusID(SimpleStringProperty cPolicyStatusID) {
        this.cPolicyStatusID = cPolicyStatusID;
    }

    public String getcPolicyStatusName() {
        return cPolicyStatusName.get();
    }

    public void setcPolicyStatusName(SimpleStringProperty cPolicyStatusName) {
        this.cPolicyStatusName = cPolicyStatusName;
    }

    public String getcPolicyStatusAmount() {
        return cPolicyStatusAmount.get();
    }

    public void setcPolicyStatusAmount(SimpleStringProperty cPolicyStatusAmount) {
        this.cPolicyStatusAmount = cPolicyStatusAmount;
    }

    public String getcPolicyStatusAmountPaid() {
        return cPolicyStatusAmountPaid.get();
    }

    public void setcPolicyStatusAmountPaid(SimpleStringProperty cPolicyStatusAmountPaid) {
        this.cPolicyStatusAmountPaid = cPolicyStatusAmountPaid;
    }
    
}
