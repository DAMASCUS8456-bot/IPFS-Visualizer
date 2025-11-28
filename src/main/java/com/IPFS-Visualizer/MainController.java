package com.example.app;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class MainController {

    public void handleButton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Hello!");
        alert.setHeaderText(null);
        alert.setContentText("Button clicked!");
        alert.showAndWait();
    }
}
