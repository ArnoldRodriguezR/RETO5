package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatosModelDB {

    Conexion conexion = new Conexion();
    Connection connection;
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    DatosSucursalPuestoTrabajo datosDB;

    public ArrayList<DatosSucursalPuestoTrabajo> getPuestoTrabajo(int idSucursal) {
        ArrayList listaPuestoTrabajo = new ArrayList();
        String query = "SELECT `idPuestoTrabajo`, `nombrePuestoTrabajo`, `salario`, `FK_idSucursal` FROM `puestotrabajo`INNER JOIN sucursal ON ( sucursal.idsucursal = puestotrabajo.fk_idsucursal )WHERE  sucursal.idsucursal = " +idSucursal;
        try {
            connection = conexion.getConnection();
            pst = connection.prepareStatement(query);
//            st = connection.createStatement();
           // pst.setInt(1, idSucursal);
            rs = pst.executeQuery(query);
            while (rs.next()) {
                datosDB = new DatosSucursalPuestoTrabajo();
                datosDB.setIdPuestoTrabajo(rs.getInt("idPuestoTrabajo"));
                datosDB.setNombrePuestoTrabajo(rs.getString("nombrePuestoTrabajo"));
                datosDB.setSalario(rs.getFloat("salario"));
                listaPuestoTrabajo.add(datosDB);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return listaPuestoTrabajo;
    }

    public ArrayList<DatosSucursalPuestoTrabajo> getSucursales() {
        ArrayList list = new ArrayList();
        String query = "SELECT idSucursal, nombreSucursal FROM sucursal;";
        try {
            connection = conexion.getConnection();
            pst = connection.prepareStatement(query);
            rs = pst.executeQuery(query);
            while (rs.next()) {
                datosDB = new DatosSucursalPuestoTrabajo();
                datosDB.setIdSucursal(rs.getInt("idSucursal"));
                datosDB.setNombreSucursal(rs.getString("nombreSucursal"));
                list.add(datosDB);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
}
