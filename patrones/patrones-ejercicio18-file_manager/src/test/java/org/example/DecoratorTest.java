package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    @Test
    public void testDecoratorNombre() {
        FileOO2 file = new FileOO2(
                "archivo",
                "txt",
                "15KB",
                LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 1, 10),
                "rw-r--r--"
        );

        DecoratorNombre decorator = new DecoratorNombre();
        decorator.setComponente(file);

        String expected = " Nombre: archivo";
        assertEquals(expected, decorator.prettyPrint());
    }

    @Test
    public void testDecoratorTamanio() {
        FileOO2 file = new FileOO2(
                "archivo",
                "txt",
                "15KB",
                LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 1, 10),
                "rw-r--r--"
        );

        DecoratorTamanio decorator = new DecoratorTamanio();
        decorator.setComponente(file);

        String expected = " Tamaño: 15KB";
        assertEquals(expected, decorator.prettyPrint());
    }

    @Test
    public void testDecoratorFechaCreacion() {
        FileOO2 file = new FileOO2(
                "archivo",
                "txt",
                "15KB",
                LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 1, 10),
                "rw-r--r--"
        );

        DecoratorFechaCreacion decorator = new DecoratorFechaCreacion();
        decorator.setComponente(file);

        String expected = " Fecha Creacion: 2023-01-01";
        assertEquals(expected, decorator.prettyPrint());
    }

    @Test
    public void testDecoratorFechaModificacion() {
        FileOO2 file = new FileOO2(
                "archivo",
                "txt",
                "15KB",
                LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 1, 10),
                "rw-r--r--"
        );

        DecoratorFechaModificacion decorator = new DecoratorFechaModificacion();
        decorator.setComponente(file);

        String expected = " Fecha Modificacion: 2023-01-10";
        assertEquals(expected, decorator.prettyPrint());
    }

    @Test
    public void testDecoratorExtencion() {
        FileOO2 file = new FileOO2(
                "archivo",
                "txt",
                "15KB",
                LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 1, 10),
                "rw-r--r--"
        );

        DecoratorExtencion decorator = new DecoratorExtencion();
        decorator.setComponente(file);

        String expected = " Extencion: txt";
        assertEquals(expected, decorator.prettyPrint());
    }

    @Test
    public void testDecoratorPermisos() {
        FileOO2 file = new FileOO2(
                "archivo",
                "txt",
                "15KB",
                LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 1, 10),
                "rw-r--r--"
        );

        DecoratorPermisos decorator = new DecoratorPermisos();
        decorator.setComponente(file);

        String expected = " Permisos: rw-r--r--";
        assertEquals(expected, decorator.prettyPrint());
    }
}