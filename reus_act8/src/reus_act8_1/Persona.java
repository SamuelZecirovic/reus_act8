package reus_act8_1;

public class Persona {

	private String nombre, DNI, sexo = "H";
	private int edad;
	private double peso, altura;
	
	public Persona(String dNI) {
		super();
		DNI = dNI;
	}
	
	public Persona(String nombre, String dNI, int edad, String sexo) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona(String nombre, String dNI, int edad, String sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", DNI=" + DNI + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	

	
	
}
