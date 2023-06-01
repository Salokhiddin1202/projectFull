module com.example.projectfull {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projectfull to javafx.fxml;
    exports com.example.projectfull;
}