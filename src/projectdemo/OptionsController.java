/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class OptionsController implements Initializable {
    @FXML
    private Button calculatepremium;
    @FXML
    private Button policychange;
    @FXML
    private Button changecoverage;
    @FXML
    private Button seedata;
    @FXML
    private Button processclaim;
    @FXML
    private Button processpayment;
    @FXML
    private Button backButton;
    @FXML
    private Button changepassword;
    @FXML
    private Button applyleave;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
private void loadprocessclaim(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("ProcessClaim.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) processclaim.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}

    @FXML
private void loadchangecoverage(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("ChangeCoverage.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) changecoverage.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}

@FXML
private void loadprocesspayment(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("Payment.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) processpayment.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
@FXML
private void loadmainlogin(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("LoginFXML.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) backButton.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
@FXML
private void loadchangepassword(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("ChangePassword.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) changepassword.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
@FXML
private void ApplyForLeave(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("ApplyForLeave.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) applyleave.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
@FXML
private void loadseedata(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("SeeData.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) seedata.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
@FXML
private void loadpolicychange(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("PolicyChange.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) policychange.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
@FXML
private void loadcalculatepremium(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("CalculatePremium.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) calculatepremium.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}





    
}
