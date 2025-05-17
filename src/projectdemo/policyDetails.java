
package projectdemo;

import javafx.beans.property.SimpleStringProperty;

public class policyDetails {
    private SimpleStringProperty cPolicyID, cPolicyName, cPolicyAmount, cPolicyPeriod, cPolicyInterest;

    public policyDetails(SimpleStringProperty cPolicyID, SimpleStringProperty cPolicyName, SimpleStringProperty cPolicyAmount, SimpleStringProperty cPolicyPeriod, SimpleStringProperty cPolicyInterest) {
        this.cPolicyID = cPolicyID;
        this.cPolicyName = cPolicyName;
        this.cPolicyAmount = cPolicyAmount;
        this.cPolicyPeriod = cPolicyPeriod;
        this.cPolicyInterest = cPolicyInterest;
    }

    public String getcPolicyID() {
        return cPolicyID.get();
    }

    public void setcPolicyID(SimpleStringProperty cPolicyID) {
        this.cPolicyID = cPolicyID;
    }

    public String getcPolicyName() {
        return cPolicyName.get();
    }

    public void setcPolicyName(SimpleStringProperty cPolicyName) {
        this.cPolicyName = cPolicyName;
    }

    public String getcPolicyAmount() {
        return cPolicyAmount.get();
    }

    public void setcPolicyAmount(SimpleStringProperty cPolicyAmount) {
        this.cPolicyAmount = cPolicyAmount;
    }

    public String getcPolicyPeriod() {
        return cPolicyPeriod.get();
    }

    public void setcPolicyPeriod(SimpleStringProperty cPolicyPeriod) {
        this.cPolicyPeriod = cPolicyPeriod;
    }

    public String getcPolicyInterest() {
        return cPolicyInterest.get();
    }

    public void setcPolicyInterest(SimpleStringProperty cPolicyInterest) {
        this.cPolicyInterest = cPolicyInterest;
    }
    

    
}
