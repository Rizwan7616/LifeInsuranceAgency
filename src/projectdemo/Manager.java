package projectdemo;

import javafx.beans.property.SimpleStringProperty;

public class Manager {
    private SimpleStringProperty managerName, branchName, contactNo;

    public Manager(String managerName, String branchName, String contactNo) {
        this.managerName = new SimpleStringProperty(managerName);
        this.branchName = new SimpleStringProperty(branchName);
        this.contactNo = new SimpleStringProperty(contactNo);
    }

    public String getManagerName() {
        return managerName.get();
    }

    public void setManagerName(SimpleStringProperty managerName) {
        this.managerName = managerName;
    }

    public String getBranchName() {
        return branchName.get();
    }

    public void setBranchName(SimpleStringProperty branchName) {
        this.branchName = branchName;
    }

    public String getContactNo() {
        return contactNo.get();
    }

    public void setContactNo(SimpleStringProperty contactNo) {
        this.contactNo = contactNo;
    }
    
    
}
