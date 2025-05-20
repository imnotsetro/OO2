package ar.edu.unlp.info.oo2.accesobd.parteI;

import java.util.Collection;
import java.util.List;

public class DatabaseProxyAccess implements DatabaseAccess {
    private DatabaseAccess database;
    private Usuario usuario;

    public DatabaseProxyAccess(DatabaseAccess database, Usuario usuario) {
        this.database = database;
        this.usuario = usuario;
    }

    public Collection<String> getSearchResults(String queryString) {
        if (usuario.isAutenticado()) {
            return this.database.getSearchResults(queryString);
        } else {
            // Se avisa al usuario que no esta autenticado
            System.out.println("No se puede acceder a la base de datos sin autenticarse");
            return null;
        }
    }

    public int insertNewRow(List<String> rowData) {
        if (usuario.isAutenticado()) {
            return this.database.insertNewRow(rowData);
        } else {
            // Se avisa al usuario que no esta autenticado
            System.out.println("No se puede acceder a la base de datos sin autenticarse");
            return -1;
        }
    }
}
