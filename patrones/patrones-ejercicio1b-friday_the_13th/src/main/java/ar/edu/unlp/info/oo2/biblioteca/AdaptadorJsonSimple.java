package ar.edu.unlp.info.oo2.biblioteca;

import org.json.simple.JSONArray;

import java.util.List;

public class AdaptadorJsonSimple extends VoorheesExporter{

    public String exportar(List<Socio> socios) {
        JSONArray jsonArray = new JSONArray();
        socios.stream().map(Socio::exportarSocio).forEach(jsonArray::add);
        return jsonArray.toString();
    }
}
