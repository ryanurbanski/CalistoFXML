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
    private void handleCustomerLoginButtonAction(ActionEvent event) throws IOException {
        System.out.println("Login Button Clicked");

        messageLabel.setTextFill(Color.web("#ff0000", 0.8));
        
        Parent DashboardViewParent = FXMLLoader.load(getClass().getResource("DashboardView.fxml"));
        Scene dashboardScene = new Scene(DashboardViewParent);
        
        // get the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(dashboardScene);
        window.show();
        
    }

    @FXML
    private void handleEmployeeLoginButtonAction(ActionEvent event) throws IOException {
        System.out.println("Login Button Clicked");

        messageLabel.setTextFill(Color.web("#ff0000", 0.8));

        Parent DashboardViewParent = FXMLLoader.load(getClass().getResource("EmployeeDashboard.fxml"));
        Scene dashboardScene = new Scene(DashboardViewParent);

        // get the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(dashboardScene);
        window.show();

    }

    @FXML
    private void handleCreateAccountButtonAction(ActionEvent event) throws IOException {
        System.out.println("Create Account Button Clicked");

        messageLabel.setTextFill(Color.web("#ff0000", 0.8));

        Parent DashboardViewParent = FXMLLoader.load(getClass().getResource("RegistrationView.fxml"));
        Scene dashboardScene = new Scene(DashboardViewParent);

        // get the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(dashboardScene);
        window.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
