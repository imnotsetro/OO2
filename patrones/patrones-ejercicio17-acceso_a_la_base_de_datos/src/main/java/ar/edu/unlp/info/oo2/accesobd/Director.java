package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class Director {
    DatabaseAccess database;

    public Director(DatabaseAccess database) {
        this.database = database;
    }

    public Collection<String> getSearchResults(String queryString, Boolean estado) {
        if (estado) {
            return this.database.getSearchResults(queryString);
        } else {
            // Se avisa al usuario que no esta autenticado
            System.out.println("No se puede acceder a la base de datos sin autenticarse");
            return null;
        }
    }

    public int insertNewRow(List<String> rowData, Boolean estado) {
        if (estado) {
            return this.database.insertNewRow(rowData);
        } else {
            // Se avisa al usuario que no esta autenticado
            System.out.println("No se puede acceder a la base de datos sin autenticarse");
            return -1;
        }
    }
}
