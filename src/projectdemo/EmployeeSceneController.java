/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author George
 */
public class EmployeeSceneController implements Initializable {

    @FXML
    private TableView<Employee> employeeTable;
    @FXML
    private TableColumn<Employee, String> employeeNameCol;
    @FXML
    private TableColumn<Employee, String> levelCol;
    @FXML
    private TableColumn<Employee, String> branchCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        employeeNameCol.setCellValueFactory(new PropertyValueFactory<Employee,String>("name"));
        levelCol.setCellValueFactory(new PropertyValueFactory<Employee,String>("level"));
        branchCol.setCellValueFactory(new PropertyValueFactory<Employee,String>("branch"));
        
        
        //load dummy data
        employeeTable.setItems(getPeople());    
    }    
    public ObservableList<Employee> getPeople(){
        ObservableList<Employee> employeeList = FXCollections.observableArrayList();
     
        employeeList.add(new Employee("Ahsan",2,"Dhanmondi"));
        employeeList.add(new Employee("Lisa",3, "Uttara"));
        employeeList.add(new Employee("Farid",1, "Dhanmondi"));
        employeeList.add(new Employee("Daiyan",3, "Dhanmondi"));
        employeeList.add(new Employee("Faria",1, "Dhanmondi"));
        employeeList.add(new Employee("Anjum",2, "Uttara"));
        employeeList.add(new Employee("Maysha",2, "Uttara"));
        return employeeList;
    } 
    
    @FXML
    private void selectEmployeeOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Employee Details.fxml"));
        Parent employeeDetailsParent = loader.load();

       // Parent employeeDetailsParent = FXMLLoader.load(getClass().getResource("FXMLScene2.fxml"));
        Scene personViewScene = new Scene(employeeDetailsParent);
        
        //access the controller
        EmployeeDetailsController controller = loader.getController();
        //controller = new PersonViewSceneController();
        controller.initData(employeeTable.getSelectionModel().getSelectedItem());
                
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(personViewScene);
        window.show();
    }
    
}
