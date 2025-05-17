/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
 *
 * @author HP
 */
public class ApplyForLeaveController {
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
    private Button cancelButton;
    @FXML
    private Text saveText;
    @FXML
    private void loadoptions(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Options.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) cancelButton.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
    }
     @FXML
    private void handleClear(ActionEvent event) {
        // Clear the fields
        nameField.clear();
        idField.clear();
        datePicker.setValue(null);
        reasonArea.clear();
        saveText.setText("");
    }
    @FXML
    private void handleSubmit(ActionEvent event) {
        // Get the user input from the fields
        String name = nameField.getText();
        String id = idField.getText();
        String date = datePicker.getValue().toString();
        String reason = reasonArea.getText();

        // Check if all fields are filled
        if (name.isEmpty() || id.isEmpty() || date.isEmpty() || reason.isEmpty()) {
            saveText.setText("Please fill all fields!");
            saveText.setVisible(true);
        } else {
            // Print "Application sent!"
            saveText.setText("Application sent!");
            saveText.setVisible(true);

            // Clear the fields
            nameField.clear();
            idField.clear();
            datePicker.setValue(null);
            reasonArea.clear();
        }
    }
}
