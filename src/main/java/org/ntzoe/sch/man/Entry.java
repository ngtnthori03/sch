package org.ntzoe.sch.man;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Entry extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        URL FXMLURL = getClass().getResource("/app.fxml");

        assert FXMLURL != null;
        Parent root = FXMLLoader.load(FXMLURL);

        Scene rootScene = new Scene(root);

        stage.setScene(rootScene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
