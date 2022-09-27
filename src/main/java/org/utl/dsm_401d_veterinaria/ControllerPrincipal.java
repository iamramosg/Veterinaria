package org.utl.dsm_401d_veterinaria;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class ControllerPrincipal {
    List<Mascota> listaMascotas = new ArrayList<>();
    @FXML
    private TextField txtDueno;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNombMascota;

    public void guardar(){
        Mascota newMascota = new Mascota();
        newMascota.setIdMascota(Integer.parseInt(txtId.getText()));
        newMascota.setNombreMascota(txtNombMascota.getText());
        newMascota.setIdMascota(Integer.parseInt(txtEdad.getText()));
        newMascota.setNombreDueno(txtDueno.getText());
        txtId.clear();
        txtNombMascota.clear();
        txtEdad.clear();
        txtDueno.clear();
        listaMascotas.add(newMascota);
        System.out.println(listaMascotas.size());
    }
    public void Mostrar(){

    }

}
