/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
public class SeeDataController implements Initializable {
    @FXML
    private Button backButton;

    @FXML
    private TableView<Claim> tableView;

    @FXML
    private TableColumn<Claim, String> namecolumn;

    @FXML
    private TableColumn<Claim, String> locationcolumn;
    
    @FXML
    private TableColumn<Claim, Double> amountcolumn;

    @FXML
    private TableColumn<Claim, String> datecolumn;

    @FXML
    private TableColumn<Claim, String> descriptioncolumn;

    @FXML
    private TableColumn<Claim, String> typecolumn;

    private ObservableList<Claim> claimList = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Get the current directory
        String currentDir = System.getProperty("user.dir");

        // Iterate over all the files with extension .ser in the current directory
        File dir = new File(currentDir);
        File[] files = dir.listFiles((d, name) -> name.endsWith(".ser"));

        for (File file : files) {
            try {
                FileInputStream fileIn = new FileInputStream(file);
                ObjectInputStream in = new ObjectInputStream(fileIn);
                Claim claim = (Claim) in.readObject();
                claimList.add(claim);
                in.close();
                fileIn.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        namecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        locationcolumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        amountcolumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        descriptioncolumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        typecolumn.setCellValueFactory(new PropertyValueFactory<>("type"));

        tableView.setItems(claimList);
        tableView.getColumns().addAll(namecolumn, locationcolumn, amountcolumn, datecolumn, descriptioncolumn, typecolumn);
    }  
    @FXML
private void loadoptions(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("Options.fxml"));
Scene scene = new Scene(root);
Stage stage = (Stage) backButton.getScene().getWindow();
stage.setScene(scene);
stage.show();
}
    
}
