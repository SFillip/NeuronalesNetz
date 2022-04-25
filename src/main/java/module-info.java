module com.example.csmapguesser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csmapguesser to javafx.fxml;
    exports com.example.csmapguesser;
}