module com.example.raceforfirstplace {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.raceforfirstplace to javafx.fxml;
    exports com.example.raceforfirstplace;
}