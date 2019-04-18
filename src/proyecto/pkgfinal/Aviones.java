package proyecto.pkgfinal;


public class Aviones {
    private int sillas;
    private String combustible;
    private String tipoVuelo;
    private String EstadoVuelo;
    private int Vuelo;
    private double Peso;
    private double Tamaño;
    private int turbinas;

    public Aviones(int sillas, String combustible, String tipoVuelo, String EstadoVuelo, int Vuelo,double Peso,double Tamaño,int turbinas){
        this.sillas = sillas;
        this.combustible= combustible;
        this.tipoVuelo = tipoVuelo;
        this.Vuelo = Vuelo;
        this.Peso = Peso;
        this.Tamaño = Tamaño;
        this.turbinas = turbinas;
        
    }

    Aviones() {
        
    }

   
    

 
    /**
     * @return the sillas
     */
    public int getSillas() {
        return sillas;
    }

    /**
     * @param sillas the sillas to set
     */
    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    /**
     * @return the combustible
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    /**
     * @return the tipoVuelo
     */
    public String getTipoVuelo() {
        return tipoVuelo;
    }

    /**
     * @param tipoVuelo the tipoVuelo to set
     */
    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    /**
     * @return the EstadoVuelo
     */
    public String getEstadoVuelo() {
        return EstadoVuelo;
    }

    /**
     * @param EstadoVuelo the EstadoVuelo to set
     */
    public void setEstadoVuelo(String EstadoVuelo) {
        this.EstadoVuelo = EstadoVuelo;
    }

    /**
     * @return the Vuelo
     */
    public int getVuelo() {
        return Vuelo;
    }

    /**
     * @param Vuelo the Vuelo to set
     */
    public void setVuelo(int Vuelo) {
        this.Vuelo = Vuelo;
    }

    /**
     * @return the Peso
     */
    public double getPeso() {
        return Peso;
    }

    /**
     * @param Peso the Peso to set
     */
    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    /**
     * @return the Tamaño
     */
    public double getTamaño() {
        return Tamaño;
    }

    /**
     * @param Tamaño the Tamaño to set
     */
    public void setTamaño(double Tamaño) {
        this.Tamaño = Tamaño;
    }


    public int getTurbinas() {
        return turbinas;
    }

    /**
     * @param turbinas the turbinas to set
     */
    public void setTurbinas(int turbinas) {
        this.turbinas = turbinas;
    }
    
}
