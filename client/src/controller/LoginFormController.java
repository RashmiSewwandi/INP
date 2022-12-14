package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginFormController {
    public TextField txtUserName;
    public PasswordField txtPassword;
    public AnchorPane loginFormContext;


    public void logInOnAction(ActionEvent actionEvent) throws IOException {
        if (txtUserName.getText().equals("client1") && txtPassword.getText().equals("1234")) {
            Stage stage = new Stage();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ClientForm1.fxml"))));
            stage.setTitle("Play Tech Chat App  - Client Chat 01");
            stage.show();
        /*if (txtUserName.getText().equals("client1") && txtPassword.getText().equals("1234")) {
            Stage stage = new Stage();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/ClientForm1.fxml"))));
            stage.setTitle("Play Tech Chat App  - Client Chat ");
            stage.show();*/
        } else if (txtUserName.getText().equals("client2") && txtPassword.getText().equals("1234")) {
            Stage stage = new Stage();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ClientForm2.fxml"))));
            stage.setTitle("Play Tech Chat App  - Client Chat 01");
            stage.show();

        } else if (txtUserName.getText().equals("client3") && txtPassword.getText().equals("1234")) {
            Stage stage = new Stage();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ClientForm3.fxml"))));
            stage.setTitle("Play Tech Chat App  - Client Chat 02");
            stage.show();
        } else {
            new Alert(Alert.AlertType.ERROR, "Please Try Again").show();
        }

    }
}
