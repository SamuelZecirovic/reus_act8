package reus_act8_4;

public class Serie {

	private String titulo, creador, genero;
	private int numtemp = 3;
	private boolean entregado = false;
	
	public Serie() {
		super();
		this.titulo = titulo;
		this.creador = creador;
		this.numtemp = numtemp;
		this.entregado = entregado;
		this.genero = genero;
	}

	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;

	}

	public Serie(String titulo, String creador, int numtemp, String genero) {
		super();
		this.titulo = titulo;
		this.creador = creador;
		this.numtemp = numtemp;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", creador=" + creador + ", numtemp=" + numtemp + ", entregado=" + entregado
				+ ", sexo=" + genero + "]";
	}

	
	
	
	
	
}
