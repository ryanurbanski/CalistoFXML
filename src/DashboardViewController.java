/*
 * Penn State University
 * IST 412
 * Ryan Urbanski
 */

import java.awt.*;
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
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ryan
 */
public class DashboardViewController implements Initializable {

    /**
     * Initializes the controller class.
     */

//    @FXML
//    private Button profileButton;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println("Profile Button Clicked");

//        Parent ProfileViewParent = FXMLLoader.load(getClass().getResource("ProfileView.fxml"));
//        Parent ProfileViewParent = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
        Parent ProfileViewParent = FXMLLoader.load(getClass().getResource("ProfileView2.fxml"));
        
        Scene profileScene = new Scene(ProfileViewParent);

        // get the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(profileScene);
        window.show();


    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
