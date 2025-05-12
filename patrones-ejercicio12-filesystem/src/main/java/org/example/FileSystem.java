package org.example;

import java.util.List;


/**
 * No se como hacerlo, salta error por todos lados y no tiene
 * sentido como incorporar algun estado o estrategia en esta
 * clase
 */
public class FileSystem {
    private List<Elemento> contenido;

    public FileSystem(List<Elemento> contenido) {
        this.contenido = contenido;
    }

    public List<Elemento> getContenido() {
        return contenido;
    }

    public void setContenido(List<Elemento> contenido) {
        this.contenido = contenido;
    }

    /**
     * Retorna el espacio total ocupado, incluyendo todo su contenido.
     */
    public int tamanoTotalOcupado(){
        return contenido.stream().mapToInt(Elemento::getTamano).sum();
    }

    /**
     * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del
     * filesystem
     */
    public Archivo archivoMasGrande(){
        return contenido.stream()
                .filter(e -> e instanceof Archivo)
                .map(e -> (Archivo) e)
                .max((a1, a2) -> Integer.compare(a1.getTamano(), a2.getTamano()))
                .orElse(null);
    }

    /**
     * Retorna el archivo con fecha de creación más reciente en cualquier nivel
     * del filesystem
     */
    public Archivo archivoMasNuevo(){
        return contenido.stream()
                .filter(e -> e instanceof Archivo)
                .map(e -> (Archivo) e)
                .max((a1, a2) -> a1.getFechaCreacion().compareTo(a2.getFechaCreacion()))
                .orElse(null);
    }

    /**
     * Retorna el primer elemento con el nombre solicitado contenido en cualquier
     * nivel del filesystem
     */
    public Elemento buscar(String nombre) {
        return null;
        // No se como hacerlo
    }

    /**
     * Retorna la lista con los elementos que coinciden con el nombre solicitado
     * contenido en cualquier nivel del filesystem
     */
    public List<Elemento> buscarTodos(String nombre){
        return contenido.stream()
                .filter(e -> e.getNombre().equals(nombre))
                .toList();
    }

    /**
     * Retorna un String con los nombres de los elementos contenidos en todos los
     * niveles del filesystem. De cada elemento debe retornar el path completo
     * (similar al comando pwd de linux) siguiendo el modelo presentado a
     * continuación
     /Directorio A
     /Directorio A/Directorio A.1
     /Directorio A/Directorio A.1/Directorio A.1.1
     /Directorio A/Directorio A.1/Directorio A.1.2
     /Directorio A/Directorio A.2
     /Directorio B
     */
    public String listadoDeContenido(){
        StringBuilder sb = new StringBuilder();
        for (Elemento e : contenido) {
            sb.append(e.getNombre()).append("\n");
            if (e instanceof Directorio) {
                Directorio dir = (Directorio) e;
                for (Elemento subElemento : dir.getContenido()) {
                    sb.append("/").append(subElemento.getNombre()).append("\n");
                }
            }
        }
        return sb.toString();
    }

}
