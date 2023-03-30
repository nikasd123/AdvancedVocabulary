package com.example.generalgraphic;

import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {
    // Logic
    public TextField input;
    public ListView inputListView;
    private ArrayList<String> words = new ArrayList<>();

    public void addWord(ActionEvent actionEvent) {
        // Простой путь
        // inputListView.getItems().add(input.getText());

        words.add(input.getText());
        inputListView.getItems().add(words.get(words.indexOf(input.getText())));
    }
}