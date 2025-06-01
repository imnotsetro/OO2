package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();
	private TipoGenerador tipoGenerador = new GeneradorUltimo();

	public SortedSet<String> getLineas() {
		return lineas;
	}

	// Simplificacion de codigo
	public boolean buscarNumero(String str){
		if (!this.lineas.contains(str)) {
			this.lineas.add(str);
			return true;
		}
		return false;
	}

	/*
		i) Bad Smeel: Uso de case para los tipos de generadores
 		ii) Refactoring: Replace Conditional with Polymorphism
	 */
	public String obtenerNumeroLibre() {
		return this.tipoGenerador.obtenerNumeroLibre(this.lineas);
	}

	/*
		Es necesario cambiar el tipo de generador
	 */
	public void cambiarTipoGenerador(TipoGenerador tipo) {
		this.tipoGenerador = tipo;
	}
}
