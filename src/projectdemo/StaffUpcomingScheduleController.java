/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class StaffUpcomingScheduleController implements Initializable {
    @FXML
    private Button backButton;
    @FXML
    private Button additionaldetails;

    @FXML
    private TableView<Schedule> tableView;
    @FXML
    private TableColumn<Schedule,String> datecolumn;
    @FXML
    private TableColumn<Schedule,String > timecolumn;
    @FXML
    private TableColumn<Schedule, String> eventcolumn;
    @FXML
    private TableColumn<Schedule, String> locationcolumn;

    /**
     * Initializes the controller class.
     */
   @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set up the columns to display the data from the Schedule object
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        timecolumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        eventcolumn.setCellValueFactory(new PropertyValueFactory<>("event"));
        locationcolumn.setCellValueFactory(new PropertyValueFactory<>("location"));

        // Create some sample data
        ObservableList<Schedule> schedules = FXCollections.observableArrayList(
                new Schedule("2023-05-01", "09:00 AM", "Cater the Food"," Room 302"),
                new Schedule("2023-05-02", "02:30 PM", "Vacuum the floor","5th Floor NAC Building"),
                new Schedule("2023-05-03", "10:00 AM", "Clean both the Toilet","4th Floor")
        );

        // Add the data to the tableView
        tableView.setItems(schedules);
    }  
    @FXML
private void loadadditionaldetails(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("StaffAdditionalDetails.fxml"));
    Scene scene = new Scene(root);
    Stage stage = (Stage) additionaldetails.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
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
