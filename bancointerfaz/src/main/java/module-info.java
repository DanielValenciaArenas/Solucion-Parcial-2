module co.uniquindio.banco {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.uniquindio.banco to javafx.fxml;
    exports co.uniquindio.banco;
}
