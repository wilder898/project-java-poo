package models;

public class Neumatico {
    public String marca;
    public String tamaño;
    public String presion;

    public Neumatico () {}

    public Neumatico (String marca, String tamaño, String presion) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.presion = presion;
    }

    public void displayInfo() {
        System.out.println("Informacion de neumatico: ");
        System.out.println("marca: " + marca);
        System.out.println("tamaño: " + tamaño);
        System.out.println("presion: " + presion);
    }
}
