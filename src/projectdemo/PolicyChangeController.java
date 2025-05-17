package projectdemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PolicyChangeController {
    
    @FXML
    private Button backButton;
    @FXML
    private TextField currentCoverageLevel;
    @FXML
    private TextField newCoverageLevel;
    @FXML
    private DatePicker startDate;
    @FXML
    private DatePicker endDate;
    @FXML
    private Button saveButton;
    @FXML
    private Text saveText;

    @FXML
    private void loadoptions(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Options.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void saveData(ActionEvent event) {
        String newCoverage = newCoverageLevel.getText();
        LocalDate startDate = this.startDate.getValue();
        LocalDate endDate = this.endDate.getValue();

        ContactInformation contactInformation = new ContactInformation(newCoverage, startDate, endDate);

        // Save data to file using object stream
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("contactInformation.dat"))) {
            oos.writeObject(contactInformation);
            saveText.setVisible(true);
            saveText.setText("Saved Changes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
