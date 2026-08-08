package parte2.controller;

import parte2.model.Administrador;
import parte2.model.Cliente;
import parte2.model.Usuario;
import parte2.model.Vendedor;

public class Parte2 {
public static void main(String[] args) {
    Usuario[] usuarios = {
            new Cliente("Ana", "ana@mail.com"),
            new Administrador("Luis", "luis@mail.com",0),
            new Vendedor("Marta", "marta@mail.com","123")
        };

        for (Usuario u : usuarios) {
            System.out.println(u.getNombre() + " -> " + u.panelInicio());
        }
    }
}

