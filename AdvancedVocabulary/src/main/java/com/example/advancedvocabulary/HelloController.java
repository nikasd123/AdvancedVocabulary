package com.example.advancedvocabulary;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HelloController {

    public ListView listView; // список слов
    public TextArea textArea; // значение слова
    public TextField inputTextField; // для ввода значения
    public Button close;
    ArrayList<String> originalWords = new ArrayList<>();
    ArrayList<String> translatedWords = new ArrayList<>();
    HashMap<String, String> vocabulary = new HashMap<>();

    public void closeWindow(ActionEvent actionEvent) {
        Stage closeWindow = (Stage) close.getScene().getWindow();
        closeWindow.close();
    }

    public void add(ActionEvent actionEvent) {
        String[] wordValue = inputTextField.getText().split(" ");
        originalWords.add(wordValue[0]); // add original word to list
        translatedWords.add(wordValue[1]); // add translated word to list

        inputTextField.clear(); // clearing field

        // vocabulary.put(originalWords.toString(), translatedWords.toString());

        int lastIndexOfOriginal = originalWords.size() - 1; // take last added values in list
        int lastIndexOfTranslated = translatedWords.size() - 1;

//        Iterator<String> original = originalWords.iterator();
//        Iterator<String> transtaled = translatedWords.iterator();

        for (int i = 0; i < originalWords.size(); i++) {
            if (i == lastIndexOfOriginal && i == lastIndexOfTranslated) {
                String originalWord = originalWords.get(i);
                String translatedWord = translatedWords.get(i);

                listView.getItems().add(originalWord);
//                textArea.getText().indexOf(translatedWord);

                vocabulary.put(originalWord, translatedWord);
            }
        }

    }

    public void getElement(MouseEvent mouseEvent) {
        // Отслеживание нажатия по индексу ListView
//        int selectedWordID = (int) listView.getSelectionModel().getSelectedItem();
//        textArea.getText();

        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            // получаем значение из HashMap по выбранному ключу
            String value = vocabulary.get(newValue);
            // устанавливаем значение в TextArea
            textArea.setText(value);
        });
    }

    public void deleteButton(ActionEvent event) {
        int selectedWordID = listView.getSelectionModel().getSelectedIndex();
        listView.getItems().remove(selectedWordID);
        // vocabulary.remove(selectedWordID);

    }
}