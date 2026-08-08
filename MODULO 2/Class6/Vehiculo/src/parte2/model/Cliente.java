package parte2.model;

public class Cliente extends Usuario implements Notificable{
    private int puntos;

    public Cliente(String nombre, String email) {
        super(nombre, email);
       this.puntos = 0;
    }
    @Override
    public String panelInicio() {
    return "Panel de cliente";
    }
    @Override
    public String recibirNotificacion(String notificacion) {
    return"";    
    }
 
}
