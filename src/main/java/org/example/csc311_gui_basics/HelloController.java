package org.example.csc311_gui_basics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.image.ImageView;
import javafx.scene.shape.Shape;


public class HelloController {


    @FXML
    private ImageView Meme;

    @FXML
    private Label welcomeText;

    @FXML
    private Button DogeButton;

    @FXML
    public Button PressMe;

    @FXML
    private Label WelcomeIn;


    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to Wacky Buttons!!!");
    }

    @FXML
    protected void OnPressMeCLick(){
        WelcomeIn.setText("That click was weird -_-");
    }

    boolean DogeAppear = false;

    @FXML
    protected void OnDontDoItClick() {

        if (DogeAppear) {
            Meme.setVisible(false);
            DogeAppear = false;
        }

        else {
            DogeAppear = true;
            Meme.setVisible(true);
        }
    }

}