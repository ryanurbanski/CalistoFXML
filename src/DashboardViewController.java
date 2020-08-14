/*
 * Penn State University
 * IST 412
 * Ryan Urbanski
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
public class DashboardViewController implements Initializable {

    /**
     * Initializes the controller class.
     */

//    @FXML
//    private Button profileButton;

    @FXML
    private void handleNewLoanButtonAction(ActionEvent event) throws IOException {
        System.out.println("New Loan Button Clicked");

        Parent ProfileViewParent = FXMLLoader.load(getClass().getResource("NewLoan.fxml"));

        Scene profileScene = new Scene(ProfileViewParent);

        // get the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(profileScene);
        window.show();

    }

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println("Profile Button Clicked");

        Parent ProfileViewParent = FXMLLoader.load(getClass().getResource("ProfileView.fxml"));
        
        Scene profileScene = new Scene(ProfileViewParent);

        // get the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(profileScene);
        window.show();

    }
    
    @FXML
    private void handleSignOutButtonAction(ActionEvent event) throws IOException {
        System.out.println("Sign Out Button Clicked");

        Parent LoginViewParent = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
        
        Scene loginScene = new Scene(LoginViewParent);

        // get the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(loginScene);
        window.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
