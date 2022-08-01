package modelo;

public class Gerente extends Empleado{
    private float salario;

    public Gerente(int idEmp, String nombre, String apellidos, String tipoDocumento, String documento, String correo, int idPuestoTrabajo, float salario) {
        super(idEmp, nombre, apellidos, tipoDocumento, documento, correo, idPuestoTrabajo);
        this.salario = salario;
        
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Gerente{" + "salario=" + salario + '}';
    }
    
}
