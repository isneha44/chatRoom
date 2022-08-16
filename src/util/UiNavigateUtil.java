package util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class UiNavigateUtil {

    public static void navigationForm(AnchorPane anchorPane, String url) throws IOException {

        anchorPane.getChildren().clear();
        Parent parent = FXMLLoader.load(UiNavigateUtil.class.getResource("../view/" + url + ".fxml"));
        anchorPane.getChildren().add(parent);
    }




    
}
