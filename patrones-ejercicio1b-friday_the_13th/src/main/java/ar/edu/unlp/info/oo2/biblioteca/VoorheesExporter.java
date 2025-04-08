package ar.edu.unlp.info.oo2.biblioteca;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.List;
import java.util.stream.Collectors;

public class VoorheesExporter {

	private String exportar(Socio socio) {
		String separator = System.lineSeparator();
		return "\t{" + separator
				+ "\t\t\"nombre\": \"" + socio.getNombre() + "\"," + separator
				+ "\t\t\"email\": \"" + socio.getEmail() + "\"," + separator
				+ "\t\t\"legajo\": \"" + socio.getLegajo() + "\"" + separator
				+ "\t}";
	}

	public String exportar(List<Socio> socios) throws JsonProcessingException {
		if (socios.isEmpty()) {
			return "[]";
		}
		String separator = System.lineSeparator();
		StringBuilder buffer = new StringBuilder("[" + separator);
		socios.forEach(socio -> {
			buffer.append(this.exportar(socio))
					.append(",")
					.append(separator);
		});
		// remueve la última coma y fin de línea
		buffer.setLength(buffer.length() - (separator.length() + 1));
		buffer.append(separator).append("]");
		return buffer.toString();
	}
}
