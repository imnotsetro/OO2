package ar.edu.unlp.info.oo2.biblioteca;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.List;
import java.util.stream.Collectors;

public class VoorheesExporter {

	public String exportarJackson(List<Socio> socios) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(socios);
	}

	public String exportar(List<Socio> socios) {
		JSONArray jsonArray = new JSONArray();
		socios.stream().map( socio -> socio.exportarSocio()).forEach(jsonArray::add);
		return jsonArray.toString();
	}
}
