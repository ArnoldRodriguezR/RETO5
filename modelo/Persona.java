package modelo;

public class Persona {
    private int idEmp;
    private String nombre;
    private String apellidos;
    private String tipoDocumento;
    private String documento;
    private String correo;

    public Persona(int idEmp, String nombre, String apellidos, String tipoDocumento, String documento, String correo) {
        this.idEmp = idEmp;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.correo = correo;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" + "idEmp=" + idEmp + ", nombre=" + nombre + ", apellidos=" + apellidos + ", tipoDocumento=" + tipoDocumento + ", documento=" + documento + ", correo=" + correo + '}';
    }

}
