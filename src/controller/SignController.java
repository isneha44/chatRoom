package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SignController {
    public static String username;
    public AnchorPane signContex;
    public JFXTextField txtUserName;

    public void initialize() throws IOException {

    }

    public void SignOnAction(ActionEvent actionEvent) throws IOException {

        if (!txtUserName.getText().isEmpty()) {
            username = txtUserName.getText();
            UiNavigateUtil.newUi(signContex, "ChatRoom");
        }
    }

    public void cancelOnAction(ActionEvent actionEvent) {

        UiNavigateUtil.closeForm(signContex);
    }
}
