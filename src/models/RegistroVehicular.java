package models;

public class RegistroVehicular {
    private String matricula;
    private String propietario;
    private String fechaDeRegistro;

    public RegistroVehicular () {}

    public String getMatricula(){
        return matricula;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getFechaDeRegistro() {
        return fechaDeRegistro;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setFechaDeRegistro(String fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

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
