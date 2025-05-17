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
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class StaffPayrollController implements Initializable {
    @FXML
    private Button backButton;
    @FXML
    private TextField nameField;

    @FXML
    private TextField idField;

    @FXML
    private TextField hourlywageField;

    @FXML
    private TextField hoursworkedField;

    @FXML
    private TextField paybeforetaxField;
    @FXML
    private TextField payaftertaxField;

    @FXML
    private Button calculateButton;
    @FXML
    private Text taxbracket;
    


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        taxbracket.setVisible(false);
    }  
     @FXML
    private void calculatePay() {
        double hourlyWage = Double.parseDouble(hourlywageField.getText());
        double hoursWorked = Double.parseDouble(hoursworkedField.getText());
        double payBeforeTax = hourlyWage * hoursWorked;
        paybeforetaxField.setText("$" + Double.toString(payBeforeTax));
        double payAfterTax = payBeforeTax * 0.85; // Assuming 15% tax rate
        payaftertaxField.setText("$" + Double.toString(payAfterTax));
        taxbracket.setVisible(true);
    taxbracket.setText("You Are Subject To 15% Income Tax");
    
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
