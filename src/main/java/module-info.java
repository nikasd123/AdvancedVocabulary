module com.example.generalgraphic {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.generalgraphic to javafx.fxml;
    exports com.example.generalgraphic;
}