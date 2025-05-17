/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AdminFXMLController implements Initializable {

    @FXML
    private Label lbWelcome;
    @FXML
    private Label admLabel;
    @FXML
    private TextField cmnt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbWelcome.setText("WELCOME ADMIN");
    }    

    @FXML
    private void btnLogOutClicked(ActionEvent event) throws Exception {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("LoginFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show(); 
    }


    @FXML
    private void btnAgentDetailsClicked(MouseEvent event) {
    }


    @FXML
    private void btnCustomerDetailsClicked(MouseEvent event) {
    }


    @FXML
    private void btnPolicyDetailsClicked(MouseEvent event) {
    }

    @FXML
    private void btnAdminDetailsClicked(MouseEvent event) {
    }

    @FXML
    private void btnReportClicked(MouseEvent event) {
        showMessageDialog(null , "Report Send");
    }

    @FXML
    private void btnCommentClicked(MouseEvent event) {
        String comment;
        comment = cmnt.getText();
        admLabel.setText("COMMENT\n\n" + comment + "\nposted by ADMIN");
        showMessageDialog(null , "Comment has been posted");
        
    }

    @FXML
    private void btnContactClicked(MouseEvent event) {
        admLabel.setText("Life Insurance Company \n\nPhone: +8801234567890 \nWebsite: lifeinsurance.com.bd \nEmail: lifeinsurance@gmail.com");
    }


    
}
