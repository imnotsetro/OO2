package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Twitter {
    private List<Usuario> usuarios;

    public Twitter() {
        this.usuarios = new ArrayList<Usuario>();
    }

    public void borrarUsuario(String name){
        this.usuarios.removeIf(u -> u.eliminarUsuario(name));
    }
}


