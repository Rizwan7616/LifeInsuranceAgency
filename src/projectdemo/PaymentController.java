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
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class PaymentController implements Initializable {
    @FXML
    private TextField cardHolderName;

    @FXML
    private TextField cardNumber;

    @FXML
    private TextField expirationMonth;

    @FXML
    private TextField expirationYear;

    @FXML
    private TextField cvv;

    @FXML
    private TextField billingAddress;

    @FXML
    private TextField city;

    @FXML
    private TextField postalCode;

    @FXML
    private TextField country;

    @FXML
    private TextField email;

    @FXML
    private Text saveText;
    @FXML
    private Button paymentButton;
    @FXML
    private Button backButton;
    
    @FXML
public void makePayment() {
    String cardHolderNameText = cardHolderName.getText();
    String cardNumberText = cardNumber.getText();
    String expirationMonthText = expirationMonth.getText();
    String expirationYearText = expirationYear.getText();
    String cvvText = cvv.getText();
    String billingAddressText = billingAddress.getText();
    String cityText = city.getText();
    String postalCodeText = postalCode.getText();
    String countryText = country.getText();
    String emailText = email.getText();

    // You can implement your payment processing logic here.
    // For this example, we will just display a message saying the data was saved.
    saveText.setText("Data Saved!");
}
@FXML
private void loadoptions(ActionEvent event) throws IOException {
    Parent optionsParent = FXMLLoader.load(getClass().getResource("Options.fxml"));
    Scene optionsScene = new Scene(optionsParent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(optionsScene);
    window.show();
}










    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
