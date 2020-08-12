/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ryan
 */
public class ProfileViewController implements Initializable {

    @FXML
    private void handleBackButtonAction(ActionEvent event) throws IOException {
        System.out.println("Back to Dashboard Button Clicked");

        Parent ProfileViewParent = FXMLLoader.load(getClass().getResource("DashboardView.fxml"));

        Scene profileScene = new Scene(ProfileViewParent);

        // get the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(profileScene);
        window.show();

    }

    @FXML
    private void handleSaveInfoButtonAction(ActionEvent event) throws IOException {
        System.out.println("Save Information Button Clicked");

//        Parent ProfileViewParent = FXMLLoader.load(getClass().getResource("DashboardView.fxml"));
//
//        Scene profileScene = new Scene(ProfileViewParent);
//
//        // get the Stage information
//        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
//
//        window.setScene(profileScene);
//        window.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
