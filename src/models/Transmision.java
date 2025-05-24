package models;

public class Transmision {
    private String tipo;
    private int numMarchas;
    private String marca;
    private String modelo;

    public Transmision() {}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
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
