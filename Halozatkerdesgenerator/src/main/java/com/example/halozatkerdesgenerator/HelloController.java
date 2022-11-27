package com.example.halozatkerdesgenerator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.FileNotFoundException;

import static com.example.halozatkerdesgenerator.Questions.loadQuestions;

public class HelloController {
    @FXML
    private Label question;

    @FXML
    private TextArea answer;

    @FXML
    protected void onNewQuestionButtonClick() throws FileNotFoundException {

        Questions q = loadQuestions(new Questions());
        question.setText(Questions.generateQuestion(q));
        answer.setText("");
    }
}