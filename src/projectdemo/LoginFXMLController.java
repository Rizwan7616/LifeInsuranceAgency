/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static javax.swing.JOptionPane.showMessageDialog;
import projectdemo.LoginFXMLController;
        
/**
 * FXML Controller class
 *
 * @author rizwa
 */
public class LoginFXMLController implements Initializable{

    @FXML
    private PasswordField tfPassword;
    @FXML
    private TextField tfUserName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void btnLoginClicked(ActionEvent event) throws Exception {
        String user = tfUserName.getText();
        String pass = tfPassword.getText();
        Password passwordObj = null;
        File passwordFile = new File("password.dat");
        if (passwordFile.exists()) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(passwordFile))) {
                passwordObj = (Password) in.readObject();
            } catch (ClassNotFoundException | IOException ex) {
                ex.printStackTrace();
            }
        } else {
            // Create a new password file with initial password "123"
            passwordObj = new Password("cs", "123");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(passwordFile));
            out.writeObject(passwordObj);
            out.close();
        }        
        if("Customer".equals(user)&& "9876".equals(pass)){  //rz    
            Parent mainSceneParent = FXMLLoader.load(getClass().getResource("CustomerFXML.fxml"));
            Scene scene1 = new Scene(mainSceneParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene1);
            window.show();
        }
        if("cs".equals(user)&& "123".equals(pass)){  //isfar   
            Parent mainSceneParent = FXMLLoader.load(getClass().getResource("Options.fxml"));
            Scene scene1 = new Scene(mainSceneParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene1);
            window.show();
        }        
        if("Agent".equals(user) && "1234".equals(pass)){    //rz
            Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AgentFXML.fxml"));
            Scene scene1 = new Scene(mainSceneParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene1);
            window.show();
        }
        if("Admin".equals(user) && "0000".equals(pass)){  //bijoy
            Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AdminFXML.fxml"));
            Scene scene1 = new Scene(mainSceneParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene1);
            window.show();
        }
        if("Operator".equals(user) && "9999".equals(pass)){
            Parent mainSceneParent = FXMLLoader.load(getClass().getResource("Employee Scene.fxml"));
            Scene scene1 = new Scene(mainSceneParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene1);
            window.show();
        }
        if("Staff".equals(user) && "123".equals(pass)){    //isfar
            Parent mainSceneParent = FXMLLoader.load(getClass().getResource("StaffOptions.fxml"));
            Scene scene1 = new Scene(mainSceneParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene1);
            window.show();
        } else {
            showMessageDialog(null , "Please enter Valid Data");            
        }
        
    }

    @FXML
    private void btnGuestLoginClicked(ActionEvent event) throws Exception {   //bijoy
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("GuestFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
}
