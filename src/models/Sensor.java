package models;

public class Sensor {
    private int velocidad;
    private int temperaturaSensor;
    private int presion;

    public Sensor() {}

    public Sensor(int velocidad, int temperaturaSensor, int presion) {
        this.velocidad = velocidad;
        this.temperaturaSensor = temperaturaSensor;
        this.presion = presion;
    }

    public void displayInfo() {
        System.out.println("Informacion del sensor: ");
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("Temperatura: " + temperaturaSensor + "°C");
        System.out.println("Presion: " + presion + " PSI");
    }
}
