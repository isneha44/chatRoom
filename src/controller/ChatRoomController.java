package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatRoomController {

    public JFXTextField messageTxt;
    public VBox vbox;
    public AnchorPane chatRoomContext;

    BufferedReader reader;
    PrintWriter writer;
    Socket socket;
    String userName;
    private FileChooser fileChooser;
    private File filePath;

    public void SendOnAction(ActionEvent actionEvent) {
    }
}
