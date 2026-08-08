import Config.ConexionBD;
import dao.SocioDAO;
import dao.SocioDAOImpl;
import model.Socio;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class Principal {
    static void main(String[] args) {
        try(Connection con=ConexionBD.obtenerConexion()){
            System.out.println("conectado");
        } catch (SQLException e) {
            System.out.println("error");
        }
         SocioDAO dao=new SocioDAOImpl();
        System.out.println("----AGREGAR---");
//        dao.insertar(new Socio("jhoja"));
        dao.insertar(new Socio("yubri"));
      dao.insertar(new Socio("yucelis"));
       System.out.println("----MOSTRAR----");
        System.out.println(dao.socio());

    }
}
