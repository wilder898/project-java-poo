package models;

public class Chasis {
    private String tipoChasis;
    private String dimensiones;
    private String peso;

    public Chasis () {}

    public Chasis(String tipoChasis, String dimensiones, String peso) {
        this.tipoChasis = tipoChasis;
        this.dimensiones = tipoChasis;
        this.peso = peso;
    }

    public void displayInfo() {
        System.out.println("Informacion del cahsis:");
        System.out.println("tipo: " + tipoChasis);
        System.out.println("dimensiones: " + dimensiones);
        System.out.println("peso: " + peso);
    }

}
