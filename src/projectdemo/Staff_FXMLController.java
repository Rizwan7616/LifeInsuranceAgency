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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class Staff_FXMLController implements Initializable {

    @FXML
    private Button log_out;
    @FXML
    private Label lbWelcome;
    @FXML
    private Tab tAD;
    @FXML
    private Button checkInbox;
    @FXML
    private Tab view_directory;
    @FXML
    private Button launch_complain;
    @FXML
    private Button apply_leave;
    @FXML
    private Button change_pass;
    @FXML
    private Button check_schedule;
    @FXML
    private Button procurement_details;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbWelcome.setText("WELCOME STAFF");
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
    private void btnExportAD(ActionEvent event) {
    }

    @FXML
    private void viewAgentDetails(Event event) {
    }

    @FXML
    private void btnHealthClicked(ActionEvent event) {
    }

    @FXML
    private void btnEducationClicked(ActionEvent event) {
    }

    @FXML
    private void btnRetiremnetClicked(ActionEvent event) {
    }

    @FXML
    private void btnSavingsClicked(ActionEvent event) {
    }

    @FXML
    private void btnFormsClicked(ActionEvent event) {
    }
    
}
