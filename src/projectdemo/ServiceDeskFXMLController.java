/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class ServiceDeskFXMLController implements Initializable {

    @FXML
    private Label lbWelcome;
    @FXML
    private Tab provide_info;
    @FXML
    private Button coverage_details;
    @FXML
    private Button premium_info;
    @FXML
    private Button deductibles;
    @FXML
    private Tab receive_complain;
    @FXML
    private TextArea write_complain;
    @FXML
    private Button save_complain;
    @FXML
    private Tab download_form;
    @FXML
    private Button export_pdf;
    @FXML
    private Tab bill_inquiry;
    @FXML
    private Button payment_scheudle;
    @FXML
    private Button premium_amount;
    @FXML
    private Button payment_option;
    @FXML
    private Button calculate_premium;
    @FXML
    private Button change_password;
    @FXML
    private Button load_profile;
    @FXML
    private Button customer_changes;
    @FXML
    private Button add_insurance;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbWelcome.setText("WELCOME OPERATOR");
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
    private void viewAgentDetails(Event event) {
    }

    @FXML
    private void viewPolicyDetails(Event event) {
    }

    @FXML
    private void btnExportPS(ActionEvent event) {
    }

    @FXML
    private void viewCustomerPolicydetails(Event event) {
    }

    @FXML
    private void btnCalPremClicked(ActionEvent event) {
    }

    @FXML
    private void btnChangePassClicked(ActionEvent event) {
    }

    @FXML
    private void btnLoadProfileClicked(ActionEvent event) {
    }

    @FXML
    private void btnMClicked(ActionEvent event) {
    }

    @FXML
    private void btnSavingsClicked(ActionEvent event) {
    }
    
}
