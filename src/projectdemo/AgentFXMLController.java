/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * FXML Controller class
 *
 * @author rizwa
 */
public class AgentFXMLController implements Initializable {

    @FXML
    private Label lbWelcome;
    @FXML
    private TabPane tabPane;
    @FXML
    private Tab tMD;
    @FXML
    private Tab tCD;
    @FXML
    private Tab tCPD;
    @FXML
    private TableView<Manager> ManagerView;
    @FXML
    private TableView<Customer> CustomerView;
    @FXML
    private TableColumn<Manager, String> managerName;
    @FXML
    private TableColumn<Manager, String> branchName;
    @FXML
    private TableColumn<Manager, String> contactNo;
    @FXML
    private TableColumn<Customer, String> customerID;
    @FXML
    private TableColumn<Customer, String> customerName;
    @FXML
    private TableColumn<Customer, String> customerAge;
    @FXML
    private TableColumn<Customer,String> customerAddress;
    @FXML
    private TextField tfCustomerName;
    @FXML
    private TextField tfCustomerAge;
    @FXML
    private TextField tfCustomerAddress;
    @FXML
    private TextField tfCustomerID;
    @FXML
    private TableView<CustomerPolicyDetails> CPDView;
    @FXML
    private TableColumn<CustomerPolicyDetails, String> cpdcID;
    @FXML
    private TableColumn<CustomerPolicyDetails, String> pID;
    @FXML
    private TableColumn<CustomerPolicyDetails, String> pType;
    @FXML
    private TableColumn<CustomerPolicyDetails, String> cpdAmount;
    @FXML
    private TextField cpdCustomerID;
    @FXML
    private TextField PolicyID;
    @FXML
    private TextField PolicyType;
    @FXML
    private TextField Amount;
    @FXML
    private TableColumn<Customer, String> customerPhone;
    @FXML
    private TextField tfPhoneNo;
    private TextArea dataOutput;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbWelcome.setText("WELCOME AGENT");
        managerName.setCellValueFactory(new PropertyValueFactory<Manager, String>("managerName"));
        branchName.setCellValueFactory(new PropertyValueFactory<Manager, String>("branchName"));
        contactNo.setCellValueFactory(new PropertyValueFactory<Manager, String>("contactNo"));
        ManagerView.setItems(getManager());
        customerID.setCellValueFactory(new PropertyValueFactory<Customer, String>("customerID"));
        customerName.setCellValueFactory(new PropertyValueFactory<Customer, String>("customerName"));
        customerAge.setCellValueFactory(new PropertyValueFactory<Customer, String>("customerAge"));
        customerAddress.setCellValueFactory(new PropertyValueFactory<Customer, String>("customerAddress"));
        customerPhone.setCellValueFactory(new PropertyValueFactory<Customer, String>("customerPhone"));
        CustomerView.setItems(getCustomer());
        cpdcID.setCellValueFactory(new PropertyValueFactory<CustomerPolicyDetails, String>("cpdcID"));
        pID.setCellValueFactory(new PropertyValueFactory<CustomerPolicyDetails, String>("pID"));
        pType.setCellValueFactory(new PropertyValueFactory<CustomerPolicyDetails, String>("pType"));
        cpdAmount.setCellValueFactory(new PropertyValueFactory<CustomerPolicyDetails, String>("cpdAmount"));
        CPDView.setItems(getCPD());
        
    }  
    public ObservableList<Manager> getManager(){
        ObservableList<Manager> manager = FXCollections.observableArrayList();
        return manager;
    }
    public ObservableList<Customer> getCustomer(){
        ObservableList<Customer> customer = FXCollections.observableArrayList();
        return customer;
    }
    public ObservableList<CustomerPolicyDetails> getCPD(){
        ObservableList<CustomerPolicyDetails> customerpd = FXCollections.observableArrayList();
        return customerpd;
    }

    @FXML
    private void btnLogOutClicked(ActionEvent event) throws Exception {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("LoginFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show(); 
    }
    
//    @FXML
//    private void btnAddManagerbinClicked(ActionEvent event) {
//        File f = null;
//        FileOutputStream fos = null;
//        DataOutputStream dos = null;
//        try {
//            f = new File("ManagerData.bin");
//            if(f.exists()) fos = new FileOutputStream(f,true);
//            else fos = new FileOutputStream(f);
//            dos = new DataOutputStream(fos);
//            dos.writeUTF(tfmanagerName.getText());
//            dos.writeUTF(tfbranchName.getText());
//            dos.writeUTF(tfcontactNo.getText());
//        } catch (IOException ex) {
//            Logger.getLogger(AgentFXMLController.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                if(dos != null) dos.close();
//            } catch (IOException ex) {
//                Logger.getLogger(AgentFXMLController.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }        
//    }    
//        
    

    @FXML
    private void btnAddCustomerbinClicked(ActionEvent event){
        File f = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try {
            f = new File("CustomerData.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);
            dos = new DataOutputStream(fos);
            dos.writeUTF(this.customerID.getText());
            dos.writeUTF(this.customerName.getText());
            dos.writeUTF(this.customerAge.getText());
            dos.writeUTF(this.customerAddress.getText());
            dos.writeUTF(this.customerPhone.getText());
            CustomerView.setItems(null);      
        } catch (IOException ex) {
            Logger.getLogger(AgentFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                Logger.getLogger(AgentFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }         
    

    @FXML
    private void btnAddCustomerPDbinClicked(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try {
            f = new File("CustomerPDData.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);
            dos = new DataOutputStream(fos);
            dos.writeUTF(cpdCustomerID.getText());
            dos.writeUTF(PolicyID.getText());
            dos.writeUTF(PolicyType.getText());
            dos.writeUTF(Amount.getText());
            
        } catch (IOException ex) {
            Logger.getLogger(AgentFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                Logger.getLogger(AgentFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }         


    @FXML
    private void viewManagerDetails(Event event) {
    }

    @FXML
    private void viewCustomerDetails(Event event) {
    }


    @FXML
    private void viewCustomerPolicydetails(Event event) {
    }

//    @FXML
//    private void btnAddManagerClicked(ActionEvent event) {
//        Manager newManager = new Manager(tfmanagerName.getText(),
//                                          tfbranchName.getText(),
//                                           tfcontactNo.getText());
//        ManagerView.getItems().add(newManager);
//    }

    @FXML
    private void btnNewCustomerAddClicked(ActionEvent event) {
        Customer newCustomer = new Customer(tfCustomerID.getText(),
                                          tfCustomerName.getText(),
                                          tfCustomerAge.getText(),
                                           tfCustomerAddress.getText(),
                                          tfPhoneNo.getText());
        CustomerView.getItems().add(newCustomer);
    }
    @FXML
    private void btnNewCustomerPolicyAdd(ActionEvent event) {
        CustomerPolicyDetails newCustomerPD = new CustomerPolicyDetails(cpdCustomerID.getText(),
                                                                      PolicyID.getText(),
                                                                      PolicyType.getText(),   
                                                                       Amount.getText());                         
        CPDView.getItems().add(newCustomerPD);
    }

    @FXML
    private void btnLoadClicked(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("dataOutputFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show(); 
        dataOutput.setText("");
        File f = null;
        FileInputStream fis = null;
        DataInputStream dis = null;
        String str="";
        try {
            f = new File("CustomerData.bin");
            if(!f.exists()){
                showMessageDialog(null , "Oops! CustomerData.bin binary file does not exist...");            

            }
            else{
                
                fis = new FileInputStream(f);

                dis = new DataInputStream(fis);
                while(true){
//                    dis.readUTF(this.customerID.setText());
                    str+= "Id:"+dis.readUTF()
                        +"; Name:"+dis.readUTF()
                        +"; Age:"+dis.readUTF()
                        +"; Address:"+dis.readUTF()
                        +"; Contact:"+dis.readUTF();
                    dataOutput.setText(str);
//                    customerID.setCellValueFactory(new PropertyValueFactory<Customer, String>("customerID"));
//                    customerName.setCellValueFactory(new PropertyValueFactory<Customer, String>("customerName"));
//                    customerAge.setCellValueFactory(new PropertyValueFactory<Customer, String>("customerAge"));
//                    customerAddress.setCellValueFactory(new PropertyValueFactory<Customer, String>("customerAddress"));
//                    customerPhone.setCellValueFactory(new PropertyValueFactory<Customer, String>("customerPhone"));
//                    CustomerView.setItems(getCustomer());

                }
            }
        } catch (IOException ex) {
            dataOutput.setText(str);
            Logger.getLogger(AgentFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException ex) {
                Logger.getLogger(AgentFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
