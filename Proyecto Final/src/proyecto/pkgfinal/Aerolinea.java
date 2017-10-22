package proyecto.pkgfinal;


public class Aerolinea {
    private String Nombre;
    private int Nit;
    private String Direccion;
    private int Telefono;
    private int Empleados;
    private int Aviones;
    
        
    public Aerolinea(String Nombre, int Nit, String Direccion, int Telefono,int Empleados,int Aviones){
        this.Nombre = Nombre;
        this.Nit= Nit;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Empleados = Empleados;
        this.Aviones = Aviones;

    }
        public Aerolinea(){
        
    }
    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Nit
     */
    public int getNit() {
        return Nit;
    }

    /**
     * @param Nit the Nit to set
     */
    public void setNit(int Nit) {
        this.Nit = Nit;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the Telefono
     */
    public int getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the Empleados
     */
    public int getEmpleados() {
        return Empleados;
    }

    /**
     * @param Empleados the Empleados to set
     */
    public void setEmpleados(int Empleados) {
        this.Empleados = Empleados;
    }

    /**
     * @return the Aviones
     */
    public int getAviones() {
        return Aviones;
    }

    /**
     * @param Aviones the Aviones to set
     */
    public void setAviones(int Aviones) {
        this.Aviones = Aviones;
    }
    
}
