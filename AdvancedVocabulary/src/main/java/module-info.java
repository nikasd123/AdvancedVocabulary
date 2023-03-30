module com.example.advancedvocabulary {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.advancedvocabulary to javafx.fxml;
    exports com.example.advancedvocabulary;
}