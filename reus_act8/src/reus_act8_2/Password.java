package reus_act8_2;

import java.util.Random;

public class Password {

	private int longitud;
	private String contraseña = "";
	
	public Password() {
		super();
		this.longitud = 8;
		this.contraseña = "";
	}

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		Random claseRandom = new Random();
		for (int i = 0; i < longitud; i++) {
		contraseña = contraseña +claseRandom.nextInt(10);
		}
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	
	
	
	
}
