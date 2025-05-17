
package projectdemo;

import javafx.beans.property.SimpleStringProperty;

public class AgentDetails {
    private SimpleStringProperty cagentName, cagentContact;

    public AgentDetails(SimpleStringProperty cagentName, SimpleStringProperty cagentContact) {
        this.cagentName = cagentName;
        this.cagentContact = cagentContact;
    }

    public String getCagentName() {
        return cagentName.get();
    }

    public void setCagentName(SimpleStringProperty cagentName) {
        this.cagentName = cagentName;
    }

    public String getCagentContact() {
        return cagentContact.get();
    }

    public void setCagentContact(SimpleStringProperty cagentContact) {
        this.cagentContact = cagentContact;
    }
    
    
}
