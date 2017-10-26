package proyecto.pkgfinal;


import java.util.Date;


public class Paquetes {
    
    private String cuidad_origen;
    private String ciudad_destino;
    private Date fecha_ida;
    private Date fecha_regreso;
    private int numero_Adultos;
    private int numero_Niños;
    private int numero_Bebes;
    private int Numero_Habitaciones;
    private String Clase;
    private String Seleccion_Paquetes;
    private String cc;
    private int numero_sillasA;
    private int numero_sillasN;
    private int numero_sillasB;

    public Paquetes(String Ciudad_destino, String Ciudad_origen, Date Fecha_regreso, Date Fecha_ida, int Numero_adultos, int Numero_niños, int Numero_bebes, int Numero_Habitaciones, String Clase, String Seleccion_Paquetes, String cc, int Numero_SillasA, int Numero_SillasB, int Numero_SillasN) {
        
        this.cc = cc;
        this.ciudad_destino = Ciudad_destino;
        this.cuidad_origen = Ciudad_origen;
        this.fecha_ida = Fecha_ida;
        this.fecha_regreso = Fecha_regreso;
        this.numero_Adultos = Numero_adultos;
        this.numero_Bebes = Numero_bebes;
        this.numero_Niños = Numero_niños;
        this.numero_sillasA = Numero_SillasA;
        this.numero_sillasB = Numero_SillasB;
        this.numero_sillasN = Numero_SillasN;  
        this.Clase = Clase;  
        this.Numero_Habitaciones = Numero_Habitaciones;  
        this.Seleccion_Paquetes = Seleccion_Paquetes;  
    }

    public Paquetes() {
        
    }



    /**
     * @return the cuidad_origen
     */
    public String getCuidad_origen() {
        return cuidad_origen;
    }

    /**
     * @param cuidad_origen the cuidad_origen to set
     */
    public void setCuidad_origen(String cuidad_origen) {
        this.cuidad_origen = cuidad_origen;
    }

    /**
     * @return the ciudad_destino
     */
    public String getCiudad_destino() {
        return ciudad_destino;
    }

    /**
     * @param ciudad_destino the ciudad_destino to set
     */
    public void setCiudad_destino(String ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }

    /**
     * @return the fecha_ida
     */
    public Date getFecha_ida() {
        return fecha_ida;
    }

    /**
     * @param fecha_ida the fecha_ida to set
     */
    public void setFecha_ida(Date fecha_ida) {
        this.fecha_ida = fecha_ida;
    }

    /**
     * @return the fecha_regreso
     */
    public Date getFecha_regreso() {
        return fecha_regreso;
    }

    /**
     * @param fecha_regreso the fecha_regreso to set
     */
    public void setFecha_regreso(Date fecha_regreso) {
        this.fecha_regreso = fecha_regreso;
    }

    /**
     * @return the numero_Adultos
     */
    public int getNumero_Adultos() {
        return numero_Adultos;
    }

    /**
     * @param numero_Adultos the numero_Adultos to set
     */
    public void setNumero_Adultos(int numero_Adultos) {
        this.numero_Adultos = numero_Adultos;
    }

    /**
     * @return the numero_Niños
     */
    public int getNumero_Niños() {
        return numero_Niños;
    }

    /**
     * @param numero_Niños the numero_Niños to set
     */
    public void setNumero_Niños(int numero_Niños) {
        this.numero_Niños = numero_Niños;
    }

    /**
     * @return the numero_Bebes
     */
    public int getNumero_Bebes() {
        return numero_Bebes;
    }

    /**
     * @param numero_Bebes the numero_Bebes to set
     */
    public void setNumero_Bebes(int numero_Bebes) {
        this.numero_Bebes = numero_Bebes;
    }

    /**
     * @return the Numero_Habitaciones
     */
    public int getNumero_Habitaciones() {
        return Numero_Habitaciones;
    }

    /**
     * @param Numero_Habitaciones the Numero_Habitaciones to set
     */
    public void setNumero_Habitaciones(int Numero_Habitaciones) {
        this.Numero_Habitaciones = Numero_Habitaciones;
    }

    /**
     * @return the Clase
     */
    public String getClase() {
        return Clase;
    }

    /**
     * @param Clase the Clase to set
     */
    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    /**
     * @return the Paquetes
     */
    public String getSeleccion_Paquetes() {
        return Seleccion_Paquetes;
    }

    /**
     * @param Seleccion_Paquetes the Paquetes to set
     */
    public void setSeleccion_Paquetes(String Seleccion_Paquetes) {
        this.Seleccion_Paquetes = Seleccion_Paquetes;
    }

    /**
     * @return the cc
     */
    public String getCc() {
        return cc;
    }

    /**
     * @param cc the cc to set
     */
    public void setCc(String cc) {
        this.cc = cc;
    }

    /**
     * @return the numero_sillasA
     */
    public int getNumero_sillasA() {
        return numero_sillasA;
    }

    /**
     * @param numero_sillasA the numero_sillasA to set
     */
    public void setNumero_sillasA(int numero_sillasA) {
        this.numero_sillasA = numero_sillasA;
    }

    /**
     * @return the numero_sillasN
     */
    public int getNumero_sillasN() {
        return numero_sillasN;
    }

    /**
     * @param numero_sillasN the numero_sillasN to set
     */
    public void setNumero_sillasN(int numero_sillasN) {
        this.numero_sillasN = numero_sillasN;
    }

    /**
     * @return the numero_sillasB
     */
    public int getNumero_sillasB() {
        return numero_sillasB;
    }

    /**
     * @param numero_sillasB the numero_sillasB to set
     */
    public void setNumero_sillasB(int numero_sillasB) {
        this.numero_sillasB = numero_sillasB;
    }

}
