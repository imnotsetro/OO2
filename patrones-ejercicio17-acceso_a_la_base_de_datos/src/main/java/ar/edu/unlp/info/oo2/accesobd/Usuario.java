package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class Usuario {
    private boolean autenticado;
    private DatabaseProxyAccess database;

    public Usuario(boolean autenticado) {
        this.autenticado = autenticado;
        this.database = new DatabaseProxyAccess(new DatabaseRealAccess(), this);
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

    public DatabaseProxyAccess getDatabase() {
        return database;
    }

    public void setDatabase(DatabaseProxyAccess database) {
        this.database = database;
    }

    public Collection<String> getSearchResults(String queryString) {
        return database.getSearchResults(queryString);
    }

    public int insertNewRow(List<String> rowData) {
        return database.insertNewRow(rowData);
    }
}
