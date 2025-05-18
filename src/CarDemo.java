import models.Car;
import models.Vehiculo;
import models.Transmision;
import models.Chasis;
import models.Neumatico;
import models.SistemaElectrico;
import models.SistemaFrenos;
import models.RegistroVehicular;
import models.Mantenimiento;
import models.Sensor;

public class CarDemo {
    
    public static void main(String[] args) throws Exception {

        Car myCar = new Car("toyota", "corolla", 2020);
        myCar.displayInfo();
        Car crisCar = new Car("honda", "civic", 2021);
        crisCar.displayInfo();    

        Vehiculo elMerengo = new Vehiculo("b354486s", "Hyundai", "Atos", "Azul");
        elMerengo.displayInfo();

        Transmision transmision = new Transmision("Manual", 6, "Hyundai", "Atos");
        transmision.displayInfo();

        Chasis chasisMerengo = new Chasis("Monocasco", "Compacto", "1200kg");
        chasisMerengo.displayInfo();

        Neumatico neumatico = new Neumatico("Pirelli", "80/100/17", "32PSI");
        neumatico.displayInfo();

        SistemaElectrico sistemaElectrico = new SistemaElectrico("Bateria de litio", "LED", "Sensores de estacionamiento");
        sistemaElectrico.displayInfo();

        SistemaFrenos sistemaFrenos = new SistemaFrenos("Discos", "Delanteros y traseros", "Si", "Bueno");
        sistemaFrenos.displayInfo();

        RegistroVehicular registro = new RegistroVehicular("BUZ665", "Wilder Aristizabal", "18/05/2025");
        registro.displayInfo();

        Mantenimiento mantenimiento = new Mantenimiento("18/05/2025", "18/11/2025");
        mantenimiento.displayInfo();

        Sensor sensor = new Sensor(120 , 85, 30);
        sensor.displayInfo();
    }
}
