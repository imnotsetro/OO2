package ar.edu.unlp.info.oo2.biblioteca;

import org.json.simple.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.LinkedHashMap;

public class Socio {
	private String nombre;
	private String legajo;
	private String email;


	public Socio(String nombre, String email, String legajo) {
		this.nombre = nombre;
		this.email = email;
		this.legajo = legajo;
	}

	public JSONObject exportarSocio(){
		JSONObject obj = new JSONObject();
		obj.put("email", this.getEmail());
		obj.put("nombre", this.getNombre());
		obj.put("legajo", this.getLegajo());
		return obj;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
}
