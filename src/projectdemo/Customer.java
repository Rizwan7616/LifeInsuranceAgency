package projectdemo;

import javafx.beans.property.SimpleStringProperty;

public class Customer {
    private SimpleStringProperty customerID, customerName, customerAge, customerAddress, customerPhone;

    public Customer(String customerID, String customerName, String customerAge, String customerAddress, String customerPhone) {
        this.customerID = new SimpleStringProperty(customerID);
        this.customerName = new SimpleStringProperty(customerName);
        this.customerAge = new SimpleStringProperty(customerAge);
        this.customerAddress = new SimpleStringProperty(customerAddress);
        this.customerPhone = new SimpleStringProperty(customerPhone);
    }

    public String getCustomerID() {
        return customerID.get();
    }

    public void setCustomerID(SimpleStringProperty customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName.get();
    }

    public void setCustomerName(SimpleStringProperty customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAge() {
        return customerAge.get();
    }

    public void setCustomerAge(SimpleStringProperty customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustomerAddress() {
        return customerAddress.get();
    }

    public void setCustomerAddress(SimpleStringProperty customerAddress) {
        this.customerAddress = customerAddress;
    }
    public String getCustomerPhone() {
        return customerPhone.get();
    }

    public void setCustomerPhone(SimpleStringProperty customerPhone) {
        this.customerPhone = customerPhone;
    }
    
    

}
