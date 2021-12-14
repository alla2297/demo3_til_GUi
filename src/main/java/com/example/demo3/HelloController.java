package com.example.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick2() {
        welcomeText.setText("Hello Java!!");
    }
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hello Datamatiker");
    }
    @FXML
    protected void onHelloButtonClick3() {
        welcomeText.setText("opgave er afleveret");
    }
}