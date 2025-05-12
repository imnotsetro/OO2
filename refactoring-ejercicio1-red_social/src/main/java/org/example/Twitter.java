package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Twitter {
    private List<Usuario> usuarios;

    public Twitter() {
        this.usuarios = new ArrayList<Usuario>();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void agregarUsuario(Usuario user){
        this.usuarios.add(user);
    }

    public void borrarUsuario(String name){
        this.usuarios.removeIf(u -> u.eliminarUsuario(name));
    }
}


