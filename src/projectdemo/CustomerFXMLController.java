/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rizwa
 */
public class CustomerFXMLController implements Initializable {

    @FXML
    private Label lbWelcome;
    @FXML
    private TableView<AgentDetails> AgentView;
    @FXML
    private TableColumn<AgentDetails, String> cagentName;
    @FXML
    private TableColumn<AgentDetails, String> cagentContact;
    @FXML
    private TableView<policyDetails> cpDetailsView;
    @FXML
    private TableColumn<policyDetails, String> cPolicyID;
    @FXML
    private TableColumn<policyDetails, String> cPolicyName;
    @FXML
    private TableColumn<policyDetails, String> cPolicyAmount;
    @FXML
    private TableColumn<policyDetails, String> cPolicyPeriod;
    @FXML
    private TableColumn<policyDetails, String> cPolicyInterest;
    @FXML
    private TableView<policyStatus> cPSView;
    @FXML
    private TableColumn<policyStatus, String> cPolicyStatusID;
    @FXML
    private TableColumn<policyStatus, String> cPolicyStatusName;
    @FXML
    private TableColumn<policyStatus, String> cPolicyStatusAmount;
    @FXML
    private TableColumn<policyStatus, String> cPolicyStatusAmountPaid;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbWelcome.setText("WELCOME DEAR CUSTOMER");
        cagentName.setCellValueFactory(new PropertyValueFactory<AgentDetails, String>("cagentName"));
        cagentContact.setCellValueFactory(new PropertyValueFactory<AgentDetails, String>("cagentContact"));
        AgentView.setItems(getAgent());
        cPolicyID.setCellValueFactory(new PropertyValueFactory<policyDetails, String>("cpolicyID"));
        cPolicyName.setCellValueFactory(new PropertyValueFactory<policyDetails, String>("cpolicyName"));
        cPolicyAmount.setCellValueFactory(new PropertyValueFactory<policyDetails, String>("cpolicyAmount"));
        cPolicyPeriod.setCellValueFactory(new PropertyValueFactory<policyDetails, String>("cpolicyPeriod"));
        cPolicyInterest.setCellValueFactory(new PropertyValueFactory<policyDetails, String>("cpolicyInterest"));
        cpDetailsView.setItems(getcPD());        
        cPolicyStatusID.setCellValueFactory(new PropertyValueFactory<policyStatus, String>("cPolicyStatusID"));
        cPolicyStatusName.setCellValueFactory(new PropertyValueFactory<policyStatus, String>("cPolicyStatusName"));
        cPolicyStatusAmount.setCellValueFactory(new PropertyValueFactory<policyStatus, String>("cPolicyStatusAmount"));
        cPolicyStatusAmountPaid.setCellValueFactory(new PropertyValueFactory<policyStatus, String>("cPolicyStatusAmountPaid"));
        cPSView.setItems(getPS());    
    } 
     public ObservableList<AgentDetails> getAgent(){
        ObservableList<AgentDetails> agent = FXCollections.observableArrayList();
        return agent;
    }
     public ObservableList<policyDetails> getcPD(){
        ObservableList<policyDetails> policyDetails = FXCollections.observableArrayList();
        return policyDetails;
    }
     public ObservableList<policyStatus> getPS(){
        ObservableList<policyStatus> policyStatus = FXCollections.observableArrayList();
        return policyStatus;
    }     
    @FXML
    private void btnLogOutClicked(ActionEvent event) throws Exception {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("LoginFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show(); 
    }


    @FXML
    private void btnHealthClicked(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("HealthFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void btnEducationClicked(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("EducationFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void btnRetiremnetClicked(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("RetirementFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void btnFormsClicked(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("FormsFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void btnSavingsClicked(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("SavingsFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void btnAgentDetailsbinClicked(ActionEvent event) {
    }

    @FXML
    private void btnContactAgentClicked(ActionEvent event) {
    }

    
}
