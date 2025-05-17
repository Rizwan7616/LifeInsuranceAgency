/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class StaffRetirementPlanController implements Initializable {
    @FXML
    private TextField nameField;

    @FXML
    private DatePicker dobField;

    @FXML
    private DatePicker hiredateField;

    @FXML
    private ComboBox<String> planTypeComboBox;

    @FXML
    private TextField contributionrateField;

    @FXML
    private ComboBox<String> employerMatchingComboBox;

    @FXML
    private ComboBox<String> vestingScheduleComboBox;

    @FXML
    private TextField retirementageField;

    @FXML
    private Button submitButton;

    @FXML
    private Text saveText;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set options for plan type ComboBox
        planTypeComboBox.getItems().addAll("401(k)", "IRA", "Pension Plan");

        // Set options for employer matching ComboBox
        employerMatchingComboBox.getItems().addAll("0%", "25%", "50%", "75%", "100%");

        // Set options for vesting schedule ComboBox
        vestingScheduleComboBox.getItems().addAll("1 year", "3 years", "5 years");
        saveText.setVisible(false);
    }

    @FXML
    private void submitData() {
        // Read user input from the fields
        String name = nameField.getText();
        LocalDate dob = dobField.getValue();
        LocalDate hireDate = hiredateField.getValue();
        String planType = planTypeComboBox.getValue();
        String contributionRate = contributionrateField.getText();
        String employerMatching = employerMatchingComboBox.getValue();
        String vestingSchedule = vestingScheduleComboBox.getValue();
        String retirementAge = retirementageField.getText();

        // Print "Application Submitted" to the saveText node
        
        saveText.setText("Application Submitted");
        saveText.setVisible(true);
    }
    @FXML
private void loadstaffoptions(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("StaffOptions.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) backButton.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}
}
