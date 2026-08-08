package dao;

import Config.ConexionBD;
import model.Socio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SocioDAOImpl implements SocioDAO {

    @Override
    public void insertar(Socio socio) {
        String sql="INSERT INTO socios (nombre) VALUES(?)";
        System.out.println("hola");
        try (Connection conexion= ConexionBD.obtenerConexion();
             PreparedStatement ps= conexion.prepareStatement(sql)){
         ps.setString(1,"jhoja");
         int fila=ps.executeUpdate();
            System.out.println("fila agregadas: "+ fila);
        } catch (SQLException e) {
            System.out.println("error de conexion");
        }
    }

    @Override
    public List<Socio> socio() {
        List<Socio> soc=new ArrayList<>();
      String sql="SELECT id_socio,nombre,plan FROM socios";
      try(Connection con=ConexionBD.obtenerConexion();
      PreparedStatement ps=con.prepareStatement(sql);
          ResultSet rs= ps.executeQuery()){
    while (rs.next()){
        Socio socio= new Socio(
                rs.getInt("id_socio"),
                rs.getString("nombre"),
                rs.getString("plan")

                );
    soc.add(socio);
    }
      }catch (SQLException e){
          System.out.println("Error al listar: " + e.getMessage());
      }
      return soc;
    }

    @Override
    public void actualizar(Socio socio) {

    }

    @Override
    public void eliminar(int id) {

    }
}
