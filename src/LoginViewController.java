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
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author ryan
 */
public class LoginViewController implements Initializable {
    
    @FXML private Label messageLabel;            
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println("Login Button Clicked");
        messageLabel.setText("You will be taken to main menu.");
        messageLabel.setTextFill(Color.web("#ff0000", 0.8));
        
        Parent DashboardViewParent = FXMLLoader.load(getClass().getResource("DashboardView.fxml"));
        Scene dashboardScene = new Scene(DashboardViewParent);
        
        // get the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(dashboardScene);
        window.show();
        
        System.out.println("Does it reach here?");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
