module schule.nutriscore {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires javafx.graphics;

    opens schule.nutriscore to javafx.fxml;
    exports schule.nutriscore;
}