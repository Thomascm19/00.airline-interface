package proyecto.pkgfinal;


public class AerolineaMain {


    public static void main(String[] args) {
    Aerolinea AM = new Aerolinea ();
    AM.setNombre("AM");
    AM.setNit(1-2131231);
    AM.setDireccion("KR 12 #52-84 ");
    AM.setTelefono(8734672);
    AM.setEmpleados(475);
    AM.setAviones(47);
    
        Aviones AvionesAerolinea = new Aviones(47, "ACPM", "Charter" , "Rojo", 23, 1321,1231,12312);
        RutaOperacion RutaOperacion = new RutaOperacion(23,23,23,23,23,23);
        Personal personal = new Personal(213, 123, 123, 123, 123);

      
        
        System.out.println("La aerolinea tiene las siguientes caracteristicas: ");
        System.out.println("" +AM.getNombre()+ "\n"
                + AM.getNit() + "\n"
                + AM.getDireccion() + "\n"
                + AM.getTelefono() + "\n"
                + AM.getEmpleados() + "\n"
                + AM.getAviones() + "\n");

    }
    
}
