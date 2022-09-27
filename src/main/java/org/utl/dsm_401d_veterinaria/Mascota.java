package org.utl.dsm_401d_veterinaria;

public class Mascota {
    private int idMascota;
    private String nombreMascota;
    private int edadMascota;
    private  String nombreDueno;

    public Mascota(){

    }

    public Mascota(int idMascota, String nombreMascota, int edadMascota, String nombreDueno) {
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
        this.nombreDueno = nombreDueno;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }
}
