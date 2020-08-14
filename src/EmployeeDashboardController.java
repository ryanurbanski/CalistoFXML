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

public class EmployeeDashboardController implements Initializable {

    @FXML
    private void handleViewApplicationListButtonAction(ActionEvent event) throws IOException {
        System.out.println("View Application List Button Clicked");


        Parent DashboardViewParent = FXMLLoader.load(getClass().getResource("ApplicationList.fxml"));
        Scene dashboardScene = new Scene(DashboardViewParent);

        // get the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(dashboardScene);
        window.show();

    }

    @FXML
    private void handleSearchButtonAction(ActionEvent event) throws IOException {
        System.out.println("Search Button Clicked");
//
//
//        Parent DashboardViewParent = FXMLLoader.load(getClass().getResource("ApplicationList.fxml"));
//        Scene dashboardScene = new Scene(DashboardViewParent);
//
//        // get the Stage information
//        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
//
//        window.setScene(dashboardScene);
//        window.show();

    }

    @FXML
    private void handleLogoutButtonAction(ActionEvent event) throws IOException {
        System.out.println("Logout Button Clicked");


        Parent DashboardViewParent = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
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
