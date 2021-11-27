/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author mbodj
 */
public class ConnexionController {

    @FXML
    private TextField txtfLogin;
    @FXML
    private PasswordField txtfPassword;

    @FXML
    private void handleConnexion(ActionEvent event) {
        
    }

    @FXML
    private void handleClear(ActionEvent event) {
       txtfLogin.clear();
        txtfPassword.clear();
    }

    @FXML
    private void handleInscription(MouseEvent event) {
        loadHome("v_inscription");
      
    }
    
    
    public void loadHome(String home){
        this.txtfLogin.getScene().getWindow().hide();
        AnchorPane root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/views/"+home+".fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Clinique 221");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(ConnexionController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    
}
