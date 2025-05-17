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
public class StaffGiveAttendanceController implements Initializable {
    @FXML
    private Button backButton;

    @FXML
    private TextField nameField;
    
    @FXML
    private TextField idField;
    
    @FXML
    private DatePicker datepicker;
    
    @FXML
    private TextField hourField;
    
    @FXML
    private TextField minuteField;
    
    @FXML
    private ComboBox<String> shiftbox;
    
    @FXML
    private ComboBox<String> timebox;
    @FXML
    private Text saveText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        timebox.getItems().addAll(
            "AM","PM"
    );
        shiftbox.getItems().addAll(
            "PartTime-NightShift","PartTime-MorningShift"
    );
    }    

     public void saveData(ActionEvent event) {
        // Get input values
        String name = nameField.getText();
        String id = idField.getText();
        String date = datepicker.getValue().toString();
        String time = hourField.getText() + ":" + minuteField.getText() + " " + timebox.getValue();
        String shift = shiftbox.getValue();
        
        // Save attendance data
        // ...
        
        // Update text
        saveText.setText("Attendance Recorded");
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
