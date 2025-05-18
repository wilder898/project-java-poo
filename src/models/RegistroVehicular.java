package models;

public class RegistroVehicular {
    private String matricula;
    private String propietario;
    private String fechaDeRegistro;

    public RegistroVehicular () {}

    public RegistroVehicular(String matricula, String propietario, String fechaDeRegistro) {
        this.matricula = matricula;
        this.propietario = propietario;
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public void displayInfo() {
        System.out.println("Informacio de registro: ");
        System.out.println("Matricula: " + matricula);
        System.out.println("Propietario: " + propietario);
        System.out.println("Fecha de registro: " + fechaDeRegistro);
    }
    
}   
