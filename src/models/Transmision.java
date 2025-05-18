package models;

public class Transmision {
    private String tipo;
    private int numMarchas;
    private String marca;
    private String modelo;

    public Transmision() {}

    public Transmision(String tipo, int numMarchas, String marca, String modelo) {
        this.tipo = tipo;
        this.numMarchas = numMarchas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void displayInfo() {
        System.out.println("Transmision Informacion:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Numero de Marchas: " + numMarchas);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

}
