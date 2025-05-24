import models.*;

public class CarDemo {
    
    public static void main(String[] args) throws Exception {

        Car myCar = new Car();

        myCar.setMake("Hyundai");
        myCar.setModel("Atos");
        myCar.setYear(1999);

        System.out.println("Make:" + myCar.getMake() + " Model:" + myCar.getModel() + " Year:" + myCar.getYear());

        Car crisCar = new Car();
        crisCar.setMake("Toyota");
        crisCar.setModel("Corolla");
        crisCar.setYear(2010);

        System.out.println("Make:" + crisCar.getMake() + " Model:" + crisCar.getModel() + " Year:" + crisCar.getYear());

        Car car3 = new Car();
        car3.setMake("Chevrolet");
        car3.setModel("Spark");
        car3.setYear(2015);

        System.out.println("Make:" + car3.getMake() + " Model:" + car3.getModel() + " Year:" + car3.getYear());

        Car car4 = new Car();
        car4.setMake("Mazda");
        car4.setModel("3");
        car4.setYear(2022);

        System.out.println("Make:" + car4.getMake() + " Model:" + car4.getModel() + " Year:" + car4.getYear());
        System.out.println("-----------------------------");
    
        Chasis chasis = new Chasis();
        chasis.setTipoChasis("Aluminio");
        chasis.setDimensiones("4.5m x 1.8m x 1.4m");
        chasis.setPeso(1200.0);

        System.out.println("Tipo de chasis: " + chasis.getTipoChasis() + " Dimensiones: " + chasis.getDimensiones() + " Peso: " + chasis.getPeso() + " kg");

        Chasis chasis2 = new Chasis();
        chasis2.setTipoChasis("Acero");
        chasis2.setDimensiones("4.2m x 1.7m x 1.5m");   
        chasis2.setPeso(1300.0);

        System.out.println("Tipo de chasis: " + chasis2.getTipoChasis() + " Dimensiones: " + chasis2.getDimensiones() + " Peso: " + chasis2.getPeso() + " kg");

        Chasis chasis3 = new Chasis();
        chasis3.setTipoChasis("Fibra de carbono");
        chasis3.setDimensiones("4.0m x 1.6m x 1.3m");
        chasis3.setPeso(900.0);

        System.out.println("Tipo de chasis: " + chasis3.getTipoChasis() + " Dimensiones: " + chasis3.getDimensiones() + " Peso: " + chasis3.getPeso() + " kg");

        Chasis chasis4 = new Chasis();
        chasis4.setTipoChasis("Acero inoxidable");
        chasis4.setDimensiones("4.3m x 1.8m x 1.4m");
        chasis4.setPeso(1400.0);

        System.out.println("Tipo de chasis: " + chasis4.getTipoChasis() + " Dimensiones: " + chasis4.getDimensiones() + " Peso: " + chasis4.getPeso() + " kg");
        System.out.println("-----------------------------");

        Mantenimiento mantenimiento1 = new Mantenimiento();
        mantenimiento1.setFechaMantenimiento("01/01/2024");
        mantenimiento1.setProxMantenimientio("01/07/2024");
        System.out.println("Fecha Mantenimiento: " + mantenimiento1.getFechaMantenimiento() + " Próximo: " + mantenimiento1.getProxMantenimientio());
        
        Mantenimiento mantenimiento2 = new Mantenimiento();
        mantenimiento2.setFechaMantenimiento("15/02/2024");
        mantenimiento2.setProxMantenimientio("15/08/2024");
        System.out.println("Fecha Mantenimiento: " + mantenimiento2.getFechaMantenimiento() + " Próximo: " + mantenimiento2.getProxMantenimientio());
        
        Mantenimiento mantenimiento3 = new Mantenimiento();
        mantenimiento3.setFechaMantenimiento("30/03/2024");
        mantenimiento3.setProxMantenimientio("30/09/2024");
        System.out.println("Fecha Mantenimiento: " + mantenimiento3.getFechaMantenimiento() + " Próximo: " + mantenimiento3.getProxMantenimientio());
        
        Mantenimiento mantenimiento4 = new Mantenimiento();
        mantenimiento4.setFechaMantenimiento("10/04/2024");
        mantenimiento4.setProxMantenimientio("10/10/2024");
        System.out.println("Fecha Mantenimiento: " + mantenimiento4.getFechaMantenimiento() + " Próximo: " + mantenimiento4.getProxMantenimientio());
        System.out.println("-----------------------------");

        Neumatico neumatico1 = new Neumatico();
        neumatico1.setMarca("Michelin");
        neumatico1.setTamaño("215/55 R17");
        neumatico1.setPresion("32 PSI");
        System.out.println("Marca: " + neumatico1.getMarca() + " Tamaño: " + neumatico1.getTamaño() + " Presión: " + neumatico1.getPresion());
        
        Neumatico neumatico2 = new Neumatico();
        neumatico2.setMarca("Goodyear");
        neumatico2.setTamaño("195/65 R15");
        neumatico2.setPresion("30 PSI");
        System.out.println("Marca: " + neumatico2.getMarca() + " Tamaño: " + neumatico2.getTamaño() + " Presión: " + neumatico2.getPresion());
        
        Neumatico neumatico3 = new Neumatico();
        neumatico3.setMarca("Pirelli");
        neumatico3.setTamaño("225/45 R18");
        neumatico3.setPresion("35 PSI");
        System.out.println("Marca: " + neumatico3.getMarca() + " Tamaño: " + neumatico3.getTamaño() + " Presión: " + neumatico3.getPresion());
        
        Neumatico neumatico4 = new Neumatico();
        neumatico4.setMarca("Bridgestone");
        neumatico4.setTamaño("205/60 R16");
        neumatico4.setPresion("33 PSI");
        System.out.println("Marca: " + neumatico4.getMarca() + " Tamaño: " + neumatico4.getTamaño() + " Presión: " + neumatico4.getPresion());
        System.out.println("-----------------------------");
    
        RegistroVehicular registro1 = new RegistroVehicular();
        registro1.setMatricula("ABC123");
        registro1.setPropietario("Juan Perez");
        registro1.setFechaDeRegistro("01/01/2024");
        System.out.println("Matricula: " + registro1.getMatricula() + " Propietario: " + registro1.getPropietario() + " Fecha: " + registro1.getFechaDeRegistro());
        
        RegistroVehicular registro2 = new RegistroVehicular();
        registro2.setMatricula("XYZ789");
        registro2.setPropietario("Maria Lopez");
        registro2.setFechaDeRegistro("15/02/2024");
        System.out.println("Matricula: " + registro2.getMatricula() + " Propietario: " + registro2.getPropietario() + " Fecha: " + registro2.getFechaDeRegistro());
        
        RegistroVehicular registro3 = new RegistroVehicular();
        registro3.setMatricula("DEF456");
        registro3.setPropietario("Carlos Rodriguez");
        registro3.setFechaDeRegistro("30/03/2024");
        System.out.println("Matricula: " + registro3.getMatricula() + " Propietario: " + registro3.getPropietario() + " Fecha: " + registro3.getFechaDeRegistro());
        
        RegistroVehicular registro4 = new RegistroVehicular();
        registro4.setMatricula("GHI789");
        registro4.setPropietario("Ana Martinez");
        registro4.setFechaDeRegistro("10/04/2024");
        System.out.println("Matricula: " + registro4.getMatricula() + " Propietario: " + registro4.getPropietario() + " Fecha: " + registro4.getFechaDeRegistro());
        System.out.println("-----------------------------");

        Sensor sensor1 = new Sensor();
        sensor1.setVelocidad(120);
        sensor1.setTemperaturaSensor(90);
        sensor1.setPresion(32);
        System.out.println("Velocidad: " + sensor1.getVelocidad() + " km/h Temperatura: " + sensor1.getTemperaturaSensor() + "°C Presion: " + sensor1.getPresion() + " PSI");
        
        Sensor sensor2 = new Sensor();
        sensor2.setVelocidad(80);
        sensor2.setTemperaturaSensor(85);
        sensor2.setPresion(30);
        System.out.println("Velocidad: " + sensor2.getVelocidad() + " km/h Temperatura: " + sensor2.getTemperaturaSensor() + "°C Presion: " + sensor2.getPresion() + " PSI");
        
        Sensor sensor3 = new Sensor();
        sensor3.setVelocidad(100);
        sensor3.setTemperaturaSensor(88);
        sensor3.setPresion(31);
        System.out.println("Velocidad: " + sensor3.getVelocidad() + " km/h Temperatura: " + sensor3.getTemperaturaSensor() + "°C Presion: " + sensor3.getPresion() + " PSI");
        
        Sensor sensor4 = new Sensor();
        sensor4.setVelocidad(60);
        sensor4.setTemperaturaSensor(82);
        sensor4.setPresion(29);
        System.out.println("Velocidad: " + sensor4.getVelocidad() + " km/h Temperatura: " + sensor4.getTemperaturaSensor() + "°C Presion: " + sensor4.getPresion() + " PSI");
        System.out.println("-----------------------------");

        SistemaElectrico sistema1 = new SistemaElectrico();
        sistema1.setBateria("12V");
        sistema1.setLuces("LED");
        sistema1.setSensores("Proximidad");
        System.out.println("Bateria: " + sistema1.getBateria() + " Luces: " + sistema1.getLuces() + " Sensores: " + sistema1.getSensores());
        
        SistemaElectrico sistema2 = new SistemaElectrico();
        sistema2.setBateria("24V");
        sistema2.setLuces("Halógenas");
        sistema2.setSensores("Temperatura");
        System.out.println("Bateria: " + sistema2.getBateria() + " Luces: " + sistema2.getLuces() + " Sensores: " + sistema2.getSensores());
        
        SistemaElectrico sistema3 = new SistemaElectrico();
        sistema3.setBateria("48V");
        sistema3.setLuces("Xenón");
        sistema3.setSensores("Lluvia");
        System.out.println("Bateria: " + sistema3.getBateria() + " Luces: " + sistema3.getLuces() + " Sensores: " + sistema3.getSensores());
        
        SistemaElectrico sistema4 = new SistemaElectrico();
        sistema4.setBateria("36V");
        sistema4.setLuces("LED Matrix");
        sistema4.setSensores("Parking");
        System.out.println("Bateria: " + sistema4.getBateria() + " Luces: " + sistema4.getLuces() + " Sensores: " + sistema4.getSensores());
        System.out.println("-----------------------------");

        SistemaFrenos frenos1 = new SistemaFrenos();
        frenos1.setTipo("Hidráulico");
        frenos1.setDiscos("Ventilados");
        frenos1.setABS("Sí");
        frenos1.setEstado("Nuevo");
        System.out.println("Tipo: " + frenos1.getTipo() + " Discos: " + frenos1.getDiscos() + " ABS: " + frenos1.getABS() + " Estado: " + frenos1.getEstado());
        
        SistemaFrenos frenos2 = new SistemaFrenos();
        frenos2.setTipo("Mecánico");
        frenos2.setDiscos("Sólidos");
        frenos2.setABS("No");
        frenos2.setEstado("Usado");
        System.out.println("Tipo: " + frenos2.getTipo() + " Discos: " + frenos2.getDiscos() + " ABS: " + frenos2.getABS() + " Estado: " + frenos2.getEstado());
        
        SistemaFrenos frenos3 = new SistemaFrenos();
        frenos3.setTipo("Electrónico");
        frenos3.setDiscos("Perforados");
        frenos3.setABS("Sí");
        frenos3.setEstado("Nuevo");
        System.out.println("Tipo: " + frenos3.getTipo() + " Discos: " + frenos3.getDiscos() + " ABS: " + frenos3.getABS() + " Estado: " + frenos3.getEstado());
        
        SistemaFrenos frenos4 = new SistemaFrenos();
        frenos4.setTipo("Hidráulico");
        frenos4.setDiscos("Rayados");
        frenos4.setABS("Sí");
        frenos4.setEstado("Mantenimiento");
        System.out.println("Tipo: " + frenos4.getTipo() + " Discos: " + frenos4.getDiscos() + " ABS: " + frenos4.getABS() + " Estado: " + frenos4.getEstado());
        System.out.println("-----------------------------");

        Transmision trans1 = new Transmision();
        trans1.setTipo("Manual");
        trans1.setNumMarchas(5);
        trans1.setMarca("ZF");
        trans1.setModelo("M5");
        System.out.println("Tipo: " + trans1.getTipo() + " Marchas: " + trans1.getNumMarchas() + " Marca: " + trans1.getMarca() + " Modelo: " + trans1.getModelo());
        
        Transmision trans2 = new Transmision();
        trans2.setTipo("Automática");
        trans2.setNumMarchas(6);
        trans2.setMarca("Aisin");
        trans2.setModelo("AT6");
        System.out.println("Tipo: " + trans2.getTipo() + " Marchas: " + trans2.getNumMarchas() + " Marca: " + trans2.getMarca() + " Modelo: " + trans2.getModelo());
        
        Transmision trans3 = new Transmision();
        trans3.setTipo("CVT");
        trans3.setNumMarchas(0);
        trans3.setMarca("JATCO");
        trans3.setModelo("CVT8");
        System.out.println("Tipo: " + trans3.getTipo() + " Marchas: " + trans3.getNumMarchas() + " Marca: " + trans3.getMarca() + " Modelo: " + trans3.getModelo());
        
        Transmision trans4 = new Transmision();
        trans4.setTipo("DCT");
        trans4.setNumMarchas(7);
        trans4.setMarca("Getrag");
        trans4.setModelo("7DCT");
        System.out.println("Tipo: " + trans4.getTipo() + " Marchas: " + trans4.getNumMarchas() + " Marca: " + trans4.getMarca() + " Modelo: " + trans4.getModelo());
        System.out.println("-----------------------------");

        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setIdentificacion("ABC123");
        vehiculo1.setMarca("Ford");
        vehiculo1.setModelo("Mustang");
        vehiculo1.setColor("Rojo");
        System.out.println("ID: " + vehiculo1.getIdentificacion() + " Marca: " + vehiculo1.getMarca() + " Modelo: " + vehiculo1.getModelo() + " Color: " + vehiculo1.getColor());
        
        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.setIdentificacion("XYZ789");
        vehiculo2.setMarca("Volkswagen");
        vehiculo2.setModelo("Golf");
        vehiculo2.setColor("Negro");
        System.out.println("ID: " + vehiculo2.getIdentificacion() + " Marca: " + vehiculo2.getMarca() + " Modelo: " + vehiculo2.getModelo() + " Color: " + vehiculo2.getColor());
        
        Vehiculo vehiculo3 = new Vehiculo();
        vehiculo3.setIdentificacion("DEF456");
        vehiculo3.setMarca("Honda");
        vehiculo3.setModelo("Civic");
        vehiculo3.setColor("Azul");
        System.out.println("ID: " + vehiculo3.getIdentificacion() + " Marca: " + vehiculo3.getMarca() + " Modelo: " + vehiculo3.getModelo() + " Color: " + vehiculo3.getColor());
        
        Vehiculo vehiculo4 = new Vehiculo();
        vehiculo4.setIdentificacion("GHI321");
        vehiculo4.setMarca("BMW");
        vehiculo4.setModelo("X5");
        vehiculo4.setColor("Blanco");
        System.out.println("ID: " + vehiculo4.getIdentificacion() + " Marca: " + vehiculo4.getMarca() + " Modelo: " + vehiculo4.getModelo() + " Color: " + vehiculo4.getColor());
        System.out.println("-----------------------------");
    }
}
