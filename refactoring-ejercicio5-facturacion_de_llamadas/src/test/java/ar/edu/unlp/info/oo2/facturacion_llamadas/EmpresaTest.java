package ar.edu.unlp.info.oo2.facturacion_llamadas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {
	Empresa sistema;

	@BeforeEach
	public void setUp() {
		this.sistema = new Empresa();
		this.sistema.agregarNumeroTelefono("2214444554");
		this.sistema.agregarNumeroTelefono("2214444555");
		this.sistema.agregarNumeroTelefono("2214444556");
		this.sistema.agregarNumeroTelefono("2214444557");
		this.sistema.agregarNumeroTelefono("2214444558");
		this.sistema.agregarNumeroTelefono("2214444559");
	}

	@Test
	void testcalcularMontoTotalLlamadas() {
		Cliente emisorPersonaFisca = sistema.registrarUsuarioFisico("11555666", "Brendan Eich");
		Cliente remitentePersonaFisica = sistema.registrarUsuarioFisico("00000001", "Doug Lea");
		Cliente emisorPersonaJuridica = sistema.registrarUsuarioJuridico("17555222", "Nvidia Corp");
		Cliente remitentePersonaJuridica = sistema.registrarUsuarioJuridico("25765432", "Sun Microsystems");

		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaFisica, new LlamadaNacional(), 10);
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaFisica, new LlamadaInternacional(), 8);
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaJuridica, new LlamadaNacional(), 5);
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaJuridica, new LlamadaInternacional(), 7);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaFisica, new LlamadaNacional(), 15);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaFisica, new LlamadaInternacional(), 45);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaJuridica, new LlamadaNacional(), 13);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaJuridica, new LlamadaInternacional(), 17);

		assertEquals(11454.64, this.sistema.calcularMontoTotalLlamadas(emisorPersonaFisca), 0.01);
		assertEquals(2445.40, this.sistema.calcularMontoTotalLlamadas(emisorPersonaJuridica), 0.01);
		assertEquals(0, this.sistema.calcularMontoTotalLlamadas(remitentePersonaFisica));
		assertEquals(0, this.sistema.calcularMontoTotalLlamadas(remitentePersonaJuridica));
	}

	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 0);
		this.sistema.agregarNumeroTelefono("2214444558"); 
		Cliente nuevaPersona = this.sistema.registrarUsuarioFisico("2444555","Alan Turing");

		assertEquals(1, this.sistema.cantidadDeUsuarios());
		assertTrue(this.sistema.existeUsuario(nuevaPersona));
	}

	@Test
	void obtenerNumeroLibre() {
		// por defecto es el ultimo
		assertEquals("2214444559", this.sistema.obtenerNumeroLibre());

		this.sistema.getGestorNumeros().cambiarTipoGenerador(new GeneradorPrimero());
		assertEquals("2214444554", this.sistema.obtenerNumeroLibre());

		this.sistema.getGestorNumeros().cambiarTipoGenerador(new GeneradorRandom());
		assertNotNull(this.sistema.obtenerNumeroLibre());
	}
}
