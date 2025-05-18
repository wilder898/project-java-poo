package models;

public class Vehiculo {
    private String identificacion;
    private String marca;
    private String modelo;
    private String color;

    public Vehiculo() {}

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
