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
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author George
 */
public class EmployeeDetailsController implements Initializable {
    Employee emp;
    @FXML
    private Label nameLabel;
    @FXML
    private Label levelLable;
    @FXML
    private Label branchLabel;
    @FXML
    private ComboBox<String> branches;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        branches.getItems().addAll("Dhanmondi", "Uttara");
        branches.setValue("Dhanmondi");
    }    
    public void initData(Employee e){
        emp = e;
    
        nameLabel.setText(emp.getName() );
        levelLable.setText("L"+Integer.toString(emp.getLevel()));
        branchLabel.setText(emp.getBranch());
    }
    
    @FXML
    private void promoteEmployeeOnClick(ActionEvent event) {
        
        int lvl=emp.getLevel();
        
        if(lvl==9)
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Highest Level Reached");
            a.setHeaderText("Can't promote an employee more than Level 9.");
            a.showAndWait();
            return;
        }
        
        lvl++;
        
        Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle( "Promotion Info");
            a.setHeaderText(emp.getName() + " promoted to Level "
                    +emp.getLevel()+".");
            a.showAndWait();
        
        emp.setLevel(lvl);
        levelLable.setText("L"+Integer.toString(lvl));
        
    }

    @FXML
    private void demoteEmployeeOnClick(ActionEvent event) {
      
        int lvl=emp.getLevel();
      
        if(lvl==1)
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Lowest Level Reached");
            a.setHeaderText("Can't demote an employee more than Level 0.");
            a.showAndWait();
            return;
        }
       
       lvl--;
       Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle( "Demotion Info");
            a.setHeaderText(emp.getName() + " demoted to Level "
                    +emp.getLevel()+".");
            a.showAndWait();
        
        emp.setLevel(lvl);
        levelLable.setText("L"+Integer.toString(lvl));
    }

    @FXML
    private void transferEmployeeOnClick(ActionEvent event) {
        String branch=branches.getValue().toString();
        if(emp.getBranch()==branch)
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Select Another Branch To Transfer");
            a.setHeaderText("You have selected the same branch. Change the branch to Transfer "
                    +emp.getName()+".");
            a.showAndWait();
            return;
        }
        emp.setBranch(branch);
        Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle( "Transfer Info");
            a.setHeaderText(emp.getName() + " Transfered to"
                    +emp.getBranch()+".");
            a.showAndWait();
        branchLabel.setText(branch);
        
    }

    @FXML
    private void fireEmployeeOnClick(ActionEvent event) {
        
    }

    @FXML
    private void gotoGoalsSceneOnClick(ActionEvent event) {
    }
    
}

