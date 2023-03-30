package com.example.advancedvocabulary;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.HashMap;

public class HelloController {

    public ListView inputListView; // список слов
    public TextArea inputTextArea; // значение слова
    public TextField inputTextField; // для ввода значения
    public Button close;
    HashMap <String, String> vocabulary = new HashMap<>();
    public void closeWindow(ActionEvent actionEvent) {
        Stage closeWindow = (Stage) close.getScene().getWindow();
        closeWindow.close();
    }

    public void add(ActionEvent actionEvent) {
        String[] wordValue = inputTextField.getText().split("\s");
        vocabulary.put(wordValue[0], wordValue[1]);
        inputTextField.clear();

        // get last key
        inputListView.getItems().add(vocabulary.keySet().toString());
    }

    public void getElement(MouseEvent mouseEvent) {
        // какое поле отмечено
        inputTextArea.setText(vocabulary.get(""));
    }
}