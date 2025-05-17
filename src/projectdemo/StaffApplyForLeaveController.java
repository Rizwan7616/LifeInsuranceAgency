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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class StaffApplyForLeaveController implements Initializable {

    @FXML
    private Label titleLabel;
    @FXML
    private Label nameLabel;
    @FXML
    private TextField nameField;
    @FXML
    private Label idLabel;
    @FXML
    private TextField idField;
    @FXML
    private Label dateLabel;
    @FXML
    private DatePicker datePicker;
    @FXML
    private Label reasonLabel;
    @FXML
    private TextArea reasonArea;
    @FXML
    private Button submitButton;
    @FXML
    private Button clearButton;
    @FXML
    private Button backButton;
    @FXML
    private Text saveText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    @FXML
    private void saveData(ActionEvent event) {
        String name = nameField.getText();
        String id = idField.getText();
        String reason = reasonArea.getText();

        // validate input and save data to database or file

        saveText.setText("Application Submitted");
        saveText.setVisible(true);
    }
    @FXML
private void clearField(ActionEvent event) {
    nameField.clear();
    idField.clear();
    datePicker.setValue(null);
    reasonArea.clear();
    saveText.setVisible(false);
}
@FXML
    private void loadStaffOptions(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("StaffOptions.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) backButton.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
    }



    
    
}
