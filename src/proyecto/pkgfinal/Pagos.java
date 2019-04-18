package proyecto.pkgfinal;


public class Pagos {
    
    private String nombre;
    private Double cc;
    private String apellidos;
    private String correo;
    private int numero_tarjeta;
    private int codigo;
    private String metodo_pago;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cc
     */
    public double getCc() {
        return cc;
    }

    /**
     * @param cc the cc to set
     */
    public void setCc(double cc) {
        this.cc = cc;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the numero_tarjeta
     */
    public int getNumero_tarjeta() {
        return numero_tarjeta;
    }

    /**
     * @param numero_tarjeta the numero_tarjeta to set
     */
    public void setNumero_tarjeta(int numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the metodo_pago
     */
    public String getMetodo_pago() {
        return metodo_pago;
    }

    /**
     * @param metodo_pago the metodo_pago to set
     */
    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }
    
}
