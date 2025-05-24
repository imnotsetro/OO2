package org.example.parte1A;

import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseProxyAccess implements DatabaseAccess {
    private DatabaseAccess database;
    private Usuario usuario;
    private static final Logger logger = Logger.getLogger(DatabaseProxyAccess.class.getName());

    public DatabaseProxyAccess(DatabaseAccess database, Usuario usuario) {
        this.database = database;
        this.usuario = usuario;
    }


    public Collection<String> getSearchResults(String queryString) {
        if (usuario.isAutenticado()) {
            logger.log(Level.INFO, "Acceso válido para búsqueda en la base de datos: {0}", queryString);
            return this.database.getSearchResults(queryString);
        } else {
            logger.log(Level.SEVERE, "Acceso inválido para búsqueda en la base de datos: {0}", queryString);
            return null;
        }
    }

    public int insertNewRow(List<String> rowData) {
        if (usuario.isAutenticado()) {
            logger.log(Level.WARNING, "Acceso válido para inserción en la base de datos: {0}", rowData);
            return this.database.insertNewRow(rowData);
        } else {
            logger.log(Level.SEVERE, "Acceso inválido para inserción en la base de datos: {0}", rowData);
            return -1;
        }
    }
}
