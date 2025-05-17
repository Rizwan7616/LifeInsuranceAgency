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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * FXML Controller class
 *
 * @author rizwa
 */
public class GuestFXMLController implements Initializable {

    @FXML
    private Label lbWelcome;
    @FXML
    private Label gstlabel;
    @FXML
    private TextField cmnt;
    @FXML
    private ComboBox<String> rating;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbWelcome.setText("WELCOME GUEST");
        rating.getItems().addAll("Very Good","Good","Bad","Very Bad");
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
    private void btnCreateAccountClicked(MouseEvent event) {
    }

    @FXML
    private void btnContactClicked(MouseEvent event) {
        gstlabel.setText("Life Insurance Company \n\nPhone: +8801234567890 \nWebsite: lifeinsurance.com.bd \nEmail: lifeinsurance@gmail.com");
    }

    @FXML
    private void btnCommentClicked(MouseEvent event) {
        String comment;
        comment = cmnt.getText();
        gstlabel.setText("COMMENT\n\n" + comment + "\nposted by You");
        showMessageDialog(null , "Comment has been posted");
    }

    @FXML
    private void btnRTCClicked(MouseEvent event) {
        gstlabel.setText("PLEASE READ THE TERMS AND CONDITIONS CAREFULLY.");
    }

    @FXML
    private void btnRateClicked(MouseEvent event) {
        String rate;
        rate = rating.getValue();
        gstlabel.setText("RATING\n\n" + rate + "\nposted by You");
        showMessageDialog(null , "Thank you for rating");
    }

    @FXML
    private void btnReportClicked(MouseEvent event) {
        showMessageDialog(null , "Report Send");
    }

    @FXML
    private void btnCompanyDetailsClicked(MouseEvent event) {
    }

    @FXML
    private void btnAvailablePoliciesClicked(MouseEvent event) {
    }

    
}
