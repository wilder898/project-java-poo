package models;

public class Sensor {
    private int velocidad;
    private int temperaturaSensor;
    private int presion;

    public Sensor() {}

    public int getVelocidad() {
        return velocidad;
    }



    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }



    public int getTemperaturaSensor() {
        return temperaturaSensor;
    }



    public void setTemperaturaSensor(int temperaturaSensor) {
        this.temperaturaSensor = temperaturaSensor;
    }



    public int getPresion() {
        return presion;
    }



    public void setPresion(int presion) {
        this.presion = presion;
    }



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
