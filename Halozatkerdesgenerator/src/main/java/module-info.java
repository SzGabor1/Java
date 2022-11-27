module com.example.halozatkerdesgenerator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.halozatkerdesgenerator to javafx.fxml;
    exports com.example.halozatkerdesgenerator;
}