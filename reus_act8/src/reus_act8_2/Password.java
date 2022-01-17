package reus_act8_2;

import java.util.Random;

public class Password {

	private int longitud;
	private String contraseņa = "";
	
	public Password() {
		super();
		this.longitud = 8;
		this.contraseņa = "";
	}

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		Random claseRandom = new Random();
		for (int i = 0; i < longitud; i++) {
		contraseņa = contraseņa +claseRandom.nextInt(10);
		}
		this.contraseņa = contraseņa;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseņa=" + contraseņa + "]";
	}
	
	
	
	
}
