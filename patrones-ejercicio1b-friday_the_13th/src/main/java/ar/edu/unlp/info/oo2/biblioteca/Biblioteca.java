package ar.edu.unlp.info.oo2.biblioteca;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Socio> socios;
	private VoorheesExporter exporter;

	public Biblioteca() {
		socios = new ArrayList<>();
		exporter= new VoorheesExporter();
	}

	public List<Socio> getSocios() {
		return socios;
	}

	public void setSocios(List<Socio> socios) {
		this.socios = socios;
	}

	public VoorheesExporter getExporter() {
		return exporter;
	}

	public void setExporter(VoorheesExporter exporter) {
		this.exporter = exporter;
	}

	public void agregarSocio(Socio socio) {
		socios.add(socio);
	}

	/**
	 * Retorna la representación JSON de la colección de socios.
	 */
	public String exportarSocios() throws JsonProcessingException {
		return exporter.exportar(socios);
	}
}
