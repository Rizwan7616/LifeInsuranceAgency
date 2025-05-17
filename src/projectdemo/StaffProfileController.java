package projectdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StaffProfileController implements Initializable {

    @FXML
    private TextField nameField;
    @FXML
    private TextField idField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField phoneField;
    
    @FXML
    private TextField retirementPlanField;
    @FXML
    private Button changeinfoButton;
    @FXML
    private Button saveButton;
    @FXML
    private Button backButton;
    @FXML
    private MyInfo myInfo;
    @FXML
    private TextField hireDateField;

   @Override
    public void initialize(URL url, ResourceBundle rb) {
        // load MyInfo object from file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("myinfo.dat"))) {
            myInfo = (MyInfo) in.readObject();
        } catch (Exception e) {
            myInfo = new MyInfo("isfar", "123", "2010222@iub.edu.bd", "88012183712987", "05/04/2023", "Roth IRA"); // default values
        }

        // set initial values in text fields
        nameField.setText(myInfo.getName());
        idField.setText(myInfo.getId());
        emailField.setText(myInfo.getEmail());
        phoneField.setText(myInfo.getPhoneNumber());
        hireDateField.setText(myInfo.getHireDate());
        retirementPlanField.setText(myInfo.getRetirementPlan());

        // disable save button initially
        saveButton.setDisable(true);
    }


    @FXML
    private void changeInfo(ActionEvent event) {
        // enable text fields for editing
        nameField.setEditable(true);
        idField.setEditable(true);
        emailField.setEditable(true);
        phoneField.setEditable(true);
        hireDateField.setEditable(true);
        retirementPlanField.setEditable(true);
        
        // enable save button
        saveButton.setDisable(false);
    }

    @FXML
    private void saveData(ActionEvent event) {
        // get new values from text fields
        String name = nameField.getText();
        String id = idField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String hireDate = hireDateField.getText();
        String retirementPlan = retirementPlanField.getText();
        
        // set values in MyInfo object
        myInfo.setName(name);
        myInfo.setId(id);
        myInfo.setEmail(email);
        myInfo.setPhoneNumber(phone);
        myInfo.setHireDate(hireDate);
        myInfo.setRetirementPlan(retirementPlan);

        // save MyInfo object to file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("myinfo.dat"))) {
            out.writeObject(myInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // disable text fields for editing
        nameField.setEditable(false);
        idField.setEditable(false);
        emailField.setEditable(false);
        phoneField.setEditable(false);
        hireDateField.setEditable(false);
        retirementPlanField.setEditable(false);
        
        // disable save button
        saveButton.setDisable(true);
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
