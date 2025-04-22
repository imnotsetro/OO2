package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class Usuario {
    private boolean autenticado;
    private Director coneccion;

    public Usuario(boolean autenticado, Director coneccion) {
        this.autenticado = autenticado;
        this.coneccion = coneccion;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

    public Director getConeccion() {
        return coneccion;
    }

    public void setConeccion(Director coneccion) {
        this.coneccion = coneccion;
    }

    public Collection<String> getSearchResults(String queryString) {
        return coneccion.getSearchResults(queryString, this.autenticado);
    }

    public int insertNewRow(List<String> rowData) {
        return coneccion.insertNewRow(rowData, this.autenticado);
    }
}
