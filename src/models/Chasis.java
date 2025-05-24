package models;

public class Chasis {
    private String tipoChasis;
    private String dimensiones;
    private Double peso;

    public Chasis () {}
    
    public String getTipoChasis(){
        return tipoChasis;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public Double getPeso() {
        return peso;
    }


    public void setTipoChasis(String tipoChasis) {
        this.tipoChasis = tipoChasis;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    public Chasis(String tipoChasis, String dimensiones, Double peso) {
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
