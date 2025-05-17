/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.Node;
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
public class ChangePasswordController implements Initializable {

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
    public void changePassword() throws IOException, ClassNotFoundException {
        String currentPassword = currentPasswordField.getText();
        String newPassword = newPasswordField.getText();
        
        // Load existing password object from file
        Password passwordObj;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("password.dat"))) {
            passwordObj = (Password) in.readObject();
        }
        
        // Validate current password and save new password to file
        if (currentPassword.equals(passwordObj.getPassword())) {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("password.dat"))) {
                passwordObj = new Password("cs", newPassword);
                out.writeObject(passwordObj);
            }
            currentPasswordField.clear();
            newPasswordField.clear();
            // TODO: show confirmation message to user
        } else {
            // TODO: show error message to user
            currentPasswordField.clear();
            newPasswordField.clear();
        }
    }
    @FXML
private void loadoptions(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("Options.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) backButton.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
}

    
}
