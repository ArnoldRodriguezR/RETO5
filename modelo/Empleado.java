package modelo;

public class Empleado extends Persona{
    protected int idPuestoTrabajo;
    protected String puestoTrabajo;

    public Empleado(int idEmp, String nombre, String apellidos, String tipoDocumento, String documento, String correo, int idPuestoTrabajo) {
        super(idEmp, nombre, apellidos, tipoDocumento, documento, correo);
        this.idPuestoTrabajo = idPuestoTrabajo;
    }

    public int getIdPuestoTrabajo() {
        return idPuestoTrabajo;
    }

    public void setIdPuestoTrabajo(int idPuestoTrabajo) {
        this.idPuestoTrabajo = idPuestoTrabajo;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    
    
}
