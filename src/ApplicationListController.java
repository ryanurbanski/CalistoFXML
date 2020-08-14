/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.LoanApplication;
import Model.Model;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JSakyi
 */
public class ApplicationListController implements Initializable {
    
    Model model = new Model();
    @FXML
    private ListView<String> listView; 


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<LoanApplication> loanApplications = model.getLd().getLoanApplications();
        ArrayList<String> ids = new ArrayList<String>();
        
        for(int i = 0; i < loanApplications.size(); i++){
            int id = loanApplications.get(i).getID();
            String idString = Integer.toString(id);
            ids.add(idString);
        }
       
        ObservableList<String> data = FXCollections.observableArrayList();
        
        listView.setItems(data);
        // TODO
        
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
    
    @FXML
    private void handleViewApplicationButtonAction(ActionEvent event) throws IOException {
        System.out.println("View Application Button Clicked");

        Parent LoginViewParent = FXMLLoader.load(getClass().getResource("ApplicationView.fxml"));
        
        Scene loginScene = new Scene(LoginViewParent);

        // get the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(loginScene);
        window.show();

    }
    
    
    
}
