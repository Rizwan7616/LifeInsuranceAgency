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
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class ProcessClaimController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField locationTextField;
    @FXML
    private TextField amountTextField;
    @FXML
    private TextArea descriptionTextField;
    @FXML
    private DatePicker datepicker;
    @FXML
    private ComboBox<String> typecombobox;
    @FXML
    private Button saveButton;
    @FXML
    private Text saveText;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     */
    @Override
public void initialize(URL url, ResourceBundle rb) {
    typecombobox.getItems().addAll(
            "Term Life Insurance",
            "Whole Life Insurance",
            "Universal Life Insurance",
            "Variable Life Insurance",
            "Final Expense Life Insurance"
    );
}
    
@FXML
    private void saveData(ActionEvent event) {
        String name = nameTextField.getText();
        String location = locationTextField.getText();
        String description = descriptionTextField.getText();
        String type = typecombobox.getValue();
        double amount = Double.parseDouble(amountTextField.getText());
        LocalDate date = datepicker.getValue();
        Claim claim = new Claim(name, location, amount, date, description, type);

        String fileName = name + "_" + date.toString() + ".ser";
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(claim);
            oos.close();
            fos.close();
            saveText.setText("Data Saved!");
            saveText.setVisible(true);
        } catch (IOException e) {
            System.out.println("Exception Occured: " + e);
        }
    }
    @FXML
private void loadoptions(ActionEvent event) throws IOException {
    Parent optionsParent = FXMLLoader.load(getClass().getResource("Options.fxml"));
    Scene optionsScene = new Scene(optionsParent);
    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
    window.setScene(optionsScene);
    window.show();
}

    
}
