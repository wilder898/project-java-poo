package models;

public class Vehiculo {
    private String identificacion;
    private String marca;
    private String modelo;
    private String color;

    public Vehiculo() {}

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehiculo(String identificacion, String marca, String modelo, String color) {
        this.identificacion = identificacion;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Vehiculo Information:");
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
    }
}
