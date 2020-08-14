import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegistrationController implements Initializable {

    @FXML
    private void handleBackToLoginButtonAction(ActionEvent event) throws IOException {
        System.out.println("Back to Login Button Clicked");

        Parent DashboardViewParent = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
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
