package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

	static double descuentoJur = 0.15;
	static double descuentoFis = 0;

	public boolean agregarNumeroTelefono(String str) {
		/*
			Bad Smell: Envidia de atributos
			Refactoring: Move method
		 */
		return this.guia.buscarNumero(str);
	}

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}

	/*
			Bad Smell: Codigo duplicado y uso de if's para creacion de tipos
			de clientes
			Refactoring: Replace Conditional with Polymorphism
		 */
	public Cliente registrarUsuarioFisico(String dni, String nombre) {
		/*
			Se debe cambiar el registro para que admita
			los usuarios ahora con clases tipo

			Bad Smell: Uso de seters cuando existe el contructor que es una herramienta
			para estos casos (reinventando la rueda) ademas de codigo duplicado
			Refactoring: Form template method
		 */

		Cliente var = new ClienteFisico(nombre, this.obtenerNumeroLibre(), dni);
		clientes.add(var);
		return var;
	}

	public Cliente registrarUsuarioJuridico(String cuit, String nombre) {
		/*
			Se debe cambiar el registro para que admita
			los usuarios ahora con clases tipo

			Bad Smell: Uso de seters cuando existe el contructor que es una herramienta
			para estos casos (reinventando la rueda) ademas de codigo duplicado
			Refactoring: Form template method
		 */

		Cliente var = new ClienteJuridico(nombre, this.obtenerNumeroLibre(), cuit);
		clientes.add(var);
		return var;
	}

	public Llamada registrarLlamada(Cliente origen, Cliente destino, TipoLlamada t, int duracion) {
		Llamada llamada = new Llamada(t, origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		llamadas.add(llamada);
		origen.llamadas.add(llamada);
		return llamada;
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) {
		double c = 0;
		for (Llamada l : cliente.llamadas) {
			/*
			i) Bad Smeel: Envidia de atributos, pide atributos que no son de la clase
			ii) Refactoring: Move method
			*/
			double auxc = 0;
			auxc += l.calcularMontoTotalLlamadas();

			/*
			i) Bad Smeel: Envidia de atributos, pide atributos que no son de la clase
			ii) Refactoring: Move method
			*/
			auxc -= cliente.getDescuento(auxc, descuentoFis, descuentoJur);
			c += auxc;
		}
		return c;
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}
