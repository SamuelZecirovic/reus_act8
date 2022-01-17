package reus_act8_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona("12345678A");	
		Persona p2 = new Persona("persona1","12345678A",11,"H");
		Persona p3 = new Persona("persona1","12345678A",11,"H",30,140);

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

	}

}
