package reus_act8_2;

import java.util.Random;

public class Password {

	private int longitud;
	private String contrase�a = "";
	
	public Password() {
		super();
		this.longitud = 8;
		this.contrase�a = "";
	}

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		Random claseRandom = new Random();
		for (int i = 0; i < longitud; i++) {
		contrase�a = contrase�a +claseRandom.nextInt(10);
		}
		this.contrase�a = contrase�a;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
	}
	
	
	
	
}
