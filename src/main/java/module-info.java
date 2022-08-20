module com.moody.pgameclient {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.moody.pgameclient to javafx.fxml;
    exports com.moody.pgameclient;
}