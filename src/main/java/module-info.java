module org.utl.dsm_401d_veterinaria {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.utl.dsm_401d_veterinaria to javafx.fxml;
    exports org.utl.dsm_401d_veterinaria;
}