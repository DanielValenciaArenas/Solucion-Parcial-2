package co.uniquindio.banco.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class BancoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCrearCuenta;

    @FXML
    private TextField txApellidos;

    @FXML
    private TextField txNombre;

    @FXML
    private TextField txNumeroCuenta;

    @FXML
    private TextField txSaldoCuenta;

    @FXML
    void crearCuenta(ActionEvent event) {
        System.out.println("Tu cuenta ha sido creada con éxito!");
    }

    @FXML
    void initialize() {
        
    }

}
