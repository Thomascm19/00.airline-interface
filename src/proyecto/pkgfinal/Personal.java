package proyecto.pkgfinal;


public class Personal {
    private int pilotos;
    private int oficiales;
    private int comisarios;
    private int azafatas;
    private int pasajeros;

    public Personal(int pilotos, int oficiales, int comisarios, int azafatas, int pasajeros){
        this.pilotos = pilotos ;
        this.oficiales= oficiales;
        this.comisarios = comisarios;
        this.azafatas = azafatas;
        this.pasajeros = pasajeros;
  
}

    Personal() {
        
    }
    


    /**
     * @return the pilotos
     */
    public int getPilotos() {
        return pilotos;
    }

    /**
     * @param pilotos the pilotos to set
     */
    public void setPilotos(int pilotos) {
        this.pilotos = pilotos;
    }

    /**
     * @return the oficiales
     */
    public int getOficiales() {
        return oficiales;
    }

    /**
     * @param oficiales the oficiales to set
     */
    public void setOficiales(int oficiales) {
        this.oficiales = oficiales;
    }

    /**
     * @return the comisarios
     */
    public int getComisarios() {
        return comisarios;
    }

    /**
     * @param comisarios the comisarios to set
     */
    public void setComisarios(int comisarios) {
        this.comisarios = comisarios;
    }

    /**
     * @return the azafatas
     */
    public int getAzafatas() {
        return azafatas;
    }

    /**
     * @param azafatas the azafatas to set
     */
    public void setAzafatas(int azafatas) {
        this.azafatas = azafatas;
    }

    /**
     * @return the pasajeros
     */
    public int getPasajeros() {
        return pasajeros;
    }

    /**
     * @param pasajeros the pasajeros to set
     */
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    
    
    
}
