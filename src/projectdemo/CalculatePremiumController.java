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

public class CalculatePremiumController implements Initializable {

    @FXML
    private Button backButton;

    @FXML
    private TextField ageTextField;

    @FXML
    private TextField genderTextField;

    @FXML
    private TextField smokerTextField;

    @FXML
    private TextField currentpremiumTextField;

    @FXML
    private Button calculatebutton;

    @FXML
    private TextField typeTextField;

    @FXML
    private Text newpremium;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        currentpremiumTextField.setText("500");
        currentpremiumTextField.setVisible(true);
        typeTextField.setText("Hand Injury");
        typeTextField.setEditable(false);
        genderTextField.setText("Male");
        genderTextField.setEditable(false);
        newpremium.setVisible(false);
    }

    @FXML
    void loadoptions(ActionEvent event) throws IOException {
        Parent optionsParent = FXMLLoader.load(getClass().getResource("Options.fxml"));
        Scene optionsScene = new Scene(optionsParent);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(optionsScene);
    }

    @FXML
    void calculatepremium(ActionEvent event) {
        int age = Integer.parseInt(ageTextField.getText());
        boolean isMale = genderTextField.getText().equalsIgnoreCase("male");
        boolean isSmoker = smokerTextField.getText().equalsIgnoreCase("yes");
        double currentPremium = Double.parseDouble(currentpremiumTextField.getText());
        double newPremium = 0.0;

        if (age > 50 && isMale && isSmoker) {
            newPremium = 600.0;
        } else if (age <= 50 && isMale && isSmoker) {
            newPremium = 550.0;
        } else if (age > 50 && isMale && !isSmoker) {
            newPremium = 500.0;
        }

        newpremium.setText(String.format("Your New Premium is $%.2f", newPremium));
        newpremium.setVisible(true);

        ageTextField.clear();
        smokerTextField.clear();
    }
}
