import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NewLoanController implements Initializable {

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
    private void handleSubmitButtonAction(ActionEvent event) throws IOException {
        System.out.println("Submit Loan Button Clicked");

//        Parent ProfileViewParent = FXMLLoader.load(getClass().getResource("ProfileView.fxml"));
//        Parent ProfileViewParent = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
        Parent ProfileViewParent = FXMLLoader.load(getClass().getResource("ProfileView.fxml"));

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
