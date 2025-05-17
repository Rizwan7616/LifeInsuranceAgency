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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class StaffPolicyController implements Initializable {

    @FXML
    private TextArea textArea;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        textArea.setText("Here are some sample company policies for staff employees in a life insurance company:\n" +
"\n" +
"1. Working hours: Staff employees are required to work the hours set by their manager, which may include some evenings and weekends.\n" +
"\n" +
"2. Code of conduct: Staff employees are expected to act with professionalism and integrity at all times when representing the company, including maintaining client confidentiality and avoiding conflicts of interest.\n" +
"\n" +
"3. Training and development: Staff employees are expected to participate in ongoing training and development opportunities to ensure they are knowledgeable and skilled in their role.\n" +
"\n" +
"4. Performance expectations: Staff employees are evaluated on their performance based on specific job responsibilities, including meeting productivity targets, providing excellent customer service, and adhering to quality standards.\n" +
"\n" +
"5. Health and safety: Staff employees are expected to adhere to health and safety policies and procedures to ensure a safe work environment for all employees and clients.\n" +
"\n" +
"6. Leave policies: Staff employees are eligible for vacation leave, sick leave, and other leave types as outlined in the company's policies.\n" +
"\n" +
"7. Use of company resources: Staff employees are expected to use company resources, such as computers and phones, for work-related purposes only and in compliance with the company's policies.\n" +
"\n" +
"8. Conflict resolution: Staff employees are encouraged to report any conflicts or concerns to their manager or the HR department to help resolve issues in a timely and professional manner.\n" +
"\n" +
"It's important to note that these policies are just a sample and should be customized to fit the specific needs of the life insurance company.");
    }    

    @FXML
    private void loaddstaffoptions(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StaffOptions.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) backButton.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
    }
    
}
