/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

import java.io.FileOutputStream;
import java.io.IOException;
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
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class StaffChangePasswordController implements Initializable {

    @FXML
    private PasswordField currentPasswordField;
    @FXML
    private PasswordField newPasswordField;
    @FXML
    private Button changePasswordButton;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   @FXML
    void changePassword(ActionEvent event) {
        // create a new StaffPassword instance with the value of the newPasswordField
        StaffPassword staffPassword = new StaffPassword(newPasswordField.getText());

        // save the staffPassword object to a file using Java serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("staffpass.dat"))) {
            oos.writeObject(staffPassword);
            System.out.println("Staff password saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
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
