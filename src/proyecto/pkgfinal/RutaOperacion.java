package proyecto.pkgfinal;


public class RutaOperacion {
    private int Destinos;
    private int OtrosVuelos;
    private int Analistas;
    private int Calculos;
    private int Asociaciones;
    private int planos;
    
        public RutaOperacion(int Destinos, int OtrosVuelos, int Analistas, int Calculos, int Asociaciones,int planos){
        this.Destinos = Destinos;
        this.OtrosVuelos= OtrosVuelos;
        this.Analistas = Analistas;
        this.Calculos = Calculos;
        this.Asociaciones = Asociaciones;
        this.planos = planos;
        
        
 }
            RutaOperacion() {
        
    }

    /**
     * @return the Destinos
     */
    public int getDestinos() {
        return Destinos;
    }

    /**
     * @param Destinos the Destinos to set
     */
    public void setDestinos(int Destinos) {
        this.Destinos = Destinos;
    }

    /**
     * @return the OtrosVuelos
     */
    public int getOtrosVuelos() {
        return OtrosVuelos;
    }

    /**
     * @param OtrosVuelos the OtrosVuelos to set
     */
    public void setOtrosVuelos(int OtrosVuelos) {
        this.OtrosVuelos = OtrosVuelos;
    }

    /**
     * @return the Analistas
     */
    public int getAnalistas() {
        return Analistas;
    }

    /**
     * @param Analistas the Analistas to set
     */
    public void setAnalistas(int Analistas) {
        this.Analistas = Analistas;
    }

    /**
     * @return the Calculos
     */
    public int getCalculos() {
        return Calculos;
    }

    /**
     * @param Calculos the Calculos to set
     */
    public void setCalculos(int Calculos) {
        this.Calculos = Calculos;
    }

    /**
     * @return the Asociaciones
     */
    public int getAsociaciones() {
        return Asociaciones;
    }

    /**
     * @param Asociaciones the Asociaciones to set
     */
    public void setAsociaciones(int Asociaciones) {
        this.Asociaciones = Asociaciones;
    }

    /**
     * @return the planos
     */
    public int getPlanos() {
        return planos;
    }

    /**
     * @param planos the planos to set
     */
    public void setPlanos(int planos) {
        this.planos = planos;
    }
}
