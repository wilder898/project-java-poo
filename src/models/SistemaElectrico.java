package models;

public class SistemaElectrico {
    private String bateria;
    private String luces;
    private String sensores;

    public SistemaElectrico() {}

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
