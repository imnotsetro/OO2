package org.example;

public class Tweet implements Post {
    private Usuario user;
    private String mensaje;

    public Tweet(Usuario user, String mensaje) {
        this.user = user;
        this.mensaje = mensaje;
    }

    public Usuario getUser() {
        return user;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esDe(String name) {
        return this.user.getScreenName().equals(name);
    }
}
