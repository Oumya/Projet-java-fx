/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mbodj
 */
public class InscriptionController implements Initializable {

    @FXML
    private TextField txtfLogin;
    @FXML
    private TextField txtfNom;
    @FXML
    private TextField txtfPassword;
    @FXML
    private TextField txtfPrenom;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleInscription(ActionEvent event) {
    }

    @FXML
    private void handleConnexion(MouseEvent event) {
        loadHome("v_connexion");
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
