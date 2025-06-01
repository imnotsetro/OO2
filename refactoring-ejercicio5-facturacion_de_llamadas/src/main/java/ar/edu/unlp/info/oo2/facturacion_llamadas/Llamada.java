package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Llamada {
	private TipoLlamada tipoDeLlamada;
	private String origen;
	private String destino;
	private int duracion;

	public Llamada(TipoLlamada tipoLlamada, String origen, String destino, int duracion) {
		this.tipoDeLlamada = tipoLlamada;
		this.origen= origen;
		this.destino= destino;
		this.duracion = duracion;
	}

	public TipoLlamada getTipoDeLlamada() {
		return tipoDeLlamada;
	}

	public String getRemitente() {
		return destino;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public String getOrigen() {
		return origen;
	}

	/*
		i) Bad Smeel: Uso de case para los tipos de generadores
 		ii) Refactoring: Replace Conditional with Polymorphism
	 */
	public double calcularMontoTotalLlamadas(){
		return this.tipoDeLlamada.getPrecio(this.duracion);
	}
}
