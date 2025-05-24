package models;

public class Neumatico {
    public String marca;
    public String tamaño;
    public String presion;

    public Neumatico () {}

    public String getMarca(){
        return marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getPresion() {
        return presion;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }


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
