/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * FXML Controller class
 *
 * @author rizwa
 */
public class dataOutputFXMLController implements Initializable {

    @FXML
    private TextArea dataOutput;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
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
                    str+= "Id:"+dis.readUTF()
                        +"; Name:"+dis.readUTF()
                        +"; Age:"+dis.readUTF()
                        +"; Address:"+dis.readUTF()
                        +"; Contact:"+dis.readUTF();
                    dataOutput.setText(str);
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
    @FXML
    private void btnBacktoLoginClicked(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AgentFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();        
    }
    
}
