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
public class StaffOptionsController implements Initializable {
    @FXML
    private Button payrollButton;
    @FXML
    private Button myprofileButton;
    @FXML
    private Button staffpolicyButton;
    
    @FXML
    private Button retirementplanbutton;
     

    @FXML
    private Button applyForLeaveButton;
    @FXML
    private Button giveAttendanceButton;
    @FXML
    private Button changePasswordButton;
    @FXML
    private Button seeScheduleButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


@FXML
private void loadstaffapplyforleave(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("StaffApplyForLeave.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) applyForLeaveButton.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
@FXML
private void loadgiveattendance(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("StaffGiveAttendance.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) giveAttendanceButton.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
@FXML
private void loadstaffchangepassword(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("StaffChangePassword.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) changePasswordButton.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
@FXML
private void loadupcomingschedule(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("StaffUpcomingSchedule.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) seeScheduleButton.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
@FXML
private void loadstaffpayroll(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("StaffPayroll.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) payrollButton.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
@FXML
private void loadstaffretirementplan(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("StaffRetirementPlan.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) retirementplanbutton.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
@FXML
private void loadstaffpolicy(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("StaffPolicy.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) staffpolicyButton.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
@FXML
private void loadmyprofile(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("StaffProfile.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) myprofileButton.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}




    
}
