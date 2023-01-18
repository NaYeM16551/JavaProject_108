module com.example.peoplesearch {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.peoplesearch to javafx.fxml;
    exports com.example.peoplesearch;
    exports Server;
    opens Server to javafx.fxml;
    //import Server;
}