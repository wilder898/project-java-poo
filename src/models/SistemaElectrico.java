package models;

public class SistemaElectrico {
    private String bateria;
    private String luces;
    private String sensores;

    public SistemaElectrico() {}

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getLuces() {
        return luces;
    }

    public void setLuces(String luces) {
        this.luces = luces;
    }

    public String getSensores() {
        return sensores;
    }

    public void setSensores(String sensores) {
        this.sensores = sensores;
    }

    public SistemaElectrico(String bateria, String luces, String sensores) {
        this.bateria = bateria;
        this.luces = luces;
        this.sensores = sensores;
    }

    public void displayInfo() {
        System.out.println("Informacion del sistema electrico:");
        System.out.println("bateria: " + bateria);
        System.out.println("luces: " + luces);
        System.out.println("sensores: " + sensores);
    }

}
