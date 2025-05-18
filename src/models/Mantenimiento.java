package models;

public class Mantenimiento {
    private String fechaMantenimiento;
    private String proxMantenimientio;

    public Mantenimiento () {}

    public Mantenimiento(String fechaMantenimiento, String proxMantenimientio) {
        this.fechaMantenimiento = fechaMantenimiento;
        this.proxMantenimientio = proxMantenimientio;
    }

    public void displayInfo() {
        System.out.println("Informacion de mantenimiento: ");
        System.out.println("Fecha de mantenimiento: " + fechaMantenimiento);
        System.out.println("Proximo mantenimiento: " + proxMantenimientio);
    }
}
