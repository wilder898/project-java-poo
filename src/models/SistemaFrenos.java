package models;

public class SistemaFrenos {
    private String tipo;
    private String discos;
    private String ABS;
    private String estado;

    public SistemaFrenos() {}

    public SistemaFrenos(String tipo, String discos, String ABS, String estado) {
        this.tipo = tipo;
        this.discos = discos;
        this.ABS = ABS;
        this.estado = estado;
    }

    public void displayInfo() {
        System.out.println("Informacion del sistema de frenos:");
        System.out.println("tipo: " + tipo);
        System.out.println("discos: " + discos);
        System.out.println("ABS: " + ABS);
        System.out.println("estado: " + estado);
    }
}
