package dao;

import model.Socio;

import java.util.List;

public interface SocioDAO {
    void insertar(Socio socio);
    List<Socio> socio();
    void actualizar (Socio socio);
    void eliminar(int id);
}
